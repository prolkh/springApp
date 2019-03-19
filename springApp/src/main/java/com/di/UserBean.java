package com.di;

public class UserBean {
	private UserService userService;

	public UserBean(UserService userService) {
		this.userService = userService;
	}

	public void init() {
		System.out.println("init...");
	}

	public void write() {
		String s = userService.message();
		System.out.println("��� >> " + s);
	}
}
