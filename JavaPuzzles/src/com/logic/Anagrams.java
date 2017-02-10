package com.logic;

import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j))
				{
					str1=str1.substring(0,i)+str1.substring(i+1,str1.length());
					str2=str2.substring(0,j)+str2.substring(j+1,str2.length());
					i--;

					break;
				}

			}
		}
		System.out.println(str1.length()+str2.length());
		scanner.close();
	}
}
