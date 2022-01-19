package com.yedam.app.Main;

import java.util.Scanner;

import com.yedam.app.MemoDAO.Memo;
import com.yedam.app.MemoDAO.MemoDAO;
import com.yedam.app.MemoDAO.MemoDAOImpl;

public class MemoFrame {
	private Scanner scanner = new Scanner(System.in);
	private MemoDAO memoDAO = MemoDAOImpl.getInstance();
	
	public MemoFrame() {
		while(true) {
			//메뉴출력
			menuPrint();
			//메뉴선택
			int menuNo = menuSelect();
			//메뉴별실행
			if(menuNo == 1) {
				//등록
				insertMemo();
			}else if(menuNo == 2) {
				//수정
				updateMemo();
			}else if(menuNo == 3) {
				//삭제
				deleteMemo();
			}else if(menuNo == 4) {
				//메모조회
				selectMemo();
			}else if(menuNo == 5) {
				//전체조회
				selectAll();
			}else if(menuNo == 9) {
				//종료
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.메모조회 | 5.전체조회 | 9.종료");
		System.out.println("====================================================");
		System.out.println("선택 >> ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());

		} catch (Exception e) {
			System.out.println("없는메뉴입니다.");
		}
		return menuNo;
	}
	
	//등록
	
	public void insertMemo() {
		Memo memo = inputMemoInfo();
		memoDAO.insert(memo);
	}
	
	public Memo inputMemoInfo() {
		Memo memo = new Memo();
		System.out.println("메모번호>>");
		memo.setMemoId(Integer.parseInt(scanner.nextLine()));
		System.out.println("메모제목>>");
		memo.setMemoTitle(scanner.nextLine());
		System.out.println("메모작성자");
		memo.setMemoWriter(scanner.nextLine());
		System.out.println("메모내용>>");
		memo.setMemocontent(scanner.nextLine());
		return memo;
		
	}
	
	public void updateMemo() {
		Memo memo = inptupMemoInfo();
		memoDAO.update(memo);
	}
	
	public Memo inptupMemoInfo() {
		Memo memo = new Memo();
		
		System.out.println("메모번호>>");
		memo.setMemoId(Integer.parseInt(scanner.nextLine()));
		System.out.println("메모제목>>");
		memo.setMemoTitle(scanner.nextLine());
		System.out.println("메모작성자>>");
		memo.setMemoWriter(scanner.nextLine());
		System.out.println("메모내용>>");
		memo.setMemocontent(scanner.nextLine());
		
	}
	
	public void deleteMemo() {
		int memoId = inputdelMemoId();
		
		memoDAO.delete(memoId);
		
	}
		
	public int inputdelMemoId() {
		System.out.println("메모번호>>");
		int memoId = Integer.parseInt(scanner.nextLine());
		return memoId;
	}
	
	public void selectMemo() {
		int memoId = inputMemoName();
		
		Memo memo = memoDAO.selectMemo(memoId);
		
		if(memo != null) {
			System.out.println(memo);
		}else {
			System.out.println("해당 번호가 없습니다.");
		}
	}
	
	public int inputMemoName() {
		System.out.println("메모번호>>");
		return scanner.nextLine();
	}
	
	public void selectAll() {
		List<Memo>list = memoDAO.selectAll();
		for(Memo memo : list) {
			System.out.println(memo);
		}
	}
	
	public void end() {
		System.out.println("프로그램을 종료 합니다.");
	}
}
