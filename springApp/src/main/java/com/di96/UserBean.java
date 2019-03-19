package com.di96;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("di96.userBean")
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
