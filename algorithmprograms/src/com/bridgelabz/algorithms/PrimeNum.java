

package com.bridgelabz.algorithms;
import com.bridgelabz.util.Utility;

import java.util.Scanner;

public class PrimeNum {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter start");;
	   int start=sc.nextInt();
	   System.out.println("enter end");;
	   int end=sc.nextInt();
	   System.out.println("enter count");;
	   int count=sc.nextInt();
	   Utility.prime(start,end,count);
   }
		
	}


