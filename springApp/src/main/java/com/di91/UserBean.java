package com.di91;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
  -	@Qualifier
	@Autowired���� ������ type�� ��ü�� 2�� �̻��� ��� 
		Ư���� ��ü(id�� ����)�� �������踦 ������ ��� ���.
	@Autowired�� �Բ� ����ؾ� ��
	
  -	@Resource
	���� ���� �̸�(id)�� �̿��Ͽ� ����
	@Autowired + @Qualifier�� ������ ����
	
	@Resource(name="userService2")
 */

public class UserBean {
	@Autowired
	@Qualifier("userService2")
	private UserService userService;	// ������Ƽ

	public void init() {
		System.out.println("init...");
	}

	public void write() {
		String s = userService.message();
		System.out.println("��� >> " + s);
	}

	public void destroy() {
		System.out.println("destroy...");
	}
}
