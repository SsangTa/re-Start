package com.yedam.java.app.dept.emp13;

import java.util.List;
import java.util.Scanner;

public class Emp13App {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Emp13DAO dao = Emp13DAO.getInstance();
		
		Emp13 emp = null;
		int employeeId = 0;
		while(run) {
			System.out.println();
			System.out.println("=== 1.등록  2.수정  3.삭제  4. 사원조회  5.전체조회  9.종료 ===");
			System.out.print("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo) {
			case 1:
				emp = new Emp13();
				System.out.println("사번 > ");
				emp.setEmployeeId(scanner.nextInt());
				System.out.println("이름 > ");
				emp.setFirstName(scanner.next());
				System.out.println("직급 > ");
				emp.setJobId(scanner.next());
				System.out.println("연봉 > ");
				emp.setSalary(scanner.nextInt());
				System.out.println("상여 > ");
				emp.setCommissionPct(scanner.next());
				System.out.println("부서 > ");
				emp.setDepartmentName(scanner.next());
				System.out.println("지역번호 > ");
				emp.setLocationId(scanner.nextInt());
				
				dao.insert(emp);
				
				break;
			case 2:
				emp = new Emp13();
				System.out.println("사번 > ");
				emp.setEmployeeId(scanner.nextInt());
				System.out.println("이름 > ");
				emp.setFirstName(scanner.next());
				
				dao.update(emp);
				break;
			case 3:
				System.out.println("사번 > ");
				employeeId = scanner.nextInt();
				break;
			case 4:
				System.out.println("사번 > ");
				employeeId = scanner.nextInt();
				emp = dao.selectOne(employeeId);
				System.out.println(emp);
				break;
			case 5:
				List<Emp13>list = dao.selectAll();
				for(Emp13 emp13 : list) {
					System.out.println(emp13);
				}
				break;
			case 9:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		

	}

}
