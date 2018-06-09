
package com.bridgelabz.ObjectOrientedPrograms.AddressBookApplication;

import java.io.Serializable;

import com.bridgelabz.util.Utility;

public class Person implements Serializable {
	static String firstName;
	static String lastName;
	static String address;
	static String city;
	static String state;
	static String zip;
	static String mobile;

	/**
	 * 
	 */
	public Person() {
		setFirstName();
		setLastName();
		setAddress();
		setCity();
		setState();
		setZip();
		setMobile();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 */
	public Person(String firstName, String lastName, String address, String city, String state, String zip, String mobile) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;
	}

	/**
	 * 
	 */
	public void setFirstName() {
		this.firstName = Utility.String();
	}

	/**
	 * 
	 */
	public void setLastName() {
		this.lastName = Utility.String();
	}

	/**
	 * 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public void setAddress() {
		
		this.address =  Utility.String();
	}
	/**
	 * 
	 */
	public void setCity() {
		this.city = Utility.String();
	}
	
	/**
	 * 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public void setState() {
		this.state = Utility.String();
	}
	/**
	 * 
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 */
	public void setZip() {
		this.zip =Utility.String();
	}
	/**
	 * 
	 */
	public void setZip(String zip) {
		this.zip =zip;
	}
	/**
	 * 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 
	 */
	public void setMobile() {
		this.mobile = Utility.String();
	}
	
	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 */
	public void update(String address, String city, String state, String zip, String mobile) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;

	}

}
