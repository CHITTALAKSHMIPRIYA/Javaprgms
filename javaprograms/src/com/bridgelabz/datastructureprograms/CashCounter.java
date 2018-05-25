package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Utility;

public class CashCounter {
	static Queue q=new Queue(5);
	static double AMOUNT=0;
public static void main(String[] args) {
	int choice=0;
	System.out.println("enter the  minimum amount to be maintained");
 AMOUNT=Utility.Int(); 
 double totalamount=AMOUNT;
 for(int i=0;i<q.capacity();i++)
 {
    q.enqueue(i);	 
 }
 for(int i=0;i<q.capacity();i++)
 {
	System.out.println("enter 1 to deposit");
	System.out.println("enter 2 to withdraw");
    choice=Utility.Int();
    double cash=0;
    switch(choice)
    {
    case 1:System.out.println("enter the amount to be deposited");
           cash=Utility.Double();
           totalamount=deposit(cash,AMOUNT);
           break;
    case 2:System.out.println("enter the amount to be withdrawed");
    int cash2=Utility.Int();
    totalamount=withdraw(cash2,AMOUNT);
    break;
    }
 }
 }
 public static double deposit(double cash,double amount)
 {
	 amount=amount+cash;
	 q.dequeue();
	 System.out.println(amount);
	 return amount;
 }
 public static double withdraw(double cash2,double amount)
 {
	 if(cash2<amount)
	 {
		 amount=amount-cash2;
	 }
	 System.out.println(amount);
	 return amount;
 }

}