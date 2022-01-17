package com.yedam.java.Signup;

import java.util.List;

public interface SignupDAO {
	 
	public void insertSignup(Signup signup);
	
	public void login(Signup signup);

	public Signup selectUserInfo(String id, String pw);
	
	public List<Signup> selectAll();
	
	public void update(Signup signup);
	
	public void delete(Signup signup);
}
