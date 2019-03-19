package com.di92;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/*
  -	@Autowired : ������ ����. Ÿ������ �������� ����
  -	@Resource : �ڹٿ��� ����. �̸�(id)�� �������� ����
  - @Inject : �ڹٿ��� ����. Ÿ������ �������� ����(Maven �߰� �ʿ�)
 */

public class UserBean {
	@Inject
	private UserService userService;	// ������Ƽ

	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy...");
	}

	public void write() {
		String s = userService.message();
		System.out.println("��� >> " + s);
	}

}
