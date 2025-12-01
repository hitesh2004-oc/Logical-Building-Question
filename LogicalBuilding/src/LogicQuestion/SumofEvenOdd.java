package LogicQuestion;

import java.util.Scanner;

public class SumofEvenOdd {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		while(n > 0) {
			
			int d = n%10;
			if(d%2 == 0) {
			sum = sum+d;
			}
			n = n/10;
		}
		System.out.println("Sum is "+sum);
	
	}

}
