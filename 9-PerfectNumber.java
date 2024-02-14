package com.shelly.hw2;

public class PerfectNumber {

	public static void main(String[] args) {
		int m = 1;
		while (m<=100) {
		int n = 1;
		int sum = 0;
		while (n<=m) {  
		if (m%n == 0) {
			sum = sum + n;
		}n++;
		}if (m== sum-m) 
			System.out.println(sum-m);
		m++;
	}
}}
	//System.out.println(n);