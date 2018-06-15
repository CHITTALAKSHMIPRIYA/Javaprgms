
package com.bridgelabz.designPatterns.PrototypePattern;

import java.util.List;

public class PrototypePattern {

	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.loadDetails();
		Employee e1=(Employee)emp.clone();
		Employee e2=(Employee)emp.clone();
		List<String> l1=e1.getemplList();
		l1.add("lakshmi");
		List<String> l2=e2.getemplList();
		l2.remove("mani");
		System.out.println("emps List: "+emp.getemplList());
		System.out.println("e1: "+l1);
		System.out.println("e2: "+l2);

	}

}
