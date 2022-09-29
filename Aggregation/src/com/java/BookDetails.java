package com.java;

public class BookDetails {
	static void display(Book b)
	{
		System.out.println("BOOK SERIAL NO :"+b.getNoSi());
		System.out.println("Name of the book :"+b.getName());
		System.out.println("Author name :"+b.getWriter());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book(15,"The India Story",new Author("Bimal Jalan"));
		System.out.println("details are :");
		display(b1);
		
	}

}
