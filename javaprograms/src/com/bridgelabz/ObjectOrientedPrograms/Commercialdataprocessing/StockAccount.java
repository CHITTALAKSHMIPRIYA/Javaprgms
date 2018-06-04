
package com.bridgelabz.ObjectOrientedPrograms.Commercialdataprocessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.Utility;

public class StockAccount {
	String nameOfStock;
	int cash;
	int count;
	double totalValue;
	CompanyShares[] cmpnyshares;
	
	public static void main(String[] args) throws IOException {
		StockAccount stockAccount = new StockAccount();
		stockAccount.addOrRemoveStock() ;
}
	
	void addOrRemoveStock() {
		System.out.print("Type 'buy' to buy stock or type 'sell' to sell stock: ");
		String action = Utility.String();
		if(action.equals("buy")) {
			System.out.print("Enter amount, symbol, price of the stock: ");
			int amount = Utility.Int();
			String symbol = Utility.String();
			int price = Utility.Int();
			buy(amount, symbol, price);
			addOrRemoveStock();
		} else if(action.equals("sell")) {
			System.out.print("Enter amount, symbol, price of the stock: ");
			int amount = Utility.Int();
			String symbol = Utility.String();
			int price = Utility.Int();
			sell(amount, symbol, price);
			addOrRemoveStock();
		}
		else {
			printReport();
			System.out.println("\nTotal stock value: " + valueOf());
			writeToFile();
	
		
		}
}
		private void getFiledata() {
			FileReader reader = null;
	try {
	
reader=new FileReader("/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/"
		+ "ObjectOrientedPrograms/Commercialdataprocessing/StockAccount.json");
		BufferedReader br=new BufferedReader(reader);
		 nameOfStock=br.readLine();
	     cash=br.read();
         count=br.read();
         cmpnyshares=new CompanyShares[10];
         for(int i=0;i<count;i++)
         {
        	 String line=br.readLine();
        	 String lines[]=line.split(" ");
        	 String symbol=lines[0];
        	 int numOfshares=Integer.parseInt(lines[1]);
        	 int price=Integer.parseInt(lines[2]);
        	 String dateTime=lines[3];
        	 cmpnyshares[i]=new CompanyShares(symbol,numOfshares,dateTime,price);
         }
	}
	 catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public double valueOf()
	{
		totalValue=cash;
		for(int i=0;i<count;i++)
		{
			totalValue+=cmpnyshares[i].getValue();
		}
		return totalValue;
	}
	public void buy(int amount,String symbol,int price)
	{
		String dateTime=new SimpleDateFormat("dd/MM/yyy").format(new Date());
		CompanyShares cmpnyshareobj=new CompanyShares(symbol,amount/price,dateTime,price);
		cmpnyshares[count]=cmpnyshareobj;
		count++;
		//transactionsStack.push("Purchased");
		//transactionsQueue.enqueue(dateTime);
	}
	public void sell(int amount,String symbol,int price)
	{
		int numOfShares=amount/price;
	
		String dateTime=new SimpleDateFormat("dd/MM/yyy").format(new Date());
		for(int i=0;i<count;i++)
		{
		if(cmpnyshares[i].getSymbol().equals(symbol))
		{
			cmpnyshares[i].setNumOfShares(cmpnyshares[i].getNumOfShares()-numOfShares);
			cmpnyshares[i].setDateTime(dateTime);
			break;
		}
		}
	}
	public void printReport() {
		System.out.println("\n" + nameOfStock + "\n");
		System.out.println("Symbol\tNo. of Shares\tPrice\tValue\tDate");
		for (int i = 0; i < count; i++) {
			CompanyShares shares = cmpnyshares[i];
			System.out.println(shares.getSymbol() + "\t" + shares.getNumOfShares() + "\t\t" + shares.getPrice()
					+ "\t" + shares.getValue() + "\t" + shares.getDateTime());
		}			
}
	public void writeToFile()
	{
		try {
			PrintWriter pr=new PrintWriter("/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/stockaccount");
			pr.write(nameOfStock + "\n" + cash + "\n" + count + "\n");
			for (int i = 0; i < count; i++) {
				CompanyShares share = cmpnyshares[i];
				pr.write(share.getSymbol() + " " + share.getNumOfShares()
						+ " " + share.getPrice() + " " + share.getDateTime() + "\n");
} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
