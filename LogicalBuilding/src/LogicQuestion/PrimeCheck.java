package LogicQuestion;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		
	System.out.println("Enter the Number ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int factor = 0;
	for(int i = 1; i <= n; i++) {
		if(n%i == 0) {
			factor++;
		}
	}
	if(factor == 2) System.out.println("It is Prime Number");
	else System.out.println("It is Not Prime Number");
	

}
}
