package com.learning.demoThirdWebApp.controller;


public class Course {

  private int id;
  private String name;
  private int price;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Course(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
}
  
  
}
