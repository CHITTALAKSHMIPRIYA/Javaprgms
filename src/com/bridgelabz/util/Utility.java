package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility
{
public static void scanner(int num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextInt();
}
public static void scanner(String string)
{
	Scanner sc=new Scanner(System.in);
	string =sc.nextLine();
}
public static void scanner(double num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextDouble();
}
public static boolean scanner(boolean num)
{
	Scanner sc=new Scanner(System.in);
	num =sc.nextBoolean();
	return num;
}
/**
 * Function to check leap year or not
 *@param year
 * 
 */

public  static boolean leap(int year)
{
if(year>1000)
{
	if((year%400==0)||(year%4==0&&year%100!=0))
	{
		return true;
	}
}
return false;
}

/**
 * Function to generate random number
 *
 * @param number the number to generate random number
 */

    public static void random(int n,int ar[])

    {
    	for(int i=0;i<n;i++)
    	{
    		ar[i]=(int)(Math.random()*100);
    		for(int j=0;j<i;j++)
    		{
    			if(ar[i]==ar[j])
    			{
    				i--;
    				break;
    			}
    		}
    	}
    }

 /**
  * Function to eliminate duplicate number and print distinct coupon number
  */

    public static void distinct(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		boolean found=false;
    		for(int j=0;j<i;j++)
    		
    		if(arr[i]==arr[j])
    		{
    			found=true;
    			break;
    		}
    		if(!found)
    			System.out.print(arr[i]+" ");
    	}
    		System.out.println();;
    }
/**
 * Function for power of 2
 *
 * @param number for power of 2
 */

public static void pwr(int num)
{
	for(int i=0;i<num;i++)
	{
	System.out.println("power of 2^ "+i+" is "+Math.pow(2,i));
	}
}

/**
 * Function for 2D Array
 *
 * @param number for 2D Array
 */

public static void input(int row,int col,int choice)
{
	Scanner sc=new Scanner(System.in);
	switch(choice)
	{
	case 1:int[][] intAr=new int[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<intAr.length;i++)
	{
		for(int j=0;j<intAr.length;j++)
		{
			intAr[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elements are");
	printArrayElement(intAr);
	break;
	case 2:String [][] strAr=new String[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<strAr.length;i++)
	{
		for(int j=0;j<strAr.length;j++)
		{
			strAr[i][j]=sc.next();
		}
	}
	System.out.println("array elements are");
	printArrayElement(strAr);
	break;
	case 3:double[][] doubleAr=new double[row][col];
	System.out.println("enter the elements of array");
    for(int i=0;i<doubleAr.length;i++)
	{
		for(int j=0;j<doubleAr.length;j++)
		{
			doubleAr[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elements are");
	printArrayElement(doubleAr);
	break;
	}
}
public static  void printArrayElement(int[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}

public static  void printArrayElement(String[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}
public static  void printArrayElement(double[][] ar)
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
		System.out.println();;
	}
}
//Sum of three integers is 0
public static int sumisZero(int[] a,int length)
{
	int count=0;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			for(int k=i+1;k<length;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					System.out.println(a[i]+ " "+a[j]+ " "+a[k]);
					count++;
				}
			}
		}
	}
	return count;
}
/**
 * Function to replace String
 *
 * 
 */
    public static String replace(String input)
	{
		
		String s="Hello <<username>>, How are you?";
		String str=s.replaceAll("<<username>>",input);
		return str;
	}

/**
 * Function for permutation of a String
 *
 * @param number for permutation
 */
	public static void permutation(String str,int start,int end)
	{
		if(start==end)
			System.out.println(str);
		else
		{
			for(int i=start;i<=end;i++) 
			{
				str=swap(str,start,i);
				permutation(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
	public static String swap(String a,int i,int j)
	{
		char[] ch=a.toCharArray();
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		return String.valueOf(ch);
	}
}

