package com.aarya.classes;

public class student {
	private String name;
	private int marks;
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
	public void Showres() {
		if(marks>=35)
			System.out.println(name+ " you are pass");
		else
			System.out.println(name+ "you are fail");
		
	}
	

}
