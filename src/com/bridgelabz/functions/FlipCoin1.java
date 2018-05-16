
	
	

/*Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails*/
package com.bridgelabz.functions;
import java.util.Scanner;
public class FlipCoin1 
{

	public static void main(String[] args)
	{
		int h=0, t=0;
		double hp,tp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of times to flip");
		 int n=sc.nextInt();
		
		for(int i=0;i<n;i++);
		{
			double r=Math.random();
			if(r<0.5)
				t++;
			else
				h++;
		}
		hp=h/(double)n*100;
		tp=t/(double)n*100;
		System.out.println("heads="+h);
		System.out.println("tails="+t);
		System.out.println("heads="+hp);
		System.out.println("tails="+tp);
		
		
	}
}
		
	