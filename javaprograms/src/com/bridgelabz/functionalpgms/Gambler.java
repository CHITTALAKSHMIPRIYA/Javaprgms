/*************************************************************************************************************
 * 
 * purpose:Gambler
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/
package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.Utility;

public class Gambler {
	static int BETS=0;//total number of times games played
	static int WINS=0;//total number of times won
   public static void main(String[] args) {
	   System.out.println("enter the stake amount");
		int stake=Utility.Int();
		System.out.println("enter goal");
		int goal=Utility.Int();
		System.out.println("enter the number of times");
		int times=Utility.Int();
		//repeat trial times
		for(int t=0;t<times;t++) 
		{
			int money= stake;
			while(money>0 && money<goal) {
				BETS++;
				if(Math.random()<0.5)
					money++;
				else
					money--;
			}
			if(money==goal)
				WINS++;
		}
		int gw=100*WINS/times;
		int ar=1*BETS/times;
		int loss=times-WINS;
		System.out.println("number of wins="+WINS);
		System.out.println("percentage of wins="+gw);
		System.out.println("average of results="+ar);
		System.out.println("loss="+loss);
		}
		}


