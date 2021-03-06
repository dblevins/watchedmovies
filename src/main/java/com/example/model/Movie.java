package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Movie {
	@Id
	private String title;
	private String watched;
	private int scoring;
	
	public Movie (String title, String watched, int scoring) {
		this.title = title;
		this.watched = watched;
		this.scoring = scoring;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWatched() {
		return watched;
	}
	public void setWatched(String watched) {
		this.watched = watched;
	}
	public int getScoring() {
		return scoring;
	}
	public void setScoring(int scoring) {
		this.scoring = scoring;
	}
}
