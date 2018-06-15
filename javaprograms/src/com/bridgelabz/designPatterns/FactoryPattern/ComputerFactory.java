
package com.bridgelabz.designPatterns.FactoryPattern;


public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type))
		{
			System.out.println("Type PC found");
	  return new PC(ram, hdd, cpu);
		}
		else if("Server".equalsIgnoreCase(type)) {
			System.out.println("Type Server found");
			return new Server(ram, hdd, cpu);
		}
		else if("Laptop".equalsIgnoreCase(type))
			{
			System.out.println("Type Server found");
			return new Laptop(ram, hdd, cpu);
			}
		else
			System.out.println("not found");
		return null;
	}
}
