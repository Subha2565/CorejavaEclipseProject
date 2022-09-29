package com.java;

public class Book {

	private int noSi;
	private String name;
	private Author writer;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int noSi, String name, Author writer) {
		super();
		this.noSi = noSi;
		this.name = name;
		this.writer = writer;
	}
	public int getNoSi() {
		return noSi;
	}
	public void setNoSi(int noSi) {
		this.noSi = noSi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getWriter() {
		return writer;
	}
	public void setWriter(Author writer) {
		this.writer = writer;
	}
	
	
	
	
	
}
