package com.operators.programs;
import java.util.Scanner;

public class SwitchDays {
	public static void main(String[] args) {
		int days;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		days=sc.nextInt();
		
		String daynm =switch(days) {
		
		case 1 -> ("Monday");
		case 2 -> ("Tuesday");
		case 3 -> ("Wednesday");
		case 4 -> ("Thursday");
		case 5 -> ("Friday");
		case 6 -> ("Saturday");
		case 7 -> ("Sunday");
		default -> ("Invalid");


		};
		
		System.out.println("the day is " +daynm);
		
		
		
	}

}
