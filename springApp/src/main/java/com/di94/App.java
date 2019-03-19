package com.di94;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di94/applicationContext.xml");
		
		try {
			UserBean user=context.getBean(UserBean.class);
			
			// music은 proxyMode에 의해 music의 메소드를 호출할 때마다 객체가 생성됨 
			System.out.println("--------------------");
			user.execute();
			System.out.println("--------------------");
			user.execute();
			System.out.println("--------------------");
			user.execute();
			
			
		} finally {
			context.close();
		}
	} 
}
