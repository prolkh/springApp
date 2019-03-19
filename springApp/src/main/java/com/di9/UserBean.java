package com.di9;

import org.springframework.beans.factory.annotation.Autowired;

/*
  -	@Autowired
	type�� ���� �������� �ڵ� ����
	setter�� �ʿ� ����.
	������ type�� ��ü�� 2�� �̻��̸� ���ܹ߻�.
	�� ������ type ��ü�� 2�� �̻��̶� ������ ��ü ���̵�� ������Ƽ���� ������ ���
	������ �̸��� ������Ƽ�� ����
 */

public class UserBean {
	@Autowired	// ������ ���� ���� ���� annotation
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
