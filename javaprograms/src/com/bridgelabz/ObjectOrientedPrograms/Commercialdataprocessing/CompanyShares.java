
package com.bridgelabz.ObjectOrientedPrograms.Commercialdataprocessing;
public class CompanyShares {
private String symbol;
private int numOfShares;
private String dateTime;
private int price;
/**
 * @return the symbol
 */
public String getSymbol() {
	return symbol;
}
/**
 * @param symbol the symbol to set
 */
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
/**
 * @return the numOfShares
 */
public int getNumOfShares() {
	return numOfShares;
}
/**
 * @param numOfShares the numOfShares to set
 */
public void setNumOfShares(int numOfShares) {
	this.numOfShares = numOfShares;
}
/**
 * @return the dateTime
 */
public String getDateTime() {
	return dateTime;
}
/**
 * @param dateTime the dateTime to set
 */
public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}
/**
 * @return the price
 */
public int getPrice() {
	return price;
}
/**
 * @return
 */
public int getValue() {
	return numOfShares * price;
}
/**
 * @param price the price to set
 */
public void setPrice(int price) {
	this.price = price;
}
/**
 * @param symbol
 * @param numOfShares
 * @param dateTime
 * @param price
 */
public CompanyShares(String symbol, int numOfShares, String dateTime, int price) {
	super();
	this.symbol = symbol;
	this.numOfShares = numOfShares;
	this.dateTime = dateTime;
	this.price = price;
}
/**
 * 
 */
public CompanyShares() {
	// TODO Auto-generated constructor stub
}

}
