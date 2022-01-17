package com.yedam.java.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.java.Free.Free;
import com.yedam.java.Free.FreeDAO;
import com.yedam.java.Free.FreeDAOImpl;
import com.yedam.java.Signup.Signup;
import com.yedam.java.Signup.SignupDAO;
import com.yedam.java.Signup.SignupDAOImpl;
import com.yedam.java.notice.Notice;
import com.yedam.java.notice.NoticeDAO;
import com.yedam.java.notice.NoticeDAOImpl;

public class SignupFrame {
	private SignupDAO signDAO = SignupDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	private Signup signup = new Signup();
	
	private FreeDAO freeDAO = FreeDAOImpl.getinstance();
	private NoticeDAO noticeDAO = NoticeDAOImpl.getInstance();
	private List<Notice> list = new ArrayList<>();
	
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분");
	
	public SignupFrame() {
		while(true) {
			
			menuPrint();
			
			int menuNo = menuSelect();
			if(menuNo == 1) {
				//회원가입
				insertSignup();
			}else if(menuNo == 2) {
				//로그인
				login();
			}else if(menuNo == 3) {
				//관리자로그인
				loginAdmin();
			}else if(menuNo == 4) {
				//자유게시판
				selectAll();
			}else if(menuNo == 5) {
				//종료
				end();
				break;
			}
		}
	}
	
/*	public void Free() {
		while(true) {
			
			menuPrint1();
			int menuNo = menuSelect();
			if(menuNo == 1) {
				//글쓰기
				insertFree();
			}else if (menuNo == 2) {
				//전체글조회
				selectAll();
			}else if (menuNo == 3) {
				//글찾기
				selectsearchFree();
			}else if (menuNo == 4) {
				//글삭제
				deleteFree();
			}else if (menuNo == 5) {
				//종료
				end();
				break;
			}
		}
	}
*/	
	public void menuPrint() {
		
		
		System.out.println();
		System.out.println("------------------------------공지사항------------------------------");
		selectAllno();
		System.out.println();
		
		System.out.println("===========================================================");
		System.out.println("1.회원가입 | 2.로그인 | 3.관리자 로그인 | 4. 자유게시판(읽기) | 5. 종료");
		System.out.println("===========================================================");
		System.out.println("선택 > ");
	}
	
	public void menuPrint1() {
		
		System.out.println();
		System.out.println("------------------------------공지사항------------------------------");
		selectAllno();
		System.out.println();
		
		System.out.println("=============================================");
		System.out.println("1.글쓰기 | 2.전체글조회 | 3.글찾기 | 4.글삭제 | 5.종료");
		System.out.println("=============================================");
		System.out.println("선택 > ");
	}
	
	public void menuPrint2() {
		
		System.out.println();
		System.out.println("------------------------------공지사항------------------------------");
		selectAllno();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println("1.공지사항 쓰기 | 2.공지사항 삭제 | 3.종료");
		System.out.println("=============================================");
		System.out.println("선택 > ");
	}
	
	
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		}catch(Exception e) {
			System.out.println("없는 메뉴 입니다. 다시입력하세요.");
		}
		return menuNo;
	}
	
	public void insertSignup() {
		Signup signup = inputSignup();
		signDAO.insertSignup(signup);
	}
	
	
	
