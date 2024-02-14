package com.shelly.hw2;

public class Prime {

	public static void main(String[] args) {
		int m = 2 ;
		int number = 10;
		while (m<=number) {
		int n = 1;
		int sum =0;
		while (n<m) {
			if(m%n==0) {
			sum += n ;
			}n++;
			if(sum==1)
				System.out.println(m);}
		}}

	}