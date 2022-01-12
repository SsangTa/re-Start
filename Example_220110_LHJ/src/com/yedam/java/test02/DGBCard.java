package com.yedam.java.test02;

public class DGBCard extends Card {
	private String company = "대구은행";
	private String cardStaff;
	
	public DGBCard(String cardNo, int valiDate, int CVC, String cardStaff) {
		super(cardNo, valiDate, CVC);
		this.cardStaff = cardStaff;
		
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
