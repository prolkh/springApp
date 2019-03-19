package com.di94;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")	// �⺻ : singleton
public class Movie {
	public void play() {
		System.out.println("��ȭ--"+toString());
	}
}
