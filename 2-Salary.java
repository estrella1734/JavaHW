package com.shelly.hw1;

public class Salary {

	public static void main(String[] args) {
		int hour = 40;
		if (hour>60) {
			if(hour<=80)
				System.out.println(60*150+(hour-60)*150*1.25);
			else System.out.println(60*150+20*150*1.25+(hour-80)*150*1.5);
		}else System.out.println(hour*150);

	}

}
