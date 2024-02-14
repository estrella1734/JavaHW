package com.shelly.hw1;

public class Electricity {

	public static void main(String[] args) {
		boolean business = true;
		int kwh = 50;
		if (business = true) {
			if (kwh<=330)
				System.out.println(kwh*2.12);
			else {
				if (kwh<=700)
				System.out.println(330*2.12+(kwh-330)*2.91);
				else{
					if (kwh<=1500)
				System.out.println(330*2.12+(700-330)*2.91+(kwh-700)*3.44);
					else System.out.println(330*2.12+(700-330)*2.91+(1500-700)*3.44+(kwh-1500)*5.05);
			}
		}

		}else {
			if(kwh<=500) {
				if(kwh<=120)
					System.out.println(kwh*1.63);
				else{
					if(kwh<=330) 
						System.out.println(120*1.63+(kwh-120)*2.10);
					else System.out.println(120*1.63+(330-120)*2.10+(kwh-330)*2.89);
					}
				}
			else {
				if(kwh<=700)
					System.out.println(120*1.63+(330-120)*2.10+(500-330)*2.89+(kwh-500)*3.94);
				else{
					if(kwh<=1000)
						System.out.println(120*1.63+(330-120)*2.10+(500-330)*2.89+(700-500)*3.94+(kwh-700)*4.60);
					else System.out.println(120*1.63+(330-120)*2.10+(500-330)*2.89+(700-500)*3.94+(1000-700)*4.60+(kwh-1000)*5.03);
				}
			}
		}
}
}