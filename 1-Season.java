package com.shelly.hw1;

public class Season {

	public static void main(String[] args) {
		int num = 11;
		switch(num) {
		case 1,2,3:
			System.out.println("春");
			break;
		case 4,5,6 :
			System.out.println("夏");
			break;
		case 7,8,9:
			System.out.println("秋");
			break;
		case 10,11,12:
			System.out.println("冬");
			break;
		default:
			System.out.println("輸入錯誤");
		}
	}
}
