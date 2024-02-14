package com.shelly.hw1;

public class Leapyear {

	public static void main(String[] args) {
		int year = 2300;
		if (year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					System.out.println("閏年");
				else System.out.println("平年");
			}else System.out.println("閏年");
		}else System.out.println("平年");

	}

}
