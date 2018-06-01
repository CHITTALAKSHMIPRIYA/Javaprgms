
package com.bridgelabz.ObjectOrientedPrograms.InventoryPojo;

import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class InventoryPojoClass {
    public static void main(String[] args) {
		ObjectMapper map=new ObjectMapper();
		PojoRice pr=new PojoRice();
		pr.setPrice("55");
		pr.setType("Basmathi Rice");
		pr.setWeight("5");
		PojoRice pr1=new PojoRice();
		pr1.setPrice("40");
		pr1.setType("Steamed Rice");
		pr1.setWeight("2");
		PojoRice pr2=new PojoRice();
		pr2.setPrice("65");
		pr2.setType("Jasmine Rice");
		pr2.setWeight("10");
		
  try {
	  FileWriter fr=new FileWriter("/home/bridgelabz/inm.json");
	  String json=map.writeValueAsString(pr);
	  System.out.println(json);
	  fr.write(json);
	  fr.flush();
	  String json1=map.writeValueAsString(pr1);
	  System.out.println(json1);
	  fr.write(json1);
	  fr.flush();
	  String json2=map.writeValueAsString(pr2);
	  System.out.println(json2);
	  fr.write(json2);
	  fr.flush();
	 }
  catch(IOException e)
  {
	  e.printStackTrace();
  }



}}
