package com.bean;

public class Book {
	private String sid;
	private String name;
	private String auther;
	private String price;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Book(String sid, String name, String auther, String price) {
		super();
		this.sid = sid;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [sid=" + sid + ", name=" + name + ", auther=" + auther
				+ ", price=" + price + "]";
	}
	

}
