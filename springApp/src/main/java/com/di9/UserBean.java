package com.di9;

import org.springframework.beans.factory.annotation.Autowired;

/*
  -	@Autowired
	type에 의한 의존관계 자동 설정
	setter가 필요 없다.
	동일한 type의 객체가 2개 이상이면 예외발생.
	단 동일한 type 객체가 2개 이상이라 할지라도 객체 아이디와 프로퍼티명이 동일한 경우
	동일한 이름의 프로퍼티로 설정
 */

public class UserBean {
	@Autowired	// 앞으로 가장 많이 쓰는 annotation
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
