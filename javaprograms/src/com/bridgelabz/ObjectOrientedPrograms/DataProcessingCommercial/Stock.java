
package com.bridgelabz.ObjectOrientedPrograms.DataProcessingCommercial;

public class Stock {
private String symbol;
private double price;
private int noOfShares;
private String dateTime;
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
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the noOfShares
 */
public int getNoOfShares() {
	return noOfShares;
}
/**
 * @param noOfShares the noOfShares to set
 */
public void setNoOfShares(int noOfShares) {
	this.noOfShares = noOfShares;
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
public double getValue() {
    return noOfShares * price;
}

public String toString() {
    return "\nShare Details: \n" + symbol + ", " + noOfShares + ", " + price;
}
}
