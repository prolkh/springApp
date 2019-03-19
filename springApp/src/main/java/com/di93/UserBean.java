package com.di93;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 	  -	�⺻������ id�� Ŭ���� �̸� �� ù���ڰ� �ҹ����� Ŭ�������̴�.(userBean)
// 	  -	id�� ������ �� �ִ�.
// 		@Component("���̵�")

@Component("di93.userBean")
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
