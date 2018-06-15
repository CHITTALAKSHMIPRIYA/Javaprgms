
package com.bridgelabz.designPatterns.FactoryPattern;


public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","600 GB","2.8 GHz");
		Computer server = ComputerFactory.getComputer("server","32 GB","1 TB","2.9 GHz");
		Computer laptop = ComputerFactory.getComputer("laptop","16 GB","2 TB","2.9 GHz");
		System.out.println("Factory PC :"+pc);
		System.out.println("Factory Server:"+server);
		System.out.println("Factory Laptop:"+laptop);
	}

	

}
