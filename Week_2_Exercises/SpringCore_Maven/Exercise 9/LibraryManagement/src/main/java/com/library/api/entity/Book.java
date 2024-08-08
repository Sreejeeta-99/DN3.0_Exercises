package com.library.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; //name of the table = class name

//use @annotation which is provided to us by the hibernate
//hibernate will convert the java datatypes to our database datatype(like varchar)
//an entity should always have a primary key else we wont be able to form a grp

//class is converted to entity where a table will be created into the h2 database

@Entity
@Table(name="book")
public class Book {
	//primary key
	@Id
	
	//auto generates the value of the primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	//member  method
	private int bookid;
	private String bookname;
	private String authorname;
	private double price;
	private String isbn;
	
	//default constructor
	public Book()
	{
		this.bookid=0;
		this.bookname=null;
		this.authorname=null;
		this.price=0;
		this.isbn=null;
		
	}

	//parameterized constructor
	public Book(String bookname, String authorname, double price, String isbn) {
		super();
		this.bookname = bookname;
		this.authorname = authorname;
		this.price = price;
		this.isbn = isbn;
	}

	
	//generate getter and setter
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

	

}
