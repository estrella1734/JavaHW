package com.shelly.hw1;

public class Refund {

	public static void main(String[] args) {
		int payable =1300;
		int payment =25400;
		int change = payment-payable;
		if (payment <= payable) {
			if(payment == payable)
				System.out.println("不必找錢");
			else System.out.println("金額不足");
		}else {
			if (change<100){
				if(change<50) {
					if(change<10) {
						if(change<5)
							System.out.println(change+"個1元");
						else System.out.println("1個5元"+(change-5)+"個1元");
					}else System.out.println(change/10+"個10元"+(change%10)/5+"個5元"+(change%10)%5+"個1元");
				}else System.out.println(change/50+"個50元"+(change%50)/10+"個10元"+(change%50)%10/5+"個5元"+((change%50)%10)%5+"個1元");

					
				
				
			}
			else {
				if (change>=500) {
					if(change>=1000)
						System.out.println(change/1000+"張1000元"+(change%1000)/500+"張500元"+(change%1000)%500/100+"張100元"+(change%1000)%500%100/50+"個50元"+(change%1000)%500%100%50/10+"個10元"+(change%1000)%500%100%50%10/5+"個5元"+(change%1000)%500%100%50%10%5+"個1元");
					else System.out.println (change/500+"張500元"+(change%500)/100+"張100元"+(change%500)%100/50+"個50元"+change%500%100%50/10+"個10元"+change%500%100%50%10/5+"個5元"+change%500%100%50%10%5+"個1元");
			}else System.out.println (change/100+"張100元"+change%100/50+"個50元"+change%100%50/10+"個10元"+change%100%50%10/5+"個5元"+change%100%50%10%5+"個1元");
		}
			
		}

	}

}
