package whileloop.com.programs;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("enter a no ");
			n=sc.nextInt();
			if(n!=0) {
				System.out.println(n*n);
			}
			
		}
		while(n!=0);
		
	}

}
