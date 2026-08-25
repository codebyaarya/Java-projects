package com.ak.programs;

import java.util.Scanner;

public class info {
	public static void main(String[] args) {
	String name,city,gender;
	int age,marks;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter ur name : ");
	name = sc.nextLine();
	System.out.print("Enter ur city : ");
	city = sc.nextLine();
	System.out.print("Enter ur Gender : ");
	gender = sc.nextLine();
	System.out.print("Enter ur Age : ");
	age = sc.nextInt();
	System.out.print("Enter ur Marks : ");
	marks = sc.nextInt();
	
	System.out.println("Name is "+name+ " city is "+city+ " age is "+age+ " and gender is "+gender);
	
	
	if (marks>=35)
		System.out.print("You are pass ");
	else
		System.out.print("You are fail");
	}	
}