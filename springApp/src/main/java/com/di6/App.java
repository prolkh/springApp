package com.di6;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML�κ��� ��ü ���� ������ ������
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di6/applicationContext.xml");
		
		try {
			UserBean user=(UserBean)context.getBean("user");
			
			//movie�� �ѹ��� ��ü�� ����������  music��  play() �޼ҵ带
			// ȣ���� ������ ��ü�� �����ȴ�.
			
			/*
				<aop:scoped-proxy> : �ش� ��ü�� �����Ҷ����� ���ο� ��ü�� ����			 
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
