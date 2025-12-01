package LogicQuestion;

import java.util.Scanner;

public class specialTwoDigits {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b;
		
		a = n%10;
		
		b = (n/10)%10;
		
		int c = (a+b)+(a*b);
		
		if(c == n) System.out.println("Special Two Digit Number");
		else System.out.println("Not Special Two Digit Number");
		

	}
	

}
