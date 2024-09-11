package com.baby.CMS.model;

/*
 	create table Customer(
 	cid int primary key auto_increment,
 	name varchar(256),
 	phone varchar(256),
 	email varchar(256),
 	birthDate date,
 	age int,
 	inDateTime datetime,
 	outDateTime datetime,
 	temperature float
 	); 
 */

public class Customer {
	Integer cid;
	String name;
	String phone;
	String email;
	String birthDate;
	Integer age;
	String inDateTime;
	String outDateTime;
	float temperature;
	String bithDate;
	
	public Customer() {
		
	}
	
	public Customer(String name, String phone,String email, String birthDate, Integer age, String inDateTime, String outDateTime, float temperature, Integer cid) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.birthDate = birthDate;
		this.age = age;
		this.inDateTime = inDateTime;
		this.outDateTime = outDateTime;
		this.temperature = temperature;
	}
	
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirtDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getInDateTime() {
		return inDateTime;
	}
	
	public void setInDateTime(String inDateTime) {
		this.inDateTime = inDateTime;
	}
	
	public String getOutDateTime() {
		return outDateTime;
	}
	
	public void setoutDateTime(String outDateTime) {
		this.outDateTime = outDateTime;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
}
