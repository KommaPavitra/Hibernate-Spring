package com.dl.pcnamespace;

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
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", branch=" + branch + ", university=" + university + "]";
	}

}
