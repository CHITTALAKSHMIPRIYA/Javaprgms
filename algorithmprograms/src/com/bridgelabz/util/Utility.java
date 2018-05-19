
package com.bridgelabz.util;

import java.util.Arrays;

public class Utility {
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isAnagram(String a,String b)
	{
		a=a.replaceAll("\\s","").toLowerCase();
		b=b.replaceAll("\\s","").toLowerCase();
		boolean f=false;
		char[] c=a.toCharArray();
		Arrays.sort(c);
		char[] d=b.toCharArray();
		Arrays.sort(d);
		String A=new String(c);
		String B=new String(d);
		if(A.equals(B))
		{
			f=true;
		}
		return f;
		}
	
	/**
	 * function to find prime numbers from 0 to 10000 
	 * @param start
	 * @param end
	 * @param count
	 */
	public static void prime(int start,int end, int count)
	{
	for(int i=start;i<end;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count=0;
				break;
			}
			else 
			  count=1;
		}
		if(count==1)
			System.out.println(i);
		}
	}

//
	public static void primePalAgm(int num)
	{
		int count=0;
		for(int i=0;i<num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
					count=1;
			}
		}
	}
	
	/**
	 * function for bubble sort
	 * @param ar
	 * @return
	 */
	public static int[] bubbleSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int month,int day,int year)
	{
		System.out.println("entered date is"+month+"/"+day+"/"+year);
	int	y0 = year - (14 - month) / 12;
	System.out.println(y0);
	int x = y0 + y0/4 - y0/100 + y0/400;
	System.out.println(x);
int	m0 = month + 12 * ((14 -month) / 12) -2;
System.out.println(m0);
int d0 = (day + x + 31*m0/ 12) % 7;
System.out.println(d0);
return d0;
}
	
	/**
	 * function to calculate fahrenheit
	 * @param cel
	 */
	public static void celTofar(double cel)
	{
		double farh=cel*((double)(9/5))+32;
		System.out.println("Fahrenheit="+farh);
	}
	/**
	 * function to calculate celsius
	 * @param farh
	 */
	public static void farhTocel(double farh)
	{
		double cel=(farh-32)*5/9;
		System.out.println("celsius="+cel);
	}
	
	/**
	 * function to calculate payment
	 * @param p
	 * @param y
	 * @param r
	 */
	public static void monthlyPay(double p,double y, double r)
	{
	  double n=12*y;
	  double rate=r/(12*100);
	  double payment=(p*rate)/(1-Math.pow(1+rate,-n));
	  System.out.println("payment="+payment);
	}
}

	
