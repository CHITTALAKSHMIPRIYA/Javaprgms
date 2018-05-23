package com.bridgelabz.functionalpgms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp");
		double t=sc.nextDouble();
		System.out.println("enter speed");
		double v=sc.nextDouble();
		if(t<50 && (v>3 && v<120))
		{
			double q=Math.pow(v,0.16);
			double w=35.74+(0.6215*t)+(((0.4275*t)-35.75))*q;
			System.out.println("Temp="+t);
			System.out.println("Speed="+v);
			System.out.println("windchill="+w);
		}}
}