package com.psl.jdbc;

public class Movie {
	String name;
	String date;
	String language;
	
	public Movie(String name, String date, String language) {
		super();
		this.name = name;
		this.date = date;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
		@Override
		public String toString() {
			return "Movie [name=" + name + ", date=" + date + ", language="
					+ language + "]";
		}
}
