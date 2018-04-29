package com.bean;

public class Member {
	private String id;
	private String name;
	private int age;
	private int sex;
	private String interest;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", interest=" + interest + "]";
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String name, int age, int sex, String interest) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.interest = interest;
	}
	

}
