package com.bean;

public class Student {
	
	 String name;
	private int sid;
	public int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", score=" + score
				+ "]";
	}
	public Student(String name, int sid, int score) {
		super();
		this.name = name;
		this.sid = sid;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		System.out.println("nihao");
	}
	
	public int add(int a,int b){
		
	return a+b;
	}

}
