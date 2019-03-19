package com.di94;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")	// 기본 : singleton
public class Movie {
	public void play() {
		System.out.println("영화--"+toString());
	}
}
