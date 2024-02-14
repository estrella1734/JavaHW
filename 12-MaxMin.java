package com.shelly.hw3;

public class MaxMin {

	public static void main(String[] args) {
		int[]data= {1,2,3,4,5,6,7,8,9,100};
		int max = data[0];
		int min = data[0];
		for(int i=0 ; i<data.length ; i++) {
			if (data[i]>=max){
				max=data[i];
			}else if
			(data[i]<=min) {
				min=data[i];
			}
		}System.out.println("最大值="+max);
		System.out.println("最小值="+min);
		}

	}


