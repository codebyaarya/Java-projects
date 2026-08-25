package com.forloop.programs;
import java.util.Scanner;

public class Factorial {
	public static void main(String []args) {
		int n,fact,i;
		fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact = fact*i;
			
			
			
		}
		System.out.println("factorial of " +n+ " is " +fact);
		
	}

}
