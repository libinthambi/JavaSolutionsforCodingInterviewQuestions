package recursion;

import java.util.Scanner;

public class FibonacciNormalRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(findFibForN(n));

		scanner.close();
	}


	public static int findFibForN(int n){
		// base case
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return findFibForN(n-1) + findFibForN(n-2);

	}
}
