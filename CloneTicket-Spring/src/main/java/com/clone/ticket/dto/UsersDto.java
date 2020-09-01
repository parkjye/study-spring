package com.clone.ticket.dto;

public class UsersDto {
	private int users_num;
	private String users_id;
	private String users_pwd;
	private String users_phone;
	private String users_addr;
	
	private String users_pwd_check; //비밀번호 확인용
	
	
	public UsersDto() {}


	public UsersDto(int users_num, String users_id, String users_pwd, String users_phone, String users_addr,
			String users_pwd_check) {
		super();
		this.users_num = users_num;
		this.users_id = users_id;
		this.users_pwd = users_pwd;
		this.users_phone = users_phone;
		this.users_addr = users_addr;
		this.users_pwd_check = users_pwd_check;
	}


	public int getUsers_num() {
		return users_num;
	}


	public void setUsers_num(int users_num) {
		this.users_num = users_num;
	}


	public String getUsers_id() {
		return users_id;
	}


	public void setUsers_id(String users_id) {
		this.users_id = users_id;
	}


	public String getUsers_pwd() {
		return users_pwd;
	}


	public void setUsers_pwd(String users_pwd) {
		this.users_pwd = users_pwd;
	}


	public String getUsers_phone() {
		return users_phone;
	}


	public void setUsers_phone(String users_phone) {
		this.users_phone = users_phone;
	}


	public String getUsers_addr() {
		return users_addr;
	}


	public void setUsers_addr(String users_addr) {
		this.users_addr = users_addr;
	}


	public String getUsers_pwd_check() {
		return users_pwd_check;
	}


	public void setUsers_pwd_check(String users_pwd_check) {
		this.users_pwd_check = users_pwd_check;
	}
	
	
}//UsersDto
