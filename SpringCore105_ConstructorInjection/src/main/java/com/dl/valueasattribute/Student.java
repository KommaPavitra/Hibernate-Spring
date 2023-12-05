package com.dl.valueasattribute;

public class Student {
	private int id;
	private String branch;
	private String university;
	
	public Student() {
		
	}
	
	public Student(int id, String branch, String university) {
		this.id = id;
		this.branch = branch;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", branch=" + branch + ", university=" + university + "]";
	}

}
