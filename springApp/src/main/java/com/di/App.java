package com.di;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di/applicationContext.xml");
		
		try {
			UserBean user=(UserBean)context.getBean("user");
			user.write();	
		} finally {
			context.close();
		}
	} 
}
