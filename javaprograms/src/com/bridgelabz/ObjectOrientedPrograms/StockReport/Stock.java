
package com.bridgelabz.ObjectOrientedPrograms.StockReport;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import com.bridgelabz.util.Utility;
/*************************************************************************************************************
 * 
 * purpose:Program to read in Stock Names, Number of Share, Share Price.
   Print a Stock Report with total value of each Stock and the total value of Stock.
 * 
 * @author Lakshmi Priya
 * @version 1.0
 * @since 2-06-18
 * 
 * *************************************************************************************************/
public class Stock {
	static int sumStock=0;
	static int totalStock=0;
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		StockPortfolio folio=new StockPortfolio();
		ObjectMapper map=new ObjectMapper();
		System.out.println("enter no. of stocks");
		int noOfStock=Utility.Int();
		PojoStock stock=new PojoStock();
		for(int i=0;i<noOfStock;i++)
		{
			stock=stockMethod();
			folio.getstockList().add(stock);
		}
		map.writeValue(new File("/home/bridgelabz/Javaprograms/javaprograms/src/com/"
				+ "bridgelabz/ObjectOrientedPrograms/StockReport/stock.json"), folio);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/home/bridgelabz/Javaprograms/javaprograms/src/com/"
				+ "bridgelabz/ObjectOrientedPrograms/StockReport/stock.json"));
		JSONObject jsonobject = (JSONObject) obj;
		JSONArray stock1 = (JSONArray) jsonobject.get("stockList");
		for (int i = 0; i < stock1.size(); i++)
		{
			JSONObject objstock = (JSONObject) (stock1.get(i));
			sumStock += (Integer.parseInt(objstock.get("stockShare").toString())) * (Integer.parseInt (objstock.get("sharePrice").toString()));
			totalStock +=(Integer.parseInt( objstock.get("stockShare").toString()));
		}
		System.out.println(sumStock);
		System.out.println(totalStock);
	}
		public static PojoStock stockMethod()
		{
			
			PojoStock stock = new PojoStock();
			System.out.println("enter stock name");
			String stockname=Utility.String();
			stock.setStockName(stockname);
			System.out.println("enter no of shares");
			String stockShare=Utility.String();
			stock.setStockShare(stockShare);
			System.out.println("enter share price");
			String sharePrice=Utility.String();
			stock.setSharePrice(sharePrice);
			return stock;
			
	}

}
