package com.example.demo.model;

import jakarta.persistence.Entity;//contains full API of CRUD repository
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//map a table
@Table(name="CustomerDetails")
public class CustModel {
	
	@Id//primary key
	private int id;
	private String name;
	private String gender;
	private String email;
	private String address;
	private String city;
	private long phonenumber;
	public CustModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustModel(int id, String name, String gender, String email, String address, String city, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.city = city;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}