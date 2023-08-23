package com.example.demo.model;

import jakarta.persistence.Entity;//contains full API of CRUD repository
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//map a table
@Table(name="Book")
public class ApiModel {
	
	@Id//primary key
	private int id;
	private String title;
	private String category;
	private String author;
	private long price;
	public ApiModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiModel(int id, String title, String category, String author, long price) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
}