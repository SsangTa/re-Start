package com.yedam.java.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.java.Signup.Signup;
import com.yedam.java.Signup.SignupDAO;
import com.yedam.java.Signup.SignupDAOImpl;

public class SignupFrame {
	private SignupDAO signDAO = SignupDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
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
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println();
		System.out.println("=========================");
		System.out.println("1.회원가입 | 2.로그인 | 3.종료");
		System.out.println("=========================");
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
	
	public static void login() {
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
	
	public void end() {
		System.out.println("프로그램 종료");
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
	
	
	
}
