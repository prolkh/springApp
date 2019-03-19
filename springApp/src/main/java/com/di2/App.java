package com.di2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di2/applicationContext.xml");
		
		try {
			// UserBean user=(UserBean)context.getBean("user");
			UserBean user=context.getBean(UserBean.class); // 클래스를 지정해서 받는 방식
			user.write();
		} finally {
			context.close();	// close를 하지 않으면 안된다.
		}
	} 
}
