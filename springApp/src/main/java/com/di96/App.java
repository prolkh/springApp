package com.di96;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ������ �����̳�
		// AnnotationConfigApplicationContext : �ڹٸ� �̿��� ȯ�漳��
		AbstractApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		try {
			//UserBean user=(UserBean)context.getBean("���̵�");
			UserBean user=context.getBean(UserBean.class); // Ŭ������ �����ؼ� �޴� ���
			user.write();
		} finally {
			context.close();
		}
	} 
}
