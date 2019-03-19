package com.di91;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
  -	@Qualifier
	@Autowired에서 동일한 type의 객체가 2개 이상인 경우 
		특정한 객체(id를 지정)에 의존관계를 설정할 경우 사용.
	@Autowired와 함께 사용해야 함
	
  -	@Resource
	의존 관계 이름(id)를 이용하여 설정
	@Autowired + @Qualifier과 유사한 개념
	
	@Resource(name="userService2")
 */

public class UserBean {
	@Autowired
	@Qualifier("userService2")
	private UserService userService;	// 프로퍼티

	public void init() {
		System.out.println("init...");
	}

	public void write() {
		String s = userService.message();
		System.out.println("결과 >> " + s);
	}

	public void destroy() {
		System.out.println("destroy...");
	}
}
