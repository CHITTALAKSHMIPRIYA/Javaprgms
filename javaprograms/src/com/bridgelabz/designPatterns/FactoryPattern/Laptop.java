
package com.bridgelabz.designPatterns.FactoryPattern;


public class Laptop extends Computer{
	private String ram;
	 private String hdd;
	 private String cpu;
	/**
	 * @param ram
	 * @param hdd
	 * @param cpu
	 */
	public Laptop(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	public String getRAM() {
		return this.ram;
	}

	public String getHDD() {
		return this.hdd;
	}

	public String getCPU() {
		return this.cpu;
	}
}
