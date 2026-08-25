package whileloop.com.programs;
import java.util.Scanner;

public class Whilesquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=1;
		
		while(n!=0) {
			System.out.println("Enter no");
			n=sc.nextInt();
			if(n!=0) {
				System.out.println(n*n);
			}
			else
				System.out.println("end");
		}
		
	}

}
