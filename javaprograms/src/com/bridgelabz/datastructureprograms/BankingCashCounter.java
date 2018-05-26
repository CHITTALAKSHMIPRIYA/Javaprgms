
package com.bridgelabz.datastructureprograms;

import java.util.Random;

import com.bridgelabz.util.Utility;

public class BankingCashCounter {
	public static void bankTransaction(Queue queue) {
		System.out.println("enter initial amount");
		Double sum=Utility.Double();
		System.out.println("Initial amount:"+sum);
	    Random rand=new Random();
	    int noOfPeople=rand.nextInt(7);
	    System.out.println(noOfPeople+" persons in queue");
	 for(int i=0;i<noOfPeople;i++)
	 {
	    queue.enqueue((i+1)+" person");	 
	 }
	 for(int i=0;i<noOfPeople;i++)
	 {
		System.out.println("enter 1 to deposit");
		System.out.println("enter 2 to withdraw");
	    int choice=Utility.Int();
	    
	    switch(choice)
	    {
	    case 1:System.out.println("enter the amount to be deposited");
	          double  cash=Utility.Double();
	           sum=sum+cash;
	           queue.dequeue();
	          break;
	    
	    case 2:System.out.println("enter the amount to be withdrawed");
	    double withdraw=Utility.Double();
	    if(withdraw>sum)
	    {
	    	System.out.println("no enough money in bank");
	    	queue.dequeue();
	    }
	    else
	    {
	    	sum=sum-withdraw;
	    	queue.dequeue();
	    }
	    break;
	    default:System.out.println("wrong choice");
	    i--;
	    break;
	    }
	    System.out.println("updated money to bank:"+sum);
	 }
	 }}


