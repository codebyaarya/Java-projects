package com.conditions.programs;
import java.util.Scanner;
public class ApplicationStatus {
	public static void main(String []args) {
		int exp,age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter experience");
		exp=sc.nextInt();
		
		if(exp>=2 && age>=20) {
			System.out.println("You are eligible");
		}
		else
			System.out.println("You are not eligible");
		
		
	}

}
