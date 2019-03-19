package com.di94;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
	@Autowired	// getter, setter�� �ʿ� ����.
	private Movie movie;
	@Autowired
	private Music music;
	
	public void execute() {
		movie.play();
		music.play();
	}
	
}
