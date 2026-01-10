package LogicQuestion;

import java.util.Scanner;
public class MatrixDiagonaleLElements {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		int i,j;
		System.out.println("Enter Element: -");
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing...............");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if(i == j) System.out.print(arr[i][j] + " ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
