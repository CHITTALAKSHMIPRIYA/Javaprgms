
package com.bridgelabz.designPatterns.AdapterPattern;

/**
 * this method is written for producing constant volts of 120
 * @author bridgelabz
 *
 */
public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
