package com.di95;

import org.springframework.beans.factory.annotation.Autowired;

public class UserBean {
	@Autowired
	private UserService userService;	// ������Ƽ

	public void init() {
		System.out.println("init...");
	}
	
	public void destroy() {
		System.out.println("destroy...");
	}

	public void write() {
		String s = userService.message();
		System.out.println("��� >> " + s);
	}

}
