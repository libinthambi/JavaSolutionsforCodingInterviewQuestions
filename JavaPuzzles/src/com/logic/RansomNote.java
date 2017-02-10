package com.logic;

import java.util.Hashtable;
import java.util.Scanner;

// it is how he is looking like
//it is how he is looking it

public class RansomNote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		Hashtable<String, Integer> ht = new Hashtable<>();
		for (int i = 0; i < m; i++) {
			String str = scanner.next();
			if(ht.get(str)==null)
				ht.put(str, 1);
			else
				ht.put(str, ht.get(str)+1);
		}
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			if(ht.get(str)==null||ht.get(str)==0){
				flag = true;
			}else{
				ht.put(str, ht.get(str)-1);
			}
				
		}
		if(flag)
			System.out.println("No");
		else
			System.out.println("Yes");
		scanner.close();
		
	}
}
