package LogicQuestion;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			
			sum = sum+ (digit*digit*digit);
			
			num = num/10;
		}
		if(sum == temp) {
			System.out.println(temp+ " is an Armstrong Number");
		}else System.out.println(temp+ " is Not Armstrong Number");
	}
	

}
