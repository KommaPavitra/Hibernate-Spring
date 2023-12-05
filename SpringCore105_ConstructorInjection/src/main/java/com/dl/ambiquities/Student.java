package com.dl.ambiquities;

public class Student {
	private int rollno;
	private double stipend;
	private String university;
	
	public Student(int rollno, double stipend, String university) {
		System.out.println(rollno);
		System.out.println(stipend);
		System.out.println(university);
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stipend=" + stipend + ", university=" + university + "]";
	}
	
	
	

}
