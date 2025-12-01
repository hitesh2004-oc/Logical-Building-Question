package LogicQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n/2];
		int c[] = new int[n/2];
		
		for(i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		j = 0;
		k= 0;
		
		for(i = 0; i<n; i++) {
			if(a[i]%2 == 0) {
				b[j++]=a[i];
			}
			else {
				c[k++]=a[i];
			}
		}
		i = 0;
		while(i<n/2) {
			System.out.println(b[i]+ " "+c[i]+ " ");
		}
		
	}

}
