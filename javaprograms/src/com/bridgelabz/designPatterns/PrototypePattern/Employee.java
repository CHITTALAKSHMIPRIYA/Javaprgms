
package com.bridgelabz.designPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	private List<String> emplList;
	public Employee()
	{
		emplList=new ArrayList<String>();
	}
	public Employee(List<String> list)
	{
		this.emplList=list;
	}
	public void loadDetails()
	{
		emplList.add("chaithra");
		emplList.add("vasu");
		emplList.add("mani");
	}
	public List<String> getemplList()
	{
		return emplList;
	}
	public Object clone()
	{
		List<String> temp =new ArrayList<String>();
		for(String s:this.getemplList())
		{
			temp.add(s);
		}
		return new Employee(temp);
	}
	

}
