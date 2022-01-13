package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.Department.Emp13;
import com.yedam.java.Department.Emp13DAO;
import com.yedam.java.Department.Emp13DAOImpl;

public class Emp13Frame {
	private Emp13DAO empDAO = Emp13DAOImpl.getinstance();
	private Scanner scanner = new Scanner(System.in);
	
	public Emp13Frame() {
		while(true) {
			//메뉴출력
			menuPrint();
			
			//메뉴선택
			int menuNo = menuSelect();
			//각 메뉴별기능실행
			if(menuNo == 1) {
				//등록
				insertEmp13();
			}else if(menuNo == 2) {
				//수정
				updateEmp13();
			}else if(menuNo == 3) {
				//삭제
				deleteEmp13();
			}else if(menuNo == 4) {
				//단건조회
				selectOne();
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
		System.out.println("=== 1.등록 2.수정 3.삭제 4.단건조회 5.전체조회 9.종료 ===");
		System.out.println("선택 > ");
		
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	
	public void insertEmp13() {
		//직원번호 입력
		Emp13 emp = inputEmpInfo();
		//직원정보 등록
		empDAO.insert(emp);
	}
	
	public void updateEmp13() {
		//직원번호 입력
		Emp13 emp = inputEmpName();
		//직원정보 등록
		empDAO.update(emp);
	}
	
	public void deleteEmp13() {
		//직원번호 입력
		int employeeId = inputEmpId();
		//직원정보 삭제
		empDAO.delete(employeeId);
	}
	
	
	public void selectOne() {
		//직원번호 입력
		int employeeId = inputEmpId();
		//직원정보 출력
		Emp13 emp = empDAO.selectOne(employeeId);
		
		//직원정보 출력
		if(emp == null) {
			System.out.println("해당 직원은 존재하지 않습니다.");
		}else {
			System.out.println(emp);
		}
	}
	
	public void selectAll() {
		List<Emp13> list = empDAO.selectAll();
		
		for(Emp13 emp : list) {
			System.out.println(emp);
		}
	}
	
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	public Emp13 inputEmpInfo() {
		Emp13 emp = new Emp13();
		System.out.println("직원번호 >");
		emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.println("이름 >");
		emp.setFirstName(scanner.nextLine());
		System.out.println("직급 >");
		emp.setJobId(scanner.nextLine());
		System.out.println("연봉 >");
		emp.setSalary(Integer.parseInt(scanner.nextLine()));
		System.out.println("상여 >");
		emp.setCommissionPct(scanner.nextLine());
		System.out.println("부서명 >");
		emp.setDepartmentName(scanner.nextLine());
		System.out.println("지역번호 >");
		emp.setLocationId(Integer.parseInt(scanner.nextLine()));
		return emp;
	}
	
	public Emp13 inputEmpName() {
		Emp13 emp = new Emp13();
		System.out.println("직원번호 > ");
		emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.println("이름 >");
	    emp.setFirstName(scanner.nextLine());
		return emp;
	}
	
	public int inputEmpId() {
		int employeeId = 0;
		System.out.println("직원번호 >");
		employeeId = Integer.parseInt(scanner.nextLine());
		return employeeId;
		
	}
	
	
}
