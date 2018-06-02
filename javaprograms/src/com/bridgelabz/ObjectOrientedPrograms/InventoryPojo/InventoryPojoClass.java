
package com.bridgelabz.ObjectOrientedPrograms.InventoryPojo;

import java.util.ArrayList;

public class InventoryPojoClass {
	ArrayList<Product> riceList=new ArrayList<Product>();
	ArrayList<Product> wheatList=new ArrayList<Product>();
	ArrayList<Product> pulseList=new ArrayList<Product>();
	/**
	 * @return the riceList
	 */
	public ArrayList<Product> getRiceList() {
		return riceList;
	}
	/**
	 * @param riceList the riceList to set
	 */
	public void setRiceList(ArrayList<Product> riceList) {
		this.riceList = riceList;
	}
	/**
	 * @return the wheatList
	 */
	public ArrayList<Product> getWheatList() {
		return wheatList;
	}
	/**
	 * @param wheatList the wheatList to set
	 */
	public void setWheatList(ArrayList<Product> wheatList) {
		this.wheatList = wheatList;
	}
	/**
	 * @return the pulseList
	 */
	public ArrayList<Product> getPulseList() {
		return pulseList;
	}
	/**
	 * @param pulseList the pulseList to set
	 */
	public void setPulseList(ArrayList<Product> pulseList) {
		this.pulseList = pulseList;
	}
}