/*	public Signup login() {
		Signup signup = login();
		signDAO.login(signup);
		return signup;
	}
*/	
	
	
/*	public static void login() {
		Signup signup = inputloginInfo();
		Signup inputloginInfo = SignupDAOImpl.getInstance().selectUserInfo(signup);
		if(inputloginInfo == null) {
			System.out.println("회원정보를 확인해주세요.");
		}else if(inputloginInfo.getAuth() == 0){
			//관리자일때 실행하는 메뉴
			new AccountFrame().run();
		}else if(inputloginInfo.getAuth() == 1) {
			//일반회원일때 실행하는 메뉴
		}
		
	}
*/	
	//일반회원 로그인
	public void login() {
		signup = inputloginInfo();
		
		Signup inputloginInfo = SignupDAOImpl.getInstance().selectUserInfo(signup.getId(), signup.getPw());
		if(inputloginInfo == null) {
			System.out.println("회원정보를 확인해주세요.");
		}else {			
			while(true) {
				menuPrint1();
				int menuNo = menuSelect();
				if(menuNo == 1) {
					//글쓰기
					insertFree();
				}else if (menuNo == 2) {
					//전체글조회
					selectAll();
				}else if (menuNo == 3) {
					//글찾기
					selectsearchFree();
				}else if (menuNo == 4) {
					//글삭제
					deleteFree();
				}else if (menuNo == 5) {
					//종료
					end();
					break;
				}
			}
			
			
		}
		
	}
	//관리자 로그인
	public void loginAdmin() {
		signup = inputloginInfo();
		
		Signup inputloginInfo = SignupDAOImpl.getInstance().selectUserInfo(signup.getId(), signup.getPw());
		if(!inputloginInfo.getId().equals("master")) {
			System.out.println("회원정보를 확인해주세요.");
		}else {
			menuPrint2();
			int menuNo = menuSelect();
			if(menuNo == 1) {
				insertNotice();
			}else if (menuNo == 2) {
				//글삭제
				deleteNotice();
			}else if (menuNo == 3) {
				//종료
				end();
			//	break;
			}
		}
	}
	
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	public Signup inputloginInfo() {
		Signup temp = new Signup();
		System.out.println("아이디 : ");
		temp.setId(scanner.nextLine());
		System.out.println("비밀번호 : ");
		temp.setPw(scanner.nextLine());
		return temp;
	}
	
	
	public Signup inputSignup() {
		Signup signup = new Signup();
		System.out.println("아이디 : ");
		signup.setId(scanner.nextLine());
		System.out.println("비밀번호 : ");
		signup.setPw(scanner.nextLine());
		System.out.println("가입동기 : ");
		signup.setContent(scanner.nextLine());
		return signup;
	}
	
	
	public void insertFree() {
		Free free = inputFreeInfo();
		freeDAO.insert(free);
	}
	
	public Free inputFreeInfo() {
		Free free = new Free();
		System.out.println("제목 : ");
		free.setTitle(scanner.nextLine());
		System.out.println("내용 : ");
		free.setContent(scanner.nextLine());
		free.setWriter(signup.getId());
		free.setTime(sdf.format(now));
		return free;
	}
	
	public void insertNotice() {
		Notice notice = inputNoticeInfo();
		noticeDAO.insert(notice);
	}
	
	public Notice inputNoticeInfo() {
		Notice notice = new Notice();
		System.out.println("제목 : ");
		notice.setNoticeName(scanner.nextLine());
		System.out.println("내용 : ");
		notice.setNoticeContent(scanner.nextLine());
		notice.setNoticeWriter(signup.getId());
		return notice;
	}
	
	public void selectAll() {
		
		List<Free>list = freeDAO.selectAll();
		
		for(Free free : list) {
			System.out.println(free);
		}
				
	}
	
	//내용검색
	public void selectsearchFree() {
		String keyword = inputFreeKeyword();
		List<Free>list = freeDAO.selectAll();
		for(Free free : list) {
			if(free.getContent().indexOf(keyword) != -1) {
				System.out.println(free);
			}
		}
	}
	
	public String inputFreeKeyword() {
		System.out.println("검색>");
		return scanner.nextLine();
	}
	
//	//삭제
//	public void deleteFree() {
//		String title = inputFreetitle();
//		if(signup.getId().equals()) {
//			System.out.println("해당글을 삭제할 수 없습니다.");
//		}else if(signup.getId().equals()){
//			freeDAO.delete(title);
//		}
//		
//		
//	}
	
	public void deleteFree() {
		int num = deleteFreeInfo();
		deleteNum = FreeDAOImpl.getinstance().selectOne(num);
		Signup = SignupDAOImpl.getInstance().selectUserInfo(signup.getId(), signup.getPw());
		if(Signup.)
	}
	
	
	public String deleteFreeInfo() {
		System.out.println("삭제할글 제목>");
		String title = scanner.nextLine();
		return title;
	}
	
	//관리자 삭제
	public void deleteNotice() {
		String noticeName = inputNoticeName();
		noticeDAO.delete(noticeName);
	}
	
	public String inputNoticeName() {
		System.out.println("삭제할글 제목>");
		String noticeName = scanner.nextLine();
		return noticeName;
				
	}
	
	public void selectAllno() {
		list = noticeDAO.selectAllno();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
