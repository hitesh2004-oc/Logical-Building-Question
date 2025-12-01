package LogicQuestion;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Enter the Size of Array ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter " + n + " Elements");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		System.out.println("Reverse the Array Elements");
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
