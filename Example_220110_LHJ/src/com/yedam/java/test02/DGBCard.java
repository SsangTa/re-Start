package com.yedam.java.test02;

public class DGBCard extends Card {
	public int CVC;
	
	public DGBCard(int cardNo, int valiDate, int CVC) {
		super(cardNo, valiDate, CVC);
		
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
		String cardStaff = null;
		String valiDate = null;
		System.out.println("카드정보 (Card NO : " + cardNo + ", 유효기간 : "+ valiDate + ", CVC : "+ CVC + "담당직원 - " + cardStaff);
	}
}
