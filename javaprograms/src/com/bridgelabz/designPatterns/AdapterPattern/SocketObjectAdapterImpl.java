
package com.bridgelabz.designPatterns.AdapterPattern;
//using composition
public class SocketObjectAdapterImpl extends Socket implements SocketAdapter {
	private Socket s = new Socket();

	public Volt get120Volt() {
		return s.getVolt();
	}

	public Volt get12Volt() {
		Volt v = s.getVolt();
		return ConvertVolt(v, 10);

	}

	public Volt get3Volt() {
		Volt v = s.getVolt();
		return ConvertVolt(v, 40);

	}

	public Volt ConvertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
