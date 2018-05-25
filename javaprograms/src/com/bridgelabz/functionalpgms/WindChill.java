package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.Utility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("enter temp");
		double t=Utility.Double();
		System.out.println("enter speed");
		double v=Utility.Double();
		if(t<50 && (v>3 && v<120))
		{
			double q=Math.pow(v,0.16);
			double w=35.74+(0.6215*t)+(((0.4275*t)-35.75))*q;
			System.out.println("Temp="+t);
			System.out.println("Speed="+v);
			System.out.println("windchill="+w);
		}}
}