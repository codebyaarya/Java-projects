package com.conditions.programs;
import java.util.Scanner;

public class IfStudResut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ur marks");
		marks=sc.nextInt();
		
		if(marks>=36) {
			System.out.println("you are pass");
		}
		
		else {
			System.out.println(" You are fail");
		}

	}

}
