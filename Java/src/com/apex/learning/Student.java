package com.apex.learning;

public class Student {
	
	private String name;
	private int rollNo;
	private int age;
	
	/**
	 * @param name
	 * @param rollNo
	 * @param age
	 */
	public Student(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
	

}
