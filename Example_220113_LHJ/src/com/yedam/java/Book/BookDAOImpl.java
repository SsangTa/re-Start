package com.yedam.java.Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.java.common.DAO;

public class BookDAOImpl extends DAO implements BookDAO {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	
	private static BookDAO instance = new BookDAOImpl();
	private BookDAOImpl () {}
	public static BookDAO getInstance(){
		return instance;
	}
	
	
	
	@Override
	public List<Book> selectAll() {
		List<Book>list = new ArrayList();
		try {
			connect();
			String select = "SELECT * FROM book ORDER BY book_name";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Book boo = new Book();
				boo.setBookName(rs.getString("book_name"));
				boo.setBookWriter(rs.getString("book_writer"));
				boo.setBookContent(rs.getString("book_content"));
				boo.setBookRental(rs.getInt("book_rental"));
				
				list.add(boo);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Book selectOne(String bookName) {
		Book boo = null;
		try {
			connect();
			String select = "SELECT * FROM book WHERE book_name = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, bookName);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				boo = new Book();
				boo.setBookName(rs.getString("book_name"));
				boo.setBookWriter(rs.getString("book_writer"));
				boo.setBookContent(rs.getString("book_content"));
				boo.setBookRental(rs.getInt("book_rental"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return boo;
	}

	@Override
	public void insertBook(Book book) {
		try {
			connect();
			String insert = "INSERT INTO book VALUES (?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setString(3, book.getBookContent());
			pstmt.setInt(4, book.getBookRental());
			
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 등록되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void searchBook(Book book) {
		
		try {
			connect();
			String select = "SELECT * FROM book WHERE book_name = ? AND book_content = ? ";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookContent());

			String word = scanner.next();
			
			if(word !=null) {
				System.out.printf(book.getBookName(),book.getBookWriter(),book.getBookContent(),book.getBookRental());
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void rentalBook(Book book) {
		try {
			connect();
			String update = "UPDATE book SET book_rental = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, book.getBookRental());
			int bookRental = 0;
			if(bookRental == 0) {
				System.out.println("대여가능합니다.");
			}else if(bookRental == 1){
				System.out.println("해당 책은 대여중입니다.");
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
