package LogicQuestion;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		while(n > 0) {
			count++;
			n = n/10;
		}
		System.out.println(count);
	
	}

}
