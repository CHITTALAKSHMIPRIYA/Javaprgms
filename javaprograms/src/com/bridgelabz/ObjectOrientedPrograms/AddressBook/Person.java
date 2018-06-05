
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.util.Comparator;

public class Person {
  private  String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private String ZIP;
  private String phone;
 Person(String firstName,String lastName,String address,String city,String state,String ZIP,String phone)
 {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.address=address;
	 this.city=city;
	 this.state=state;
	 this.ZIP=ZIP;
	 this.phone=phone;
 }


 /**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}


/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}


/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}


/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}


/**
 * @return the address
 */
public String getAddress() {
	return address;
}


/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}


/**
 * @return the city
 */
public String getCity() {
	return city;
}


/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}


/**
 * @return the state
 */
public String getState() {
	return state;
}


/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}


/**
 * @return the zIP
 */
public String getZIP() {
	return ZIP;
}


/**
 * @param zIP the zIP to set
 */
public void setZIP(String zIP) {
	ZIP = zIP;
}


/**
 * @return the phone
 */
public String getPhone() {
	return phone;
}


/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
	this.phone = phone;
}


public void Update(String address,String city,String state,String ZIP,String phone)
{
	 this.address=address;
	 this.city=city;
	 this.state=state;
	 this.ZIP=ZIP;
	 this.phone=phone;
}
 class CompareByName implements Comparator<Person>
 {
	@Override
	public int compare(Person person1,Person person2) {
		int compareByLastName=((Person)person1).getLastName().compareTo(((Person)person2).getLastName());
		if(compareByLastName!=0)
			return compareByLastName;
		else
			return ((Person)person1).getFirstName().compareTo(((Person)person2).getFirstName());
	}
 }
 class CompareByZIP implements Comparator<Person>
 {
	@Override
	public int compare(Person person1,Person person2) {
		int compareByLastName=((Person)person1).getZIP().compareTo(((Person)person2).getZIP());
		if(compareByLastName!=0)
			return compareByLastName;
		else
			return ((Person)person1).getZIP().compareTo(((Person)person2).getZIP());
	}
 }
}
