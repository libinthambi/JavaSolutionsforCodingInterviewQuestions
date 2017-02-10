package com.logic;

import java.util.Scanner;

public class CombinationalLock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1[] = new int[5];
		int a2[] = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			a1[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			a2[i] = scanner.nextInt();
			if(Math.abs(a1[i] - a2[i])> 5){
				if(a1[i] < a2[i]){
					sum = sum + 10+ a1[i] - a2[i];
				}else if(a1[i] > a2[i]){
					sum = sum + 10+ a2[i] - a1[i];
				}
				continue;
			}
			sum = sum +  Math.abs(a1[i] - a2[i]);
		}
		System.out.println(sum);
		scanner.close();
	}
}
