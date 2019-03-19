package com.di;

public class UserServiceImpl implements UserService{
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		name="½ºÇÁ¸µ";
		tel="010";
		age=20;

	}

	@Override
	public String message() {
		String s;
		s=name+" : " +tel+" : "+age;
		
		return s;
	}
	
}
