
/*************************************************************************************************************
 * 
 * purpose:Sum of three numbers is 0
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 17-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;
import java.util.Scanner;
import com.bridgelabz.util.*;
public class SumofThree {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter"+(i+1)+"value");
			ar[i]=sc.nextInt();
		}
		int sum=Utility.sumisZero(ar,size);
		System.out.println("No of triplets:"+sum);
		}
    }