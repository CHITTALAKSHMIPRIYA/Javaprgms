
package com.bridgelabz.ObjectOrientedPrograms.Commercialdataprocessing;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.util.Utility;

public class Stockaccount {
static String name;
static double presBalance;
static File f;


public Stockaccount()
{
	System.out.println("enter user name");
	String filename=Utility.String();
	new Stockaccount(filename);
}
public Stockaccount(String filename)
{
	f=new File(""+filename);
	try {
		if(f.createNewFile())
		{
			System.out.println("New account created ="+filename);
		}
		else
		{
			System.out.println("Account found");
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
//to return updated balance of user
public double valueOf()
{
	return presBalance;
}
//method to buy a stock and update user file as well json file
public void buy(int amount,String symbol)
{
	LinkedList temp=stockobjectcreation();
	JSONObject compobj = (JSONObject) new JSONParser().parse((temp.get(Integer.parseInt(symbol)).toString()));
	System.out.println("display details");
	String boughtfrom=compobj.get("Name").toString();
	System.out.println("company name="+boughtfrom);
	System.out.println("share price="+compobj.get("share price"));
	System.out.println("No of shares available="+compobj.get("No of Shares"));
	int noOfshares=Integer.parseInt(compobj.get("No of shares").toString());
	System.out.println("enter how many shares u want to buy" );
	int wantToBuy=Utility.Int();
	if(noOfshares<wantToBuy||(wantToBuy*(Integer.parseInt(compobj.get("share price").toString()))>amount));
	{
		System.out.println("not available");
		return;
	}
	else
	{
		noOfshares=noOfshares-wantToBuy;
		amount=amount-(Integer.parseInt(compobj.get("share price").toString())*wantToBuy);
	}

	String fileitem = "Share bought from: " + boughtfrom + "\n" + "No of share bought: " + wantToBuy 
			+ "\n"+ "Clear balance: " + amount + "\n" + " date and time bought: " + LocalDateTime.now() + "\n" + "\n";
	save(f,fileitem);
	JSONObject stockObject=new JSONObject();
	stockObject.put("Name",boughtfrom);
	stockObject.put("No of shares",noOfshares);
	stockObject.put("share price",compobj.get("share price"));
	String stockobjectupdate=stockObject.toString();
	temp.remove(Integer.parseInt(symbol));
	temp.insert(stockobjectupdate,Integer.parseInt(symbol));
	updateJSON(temp);
}

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



}