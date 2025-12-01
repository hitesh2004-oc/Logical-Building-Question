package LogicQuestion;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7};
		
		int n = arr.length+1;
		
		int sum = 0;
		
		for(int aa :arr) {
			sum+=aa;
		}
		int expectedSum = n* (n+1)/2;
		
		int missingnumber = expectedSum - sum;
		
		System.out.println(missingnumber);
	}

}
