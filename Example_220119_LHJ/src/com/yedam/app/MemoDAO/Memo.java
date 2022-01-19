package com.yedam.app.MemoDAO;

public class Memo {
	private int memoId;
	private String memoTitle;
	private String memoWriter;
	private String memocontent;
	
	
	
	public int getMemoId() {
		return memoId;
	}



	public void setMemoId(int memoId) {
		this.memoId = memoId;
	}



	public String getMemoTitle() {
		return memoTitle;
	}



	public void setMemoTitle(String memoTitle) {
		this.memoTitle = memoTitle;
	}



	public String getMemoWriter() {
		return memoWriter;
	}



	public void setMemoWriter(String memoWriter) {
		this.memoWriter = memoWriter;
	}



	public String getMemocontent() {
		return memocontent;
	}



	public void setMemocontent(String memocontent) {
		this.memocontent = memocontent;
	}



	@Override
	public String toString() {
		
		return "메모번호 : " + memoId + " | 메모제목 : " + memoTitle + " | 메모 작성자 : " + memoWriter + " | 메모 내용 : " + memocontent;
	}
	
}
