package com.logic;

import java.util.Scanner;

public class Bonetrousle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			long b = scanner.nextLong();
			long div = n/b;
			long remainder = n%b;
			long checkNum = 0;
			if(div%2==0){
				checkNum = div + div/2 + remainder;
			}else{
				checkNum = div -1 + div/2 + remainder;
			}
			if(k < checkNum)
				System.out.println("-1");
			else{
				for (int j = 0; j < k; j++) {
					
				}
			}
		}
		scanner.close();
	}
}
