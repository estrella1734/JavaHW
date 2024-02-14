package com.shelly.hw3;

public class Sales {

	public static void main(String[] args) {
		int[][]data= {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int[][]price= {{12},{16},{10},{14},{15}};
		int multiRow = data.length;
		// 利用第一個矩陣的row定義新矩陣的row
		int multiCol = price[0].length;
		// 利用第二個矩陣的col定義新矩陣的col
		int[][] multi = new int[multiRow][multiCol];
		for (int k=0; k<data.length; k++)
			for (int i=0; i<price.length; i++)
				for (int j=0; j<price[0].length; j++)
					multi[k][j]+= data[k][i]*price[i][j];
		for (int i=0; i<multiRow; i++){
			for (int j=0; j<multiCol; j++){
				System.out.print(multi[i][j] + " ");
				if (multi[i][j] < 10)System.out.print(" ");
		System.out.println();}

		}
	}

}
