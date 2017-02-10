package com.logic;

import java.util.Scanner;

public class MatrixFlipping {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for (int k = 0; k < q; k++) {
			int n = scanner.nextInt();
			int a[][] = new int[2*n][2*n];
			for (int i = 0; i < 2*n; i++) {
				for (int j = 0; j < 2*n; j++) {
					a[i][j]= scanner.nextInt();
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum = sum + max(a[i][j],a[i][2*n-1-j],a[2*n-1-i][j],a[2*n-1-i][2*n-1-j]);
				}
			}
			System.out.println(sum);
		}
		scanner.close();
		
	}
	public static int max(int a, int b, int c, int d) {

	    int max = a;

	    if (b > max)
	        max = b;
	    if (c > max)
	        max = c;
	    if (d > max)
	        max = d;

	     return max;
	}
}
