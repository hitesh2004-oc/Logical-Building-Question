package LogicQuestion;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		int Temp = n;
		
		while(n > 0) {
			
			int d = n%10;
			rev = rev * 10 + d;
			n = n/10;
		}
		if(Temp == rev) System.out.println("It is Pallindrome Number");
		else System.out.println("It is Not Pallindrome Number");
	
	}

}
