package com.di6;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di6/applicationContext.xml");
		
		try {
			UserBean user=(UserBean)context.getBean("user");
			
			//movie는 한번만 객체가 생성되지만  music은  play() 메소드를
			// 호출할 때마다 객체가 생성된다.
			
			/*
				<aop:scoped-proxy> : 해당 객체에 접근할때마다 새로운 객체를 생성			 
			 */
			
			user.execute();
			System.out.println("-----------------");
			user.execute();
			System.out.println("-----------------");
			user.execute();
			System.out.println("-----------------");
			
		} finally {
			context.close();
		}
	} 
}
