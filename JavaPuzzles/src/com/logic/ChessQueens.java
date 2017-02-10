package com.logic;

import java.util.Scanner;

public class ChessQueens {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		boolean bool[][] = new boolean[N][N]; 

		for (int i = 0; i < N; i++) {
			int row = i;
			int col = 0;
			boolean flag = true;
			keepNextQueen(bool, row, col, N);
			System.out.println(i+" iteration");
			for (int ii = 0; ii < bool.length; ii++) {
				for (int j = 0; j < bool.length; j++) {
					System.out.print(bool[ii][j]+ "\t" );
				}
				System.out.println();
			}
			for (int ii = 0; ii < bool.length; ii++) {
				for (int j = 0; j < bool.length; j++) {
					bool[ii][j] = false;
				}
			}
		}

	}
	public static void keepNextQueen(boolean[][] bool, int row, int col, int N){
		/*if(bool[row][col]){
			return;
		}*/
		for (int i = 0; i < N; i++) {
			bool[row][i] = true;
			bool[i][col] = true;
			//bool[i][i] = true;
		}
		for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
			bool[i][j] = true;
		}
		for (int i = row+1, j = col+1; i < N && j < N; i++,j++) {
			bool[i][j] = true;
		}
		for (int i = row-1, j = col+1; i >= 0 && j < N; i--,j++) {
			bool[i][j] = true;
		}
		for (int i = row+1, j = col-1; i < N && j >=0; i++,j--) {
			bool[i][j] = true;
		}
		/*for (int ii = 0; ii < bool.length; ii++) {
			for (int j = 0; j < bool.length; j++) {
				System.out.print(bool[ii][j]+ "\t" );
			}
			System.out.println();
		}*/
		bool[row][col] = false;
		/*for (int ii = 0; ii < bool.length; ii++) {
			for (int j = 0; j < bool.length; j++) {
				System.out.print(bool[ii][j]+ "\t" );
			}
			System.out.println();
		}*/
		if(col == N-1)
			return;
		else
			col ++;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if(bool[i][col]){
				count++;
				continue;
			}else{
				count = 0;
				System.out.println(i + "        " + col);

				keepNextQueen(bool, i, col, N);
				if(col >= N-1){
					for (int ii = 0; ii < bool.length; ii++) {
						for (int j = 0; j < bool.length; j++) {
							System.out.print(bool[ii][j]+ "\t" );
						}
						System.out.println();
					}
					System.exit(0);
				}
				bool = resetBool(bool, row, col, N);

			}
			//Arraylist storing rows and colums
			//rowColList = new ArrayList<>();
			//rowColList.add(i+"#"+col);
		}

		/*for (Iterator iterator = rowColList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			String []splitArr = string.split("#");
			if(flag)
				flag = keepNextQueen(bool, Integer.parseInt(splitArr[0]), Integer.parseInt(splitArr[1]), N, true);
		}*/
		if(count == 8){
			System.out.println("ignoring -- fails");
			count = 0;
		}
	}
	public static boolean[][] resetBool(boolean [][] bool, int row, int col,int N){
		boolean bool1[][] = new boolean[N][N]; 

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < col; j++) {
				if(!bool[i][j]){
					bool1 = resetBool2(bool1, i, j, N);
				}
			}
		}

		return bool1;
	}

	public static boolean[][] resetBool2(boolean [][] bool, int row, int col,int N){
		for (int i = 0; i < N; i++) {
			bool[row][i] = true;
			bool[i][col] = true;
			//bool[i][i] = true;
		}
		for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
			bool[i][j] = true;
		}
		for (int i = row+1, j = col+1; i < N && j < N; i++,j++) {
			bool[i][j] = true;
		}
		for (int i = row-1, j = col+1; i >= 0 && j < N; i--,j++) {
			bool[i][j] = true;
		}
		for (int i = row+1, j = col-1; i < N && j >=0; i++,j--) {
			bool[i][j] = true;
		}
		/*for (int ii = 0; ii < bool.length; ii++) {
			for (int j = 0; j < bool.length; j++) {
				System.out.print(bool[ii][j]+ "\t" );
			}
			System.out.println();
		}*/
		bool[row][col] = false;
		return bool;
	}
}
