package com.ak.programs;

import java.util.Scanner;

public class square {
	public static void main(String[] args)
	{
      int n,sq;
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter a no : ");
      try {
      n=sc.nextInt();
      }
      catch(Exception e) {
    	  n=0;
    	  System.out.println("invalid input");
    	  
      }
      
      sq=n*n;
      System.out.println("Square is "+sq);
      
	}  
      
}
