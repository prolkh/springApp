package com.di92;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/*
  -	@Autowired : 스프링 전용. 타입으로 의존관계 설정
  -	@Resource : 자바에서 지원. 이름(id)로 의존관계 설정
  - @Inject : 자바에서 지원. 타입으로 의존관계 설정(Maven 추가 필요)
 */

public class UserBean {
	@Inject
	private UserService userService;	// 프로퍼티

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
		System.out.println("결과 >> " + s);
	}

}
