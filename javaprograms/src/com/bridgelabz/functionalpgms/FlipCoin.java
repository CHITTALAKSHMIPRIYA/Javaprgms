/*************************************************************************************************************
 * 
 * purpose:FlipCoin and print percentage of heads and tails
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 16-05-17
 * 
 * **************************************************************************************************/
package com.bridgelabz.functionalpgms;

import java.util.Scanner;

//import com.bridgelabz.util.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		
		//INITIALIZATION
		int num,h_cn=0,t_cn=0;
		double head,tail;
		
		Scanner sc =new Scanner(System.in);
		//INPUT DATA
		System.out.print("enter the number of times to flip coin");
		num=sc.nextInt();
		
		for(int k=0;k<num;k++)
		{
			double random=Math.random();
			if(random<0.5)
				t_cn++;
			else
				h_cn++;
		}
		head = h_cn/(double) num*100;
		tail = t_cn / (double)num*100;
		System.out.println(h_cn);
		System.out.println(t_cn);
		System.out.println("Per of heads: " + head + "%");
        System.out.println("Per of tails: " + tail + "%");
		

	}

}
