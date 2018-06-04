package com.bridgelabz.ObjectOrientedPrograms.Commercialdataprocessing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.Utility;

public class CompanySharesList {
	static CompanyShareHolding companySharesHolding = new CompanyShareHolding();

	public static CompanyShares makeCompanySharesObject() {
		CompanyShares companyShares = new CompanyShares();
		System.out.println("Enter the symbol of shares:");
		String symbol = Utility.String();
		companyShares.setSymbol(symbol);
		System.out.println("Enter the number of shares:");
		int numberOfShares = Utility.Int();
		companyShares.setNumOfShares(numberOfShares);
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		companyShares.setDateTime(dateTime);
		System.out.println("Enter the price of share:");
		int price = Utility.Int();
		companyShares.setPrice(price);
		return companyShares;

	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		start();

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File(
				"/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/ObjectOrientedPrograms/Commercialdataprocessing/"
				+ "StockAccount.json"),companySharesHolding.ShareList);

	}

	/** asks user if wants to add or remove stocks **/
	static void start() {
		System.out.print(
				"Type 'add' to add the stock and 'remove' to remove the stock and 'print' to print the stock and 'break' to get out:");
		String move = Utility.String();

		if (move.equals("add")) {
			CompanyShares companyShares = new CompanyShares();
			companyShares = makeCompanySharesObject();
			companySharesHolding.getList().add(companyShares);
			companySharesHolding.getShareList().add(companyShares);
			start();
		} else if (move.equals("remove")) {
			remove();
			start();
		} else if (move.equals("print")) {
			print();
			start();
		} else if (move.equals("break")) {
			return;
		} else
			System.out.println("wrong input");
	}

	/** removes stock from the list **/
	static void remove() {
		System.out.print("Enter the symbol you want to remove:");
		String symbol = Utility.String();
		for (int i = 0; i < companySharesHolding.list.size(); i++) {
			CompanyShares shareObject = null;
			if (symbol.equals((companySharesHolding.list.get(i)).getSymbol())) {
				companySharesHolding.list.remove(shareObject);
				companySharesHolding.ShareList.remove(shareObject);
				System.out.println("\nRemoved Succesfully...");
				print();
				break;
			}
		}

	}

	/** prints stocks list **/
	static void print() {
		System.out.println("\nSymbol\tShares\tPrice");
		for (int i = 0; i < companySharesHolding.list.size(); i++) {
			CompanyShares shareObject = companySharesHolding.list.get(i);
			System.out.println(
					shareObject.getSymbol() + "\t" + shareObject.getNumOfShares() + "\t" + shareObject.getPrice());
		}
		System.out.println();
	}
}
