
package com.bridgelabz.ObjectOrientedPrograms.DataProcessingCommercial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.bridgelabz.util.Utility;

public class User {

	/**
	 * @param args
	 * @throws org.json.simple.parser.ParseException 
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		User companyManager=new User();
        companyManager.askUser();
    
	}
    public void askUser() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException{
      
        StockAccount stockData=new StockAccount();
        System.out.println(" Enter your name:");
        String name=Utility.String();
        System.out.println("Enter the file name");
        String filename=Utility.String();
        String path="/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/processing"+filename;
        stockData.createNewFile(path);
       
        System.out.println("Operations u want 2 perform");
        System.out.println("1.Buy ");
        System.out.println("2. Sell ");
        System.out.println("3. Quit");
        int choice=Utility.Int();
       
        String filePath="/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/processing567";
        switch (choice) {
        case 1:
            stockData.printEntries(filePath);
            System.out.println("Which symbol do you want to buy?");
            String symbol=Utility.String();
            System.out.println("How much amount you have?");
            int amount=Utility.Int();
            stockData.buy(amount, symbol,filePath,path);
            askUser();
            break;
        case 2:
           
            stockData.sell(filePath,path);
            askUser();
            break;
        default:
            break;
        }
    }
}

                                                                   
	
