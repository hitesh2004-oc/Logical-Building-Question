package LogicQuestion;

import java.util.Scanner;

public class PrintDigits {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0) {
			
			int d = n % 10;
			System.out.print(d+" ");
			n = n/10;
		}
	}

}