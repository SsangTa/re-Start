package com.yedam.java.ch01_01;

public class MainExample {

	public static void main(String[] args) {
		//===클래스 상속
		
		//자식클래스인 DmbCellPhone 인스턴스 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정",10);
		
		//부모클래스인 CellPhone의 필드
	    System.out.println("모델 : " + dmbCellPhone.model);
	    System.out.println("색상 : " + dmbCellPhone.color);
	    
	    //DmbCellPhone의 자식의 필드
	    System.out.println("채널 : " + dmbCellPhone.channel);
	    
	    //부모클래스인 CellPhone의 메서드
	    dmbCellPhone.powerOn();
	    dmbCellPhone.bell();
	    dmbCellPhone.sendVoice("여보세요.");
	    dmbCellPhone.receveVoice("안녕하세요! 저는 홍길동인데요.");
	    dmbCellPhone.sendVoice("반갑습니다.");
	    dmbCellPhone.hangUp();
	    
	    //DmbCellPhone 자신의 메서드
	    dmbCellPhone.turnOffDmb();
	    dmbCellPhone.changeChannelDmb(12);
	    dmbCellPhone.turnOffDmb();
	    
	    System.out.println();
	    
	    
	    //===메서드 재정의
	    int r = 10;
	    
	    Calculator calculator = new Calculator();
	    System.out.println("원면적 : " + calculator.areaCircle(r));
	    
	    Computer computer = new Computer();
	    System.out.println("원면적 : " + computer.areaCircle(r));
	    
	    System.out.println();
	    
	    
	    //===부모 메서드 호출
	    SupersonicAirplane sa = new SupersonicAirplane();
	    sa.takeoff();
	    sa.fly();
	    sa.flyMode = SupersonicAirplane.SUPERSONIC;
	    sa.fly();
	    sa.flyMode = SupersonicAirplane.NORMAL;
	    sa.fly();
	    sa.land();
	    
	    

	}

}
