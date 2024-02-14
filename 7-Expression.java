package com.shelly.hw2;

public class Expression {

	public static void main(String[] args) {
		int n=1;
		int sum=0;
		while(n<=50) {
			sum +=Math.pow(-1, (n-1))*n*n;
			n++;
		}System.out.println(sum);

	}

}
