package com.di3;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di3/applicationContext.xml");
		
		try {
			UserBean user=context.getBean(UserBean.class); // 클래스를 지정해서 받는 방식
			user.write();
		} finally {
			context.close();
		}
	} 
}
