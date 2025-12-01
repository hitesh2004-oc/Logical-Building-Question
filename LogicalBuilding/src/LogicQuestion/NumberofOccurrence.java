package LogicQuestion;

import java.util.Scanner;

public class NumberofOccurrence {
	public static void main(String[] args) {

		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter the Key: ");
		int key = sc.nextInt();
		int count = 0;
		while(n > 0) {
			
			int d = n%10;
			if(d == key) {
				count++;
			}
			
			n = n/10;
		}
		System.out.println("Occurrence of Digits is "+count);
		
	}
	

}
