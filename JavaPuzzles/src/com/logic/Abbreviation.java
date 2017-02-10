package com.logic;

import java.util.Scanner;

public class Abbreviation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			String a = scanner.next();
			String b = scanner.next();
			int index =0;
			boolean flag = false;
			if(b.length()>a.length()){
				System.out.println("NO");
			}
			else {
				for (int j = 0; j < b.length(); j++) {
					if(a.indexOf(b.charAt(j)) >= index ){
						index = a.indexOf(b.charAt(j));
						if(b.equalsIgnoreCase(a.substring(index, index + b.length()))){
							a = a.substring(0,index)
									+a.substring((index + b.length()),a.length());
							boolean hasUppercase = !a.equals(a.toLowerCase());
							if(hasUppercase){
								flag = true;
								System.out.println("NO");
								break;
							}else{
								flag = true;
								System.out.println("YES");
								break;
							}
							
						}else if(Character.isUpperCase(a.charAt(index))){
							flag = true;
							System.out.println("NO");
							break;
						}else
							continue;
						/*a = a.substring(0,a.indexOf(Character.toUpperCase(b.charAt(j))))
								+a.substring(a.indexOf(Character.toUpperCase(b.charAt(j)))+1,a.length());*/
					}
					else if(a.indexOf(Character.toLowerCase(b.charAt(j))) >= index){
						index = a.indexOf(Character.toLowerCase(b.charAt(j)));
						if(b.equalsIgnoreCase(a.substring(index, index + b.length()))){
							a = a.substring(0,index)
									+a.substring((index + b.length()),a.length());
							boolean hasUppercase = !a.equals(a.toLowerCase());
							if(hasUppercase){
								flag = true;
								System.out.println("NO");
								break;
							}else{
								flag = true;
								System.out.println("YES");
								break;
							}
							
						}else if(Character.isUpperCase(a.charAt(index))){
							flag = true;
							System.out.println("NO");
							break;
						}else
							continue;
						/*a = a.substring(0,a.indexOf(Character.toUpperCase(b.charAt(j))))
								+a.substring(a.indexOf(Character.toUpperCase(b.charAt(j)))+1,a.length());*/
					}else{
						System.out.println("NO");
						flag = true;
						break;
					}
				}
				if(!flag)
					System.out.println("YES");
			}
		}
		scanner.close();
	}
}
