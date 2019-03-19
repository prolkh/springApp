package com.di5;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ������ �����̳�
		// GenericXmlApplicationContext : XML�κ��� ��ü ���� ������ ������
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di5/applicationContext.xml");
		
		try {
			Movie movie1=context.getBean(Movie.class);
			Movie movie2=context.getBean(Movie.class);
			
			Music music1=context.getBean(Music.class);
			Music music2=context.getBean(Music.class);
			
			// singleton(�⺻)
			System.out.println(movie1==movie2);
			
			// prototype
			System.out.println(music1==music2);
		} finally {
			context.close();
		}
	} 
}
