package com.logic;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int a[] = new int[n];
		int actSum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if(i==k)
				continue;
			actSum = actSum + a[i];
		}
		int charged = scanner.nextInt();
		if(actSum/2==charged){
			System.out.println("Bon Appetit");
		}else{
			System.out.println(charged-actSum/2);
		}
		scanner.close();
	}
}
