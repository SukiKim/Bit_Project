package com.Bamboo.vo;

public class UserVo {
	private Long userId;
	private String password;
	
	public UserVo() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", password=" + password + "]";
	}
	
	
	
}
