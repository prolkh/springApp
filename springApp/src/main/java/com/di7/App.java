package com.di7;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		// GenericXmlApplicationContext : XML로부터 객체 생성 정보를 가져옴
		AbstractApplicationContext context=new
				GenericXmlApplicationContext("classpath:com/di7/applicationContext.xml");
		
		try {
			PizzaShop shop=context.getBean(PizzaShop.class);
			
			Pizza p1=shop.makePizza();
			System.out.println(p1);
			
			Pizza p2=shop.makePizza();
			System.out.println(p2);
			
			Pizza p3=shop.makeVeggiePizza();
			System.out.println(p3);
			
			
		} finally {
			context.close();
		}
	} 
}
