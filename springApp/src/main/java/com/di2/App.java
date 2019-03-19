package com.di2;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML�κ��� ��ü ���� ������ ������
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di2/applicationContext.xml");
		
		try {
			// UserBean user=(UserBean)context.getBean("user");
			UserBean user=context.getBean(UserBean.class); // Ŭ������ �����ؼ� �޴� ���
			user.write();
		} finally {
			context.close();	// close�� ���� ������ �ȵȴ�.
		}
	} 
}
