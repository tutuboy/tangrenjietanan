package com.entity;

public class Student {
	private String sid;
	private String name;
	private String age;
	private String oldadd;
	private String newadd;
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOldadd() {
		return oldadd;
	}
	public void setOldadd(String oldadd) {
		this.oldadd = oldadd;
	}
	public String getNewadd() {
		return newadd;
	}
	public void setNewadd(String newadd) {
		this.newadd = newadd;
	}
	public Student(String sid, String name, String age, String oldadd,
			String newadd) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.oldadd = oldadd;
		this.newadd = newadd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age
				+ ", oldadd=" + oldadd + ", newadd=" + newadd + "]";
	}
	

}
