
package com.bridgelabz.designPatterns.AdapterPattern;

//using inheritance
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
	public Volt get120Volt()
	{
		return getVolt();
	}
	public Volt get12Volt()
	{
		Volt v=getVolt();
		return ConvertVolt(v,10); 
		
	}
	public Volt get3Volt()
	{
		Volt v=getVolt();
		return ConvertVolt(v,40); 
		
	}
	public Volt ConvertVolt(Volt v,int i)
	{
		return new Volt(v.getVolts()/i);
	}

}
