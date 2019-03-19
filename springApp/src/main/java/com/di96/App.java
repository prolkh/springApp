package com.di96;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// AnnotationConfigApplicationContext : 자바를 이용한 환경설정
		AbstractApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		try {
			//UserBean user=(UserBean)context.getBean("아이디");
			UserBean user=context.getBean(UserBean.class); // 클래스를 지정해서 받는 방식
			user.write();
		} finally {
			context.close();
		}
	} 
}
