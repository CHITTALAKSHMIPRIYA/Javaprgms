
package com.bridgelabz.ObjectOrientedPrograms.InventoryPojo;

import java.io.File;
/*************************************************************************************************************
 * 
 * purpose:Create a JSON file having Inventory Details for Rice, Pulses and Wheats
   with properties name, weight, price per kg
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 2-06-18
 * 
 * *************************************************************************************************/
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class inventorData {
	static String string = "", string1 = "", string2 = "";
	static int value;
	static int sumRice;
	static int totalRice;
	static int sumWheat;
	static int totalWheat;
	static int sumPulses;
	static int totalPulses;

	public static void main(String[] args) throws IOException, ParseException {
		InventoryPojoClass invent = new InventoryPojoClass();
		ObjectMapper map = new ObjectMapper();
		System.out.println("enter types of rice");
		value = Utility.Int();
		Product product=new Product();
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getRiceList().add(product);
		}
		System.out.println("enter types of wheat");
		value = Utility.Int();
		Product wheat = new Product();
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getWheatList().add(product);
		}
		System.out.println("enter types of pulses");
		value = Utility.Int();
		Product pulse = new Product();
		for (int i = 0; i < value; i++) {
			product = productMethod();
			invent.getPulseList().add(product);
		}
		map.writeValue(new File("/home/bridgelabz/Javaprograms/javaprograms/src/com/"
				+ "bridgelabz/ObjectOrientedPrograms/InventoryPojo/invent.json"), invent);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/home/bridgelabz/Javaprograms/javaprograms/src/com/"
				+ "bridgelabz/ObjectOrientedPrograms/InventoryPojo/invent.json"));
		JSONObject jsonobject = (JSONObject) obj;
		JSONArray rice1 = (JSONArray) jsonobject.get("riceList");
		for (int i = 0; i < rice1.size(); i++)
		{
			JSONObject objrice = (JSONObject) (rice1.get(i));
			sumRice += (Integer.parseInt(objrice.get("weight").toString()) * (Integer.parseInt (objrice.get("price").toString())));
			totalRice +=(Integer.parseInt( objrice.get("weight").toString()));
		}
		System.out.println(sumRice);
		System.out.println(totalRice);
		JSONArray wheat1 = (JSONArray) jsonobject.get("wheatList");
		for (int i= 0; i < wheat1.size(); i++)
			
		{
			JSONObject objwheat = (JSONObject) (wheat1.get(i));
			sumWheat +=  (Integer.parseInt(objwheat.get("weight").toString()) * (Integer.parseInt(objwheat.get("price").toString())));
			totalWheat += (Integer.parseInt( objwheat.get("weight").toString()));
		}
		System.out.println(sumWheat);
		System.out.println(totalWheat);
		JSONArray pulse1 = (JSONArray) jsonobject.get("pulseList");
		for (int i= 0; i < pulse1.size(); i++)
			
		{
			JSONObject objpulse = (JSONObject) (pulse1.get(i));
			sumPulses += (Integer.parseInt(objpulse.get("weight").toString()) *(Integer.parseInt(objpulse.get("price").toString())));
			totalPulses += (Integer.parseInt(objpulse.get("weight").toString()));
		}
		System.out.println(sumPulses);
		System.out.println(totalPulses);
		
	}
	public static Product productMethod() {
		Product product=new Product();
		System.out.println("enter name of rice");
		string = Utility.String();
		product.setType(string);
		System.out.println("enter weight of rice");
		string1 = Utility.String();
		product.setWeight(string1);
		System.out.println("enter price of rice");
		string2 = Utility.String();
		product.setPrice(string2);
		return product;
	}

	
	
}
