package com.conditions.programs;
import java.util.Scanner;

public class PosNeg {
	public static void main(String []args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		if(n!=0) {
			if(n>0)
				System.out.println("no is positive");
			else
				System.out.println("no is negative");
		}
		else
			System.out.println("neutral no");
		sc.close();
		
	}

}
