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
import com.bridgelabz.util.Utility;
public class FlipCoin {
	static int H_CN = 0, T_CN = 0;
	static double HEAD,TAIL;
public static void main(String[] args) {
		// INPUT DATA
		System.out.print("enter the number of times to flip coin");
		int num = Utility.Int();
		for (int k = 0; k < num; k++) {
			double random = Math.random();
			if (random < 0.5)
				T_CN++;
			else
				H_CN++;
		}
		HEAD= H_CN/ (double) num * 100;
		System.out.println(H_CN);
		System.out.println(T_CN);
		System.out.println("Per of heads: " +HEAD + "%");
		System.out.println("Per of tails: " +(100-HEAD));
}
}
