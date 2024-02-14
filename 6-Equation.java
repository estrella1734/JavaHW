package com.shelly.hw1;

public class Equation {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 1;
		int root = b*b-4*a*c ;
		if (root>=0) {
			if(root==0)
				System.out.println(-b/(2*a));
			else System.out.println(-b+root^(1/2)/(2*a));
		}else System.out.println("沒有實根");
	}

}
