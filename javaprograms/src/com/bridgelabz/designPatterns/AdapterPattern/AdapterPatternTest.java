
package com.bridgelabz.designPatterns.AdapterPattern;


public class AdapterPatternTest {

	
	public static void main(String[] args) {
		testObjectAdapter();
		testClassAdapter();

	}
	
	public static void testObjectAdapter()
	{
		SocketAdapter sock=new SocketObjectAdapterImpl();
		Volt v3=getVolt(sock,3);
		Volt v12=getVolt(sock,12);
		Volt v120=getVolt(sock,120);
		System.out.println("v3 volts using Object Adapter "+v3.getVolts());
		System.out.println("v12 volts using Object Adapter "+v12.getVolts());
		System.out.println("v120 volts using Object Adapter "+v120.getVolts());
	}
	public static void testClassAdapter()
	{
		SocketAdapter sock=new SocketClassAdapterImpl();
		Volt v3=getVolt(sock,3);
		Volt v12=getVolt(sock,12);
		Volt v120=getVolt(sock,120);
		System.out.println("v3 volts using Object Adapter "+v3.getVolts());
		System.out.println("v12 volts using Object Adapter "+v12.getVolts());
		System.out.println("v120 volts using Object Adapter "+v120.getVolts());
	}
	private static Volt getVolt(SocketAdapter sock, int i) {
		switch (i){
		case 3: return sock.get3Volt();
		case 12: return sock.get12Volt();
		case 120: return sock.get120Volt();
		default: return sock.get120Volt();
		}
	}

}
