package com.logic;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FunctionalPalindromes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 100001;
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		String str = scanner.next();
		for (int i = 0; i < q; i++) {
			
		}
		scanner.close();
	}


	public static Set<CharSequence> printAllPalindromes(String input) {
		if (input.length() <= 2) {
			return Collections.emptySet();
		}
		Set<CharSequence> out = new HashSet<CharSequence>();
		int length = input.length();
		for (int i = 1; i < length - 1; i++) {
			for (int j = i - 1, k = i + 1; j >= 0 && k < length; j--, k++) {
				if (input.charAt(j) == input.charAt(k)) {
					out.add(input.subSequence(j, k + 1));
				} else {
					break;
				}
			}
		}
		return out;
	}
}
