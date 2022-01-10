package com.yedam.java.test02;

public class TossCard extends Card {
	
	public TossCard(int cardNo, int validDate, int CVC) {
		super(cardNo, validDate, CVC);
		// TODO Auto-generated constructor stub
	}


	private String company;
	private String cardStaff;
	
	
	public void TossCard(String company, String cardStaff) {
		this.company = company;
		this.cardStaff = cardStaff;
		
	}


	@Override
	public int getCardNo() {
		// TODO Auto-generated method stub
		return super.getCardNo();
	}


	@Override
	public int getValidDate() {
		// TODO Auto-generated method stub
		return super.getValidDate();
	}


	@Override
	public int getCVC() {
		// TODO Auto-generated method stub
		return super.getCVC();
	}


	@Override
	public void showCardinfo() {
		System.out.println("카드정보 : " + cardNo + "담당직원 : " + cardStaff);
	}
}
