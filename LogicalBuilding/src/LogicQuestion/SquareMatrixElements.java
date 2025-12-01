package LogicQuestion;

import java.util.Scanner;

public class SquareMatrixElements {
public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		int i,j;
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing...............");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print(arr[i][j]*arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
