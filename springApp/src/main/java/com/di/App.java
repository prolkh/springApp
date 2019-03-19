package com.di;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML�κ��� ��ü ���� ������ ������
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
