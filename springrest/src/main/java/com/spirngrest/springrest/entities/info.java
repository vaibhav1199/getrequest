package com.spirngrest.springrest.entities;

public class info {
	
	private long id;
	private String words;
	public info(long id, String words) {
		super();
		this.id = id;
		this.words = words;
	}
	public info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	@Override
	public String toString() {
		return "info [id=" + id + ", words=" + words + "]";
	}
}
