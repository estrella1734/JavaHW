package com.shelly.hw2;

public class Amstrong {

	public static void main(String[] args) {
		int n = 100;
		while(n<=999) {
		if (n==
		Math.pow(n/100, 3)+
		Math.pow(n%100/10, 3)+
		Math.pow(n%100%10, 3))
		{System.out.println(n);}
		n++;}

}
}