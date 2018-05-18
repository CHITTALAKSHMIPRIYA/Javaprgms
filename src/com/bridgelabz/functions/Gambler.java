/*************************************************************************************************************
 * 
 * purpose:Gambler
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * **************************************************************************************************/
<<<<<<< HEAD
=======


>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b
package com.bridgelabz.functions;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int stake=sc.nextInt();
		int goal=sc.nextInt();
		int times=sc.nextInt();
		int bets=0;//total number of times games played
		int wins=0;//total number of times won
		//repeat trial times
		for(int t=0;t<times;t++) 
		{
			int money= stake;
			while(money>0 && money<goal) {
				bets++;
				if(Math.random()<0.5)
					money++;
				else
					money--;
			}
			if(money==goal)
				wins++;
		}
		int gw=100*wins/times;
		int ar=1*bets/times;
		int loss=times-wins;
		System.out.println("number of wins="+wins);
		System.out.println("percentage of wins="+gw);
		System.out.println("average of results="+ar);
		System.out.println("loss="+loss);
<<<<<<< HEAD
		}
		}
=======
		
		
		
		}
		

	}
>>>>>>> 46deab3c7bb349c3d837f86c0c6412d162af240b


