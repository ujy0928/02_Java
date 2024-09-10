package com.hw1.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, 
			int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		String str;
		
		str = " / 학년 : " + grade;
		str += " / 전공 : " + major;
		
		return super.information() + str;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
