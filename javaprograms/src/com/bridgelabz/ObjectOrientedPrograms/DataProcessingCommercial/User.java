
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
	
    public void userChoice() throws FileNotFoundException, IOException,
    ParseException, org.json.simple.parser.ParseException{
      
        StockAccount stockData=new StockAccount();
        System.out.println("Enter file name");
        String filename=Utility.String();
        String path="/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/processing"+filename;
        stockData.createNewFile(path);
       
        System.out.println("Operations u want 2 perform");
        System.out.println("1.BUY \n2.SELL \n3.QUIT");
        int choice=Utility.Int();
       
        String filepath="/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/ObjectOrientedPrograms/DataProcessingCommercial/StockAccount.json";
        switch (choice) {
        case 1:
            stockData.save(filepath);
            System.out.println("Which symbol you want to buy");
            String symbol=Utility.String();
            System.out.println("How much amount you have");
            int amount=Utility.Int();
            stockData.buy(amount, symbol,filepath,path);
            userChoice();
            break;
        case 2:
            stockData.sell(filepath,path);                                                                                                                                                                            
            userChoice();
            break;
        default:
            break;
        }
    }
        public static void main(String[] args) throws FileNotFoundException, 
        IOException, ParseException, org.json.simple.parser.ParseException {
    		User cmpnyManager=new User();
            cmpnyManager.userChoice();
        
    	}
}


                                                                   
	
