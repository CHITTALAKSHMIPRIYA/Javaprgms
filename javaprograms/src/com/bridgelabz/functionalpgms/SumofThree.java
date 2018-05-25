
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
import com.bridgelabz.util.*;
public class SumofThree {
    public static void main(String[] args) {
		System.out.println("enter size of array");
		int size=Utility.Int();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter"+(i+1)+"value");
			ar[i]=Utility.Int();
		}
		int sum=Utility.sumisZero(ar,size);
		System.out.println("No of triplets:"+sum);
		}
    }