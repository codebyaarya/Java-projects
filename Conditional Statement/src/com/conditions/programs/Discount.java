package com.conditions.programs;
import java.util.Scanner;

public class Discount {
	public static void main(String []args) {
		int amt,disc,bill;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name");
		name =sc.nextLine();
		
		System.out.println("enter amount to be paid ");
		amt=sc.nextInt();
		if (amt>20000) {
			disc= (20*amt)/100;
			System.out.println("Disount applied is 20% " +disc);
		
			
		}
		
		else {
			disc =(10*amt)*100;
			System.out.println("Discount applied is 10%" +disc);
		}
		bill = amt-disc;	
		System.out.println("total payable amount is " +bill);
		
	}

}
