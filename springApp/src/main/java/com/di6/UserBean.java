package com.di6;

public class UserBean {
	private Movie movie;
	private Music music;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	
	public void execute() {
		movie.play();
		music.play();
	}
	
}
