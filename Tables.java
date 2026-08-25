package com.forloop.programs;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		int n,i;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no :");
		
		n=sc.nextInt();
		System.out.println("Table of " +n+ " is ");
		
		for(i=1;i<=10;i++)
	
		    System.out.println(n*i);
		
		
		
		

	}

}
