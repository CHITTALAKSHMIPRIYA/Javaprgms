
/*************************************************************************************************************
 * 
 * 
 * purpose:Stopwatch Program for measuring the time that elapses between the start and end clicks
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 18-05-18
 * 
 * *************************************************************************************************/
package com.bridgelabz.functionalpgms;
import com.bridgelabz.util.Utility;

public class StopWatch 
{
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
//to start timer
public void start()
{
	startTimer=System.currentTimeMillis();
	System.out.println("starttime="+startTimer);
}
//to stop timer
public void stop()
{
	stopTimer=System.currentTimeMillis();
	System.out.println("stoptime="+stopTimer);
}
public long elapsedTime()
{
	elapsed=stopTimer-startTimer;
	return elapsed;
}
public static void main(String[] args)
{
	StopWatch sw=new StopWatch();
	System.out.println("press any button to start time:");
	Utility.Int();
	sw.start();
	System.out.println();
	System.out.println("press any button to stop time:");
	Utility.Int();
	sw.stop();
	long l=sw.elapsedTime();
	System.out.println("elapsed time="+l);
	
}
}


