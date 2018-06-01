
package com.bridgelabz.ObjectOrientedPrograms.InventoryPojo;


public class PojoWheat {
	private String type;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	private String weight;
	private String price;
	/**
	 * @param type
	 * @param weight
	 * @param price
	 */
	public PojoWheat(String type, String weight, String price) {
		super();
		this.type = type;
		this.weight = weight;
		this.price = price;
	}
}
