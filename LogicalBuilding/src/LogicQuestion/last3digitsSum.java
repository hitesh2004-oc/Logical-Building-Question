package LogicQuestion;

import java.util.Scanner;

public class last3digitsSum {
	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int a = n%10;
	    int b = (n/10)%10;
	    int c = (n/100)%10;
	    
	    System.out.println("Sum of Last Three Digits "+(a+b+c));
	}

}
