package LogicQuestion;

import java.util.Scanner;

public class digitsreverse {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		
		while(n > 0) {
			
			int d = n%10;
			rev = rev * 10 + d;
			n = n/10;
		}
		System.out.println("________________________");
		System.out.println(rev);
	
	}

}
