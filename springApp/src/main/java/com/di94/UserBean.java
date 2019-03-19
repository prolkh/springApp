package com.di94;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
	@Autowired	// getter, setter도 필요 없다.
	private Movie movie;
	@Autowired
	private Music music;
	
	public void execute() {
		movie.play();
		music.play();
	}
	
}
