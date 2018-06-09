/**
 * 
 */
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author bridgelabz
 *
 */
public class Person {
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String phone;
 
/**
 * @param firstName
 * @param lastName
 * @param address
 * @param city
 * @param state
 * @param zip
 * @param phone
 */
/*public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.phone = phone;
}*/
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
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
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
@SuppressWarnings("unchecked")
public JSONObject toJsonObject()
{
	JSONObject jobj=new JSONObject();
	jobj.put("FirstName",firstName);
	jobj.put("lastName",lastName);
	jobj.put("address",address);
	jobj.put("state",state);
	jobj.put("city",city);
	jobj.put("ZIP",zip);
	jobj.put("phone",phone);
	return jobj;
}
public JSONArray loadObject() throws FileNotFoundException, IOException, ParseException
{
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(new FileReader("/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/"
			+ "ObjectOrientedPrograms/AddressBook/addressbook.json"));
	JSONArray array=(JSONArray) obj;
	for(int i=0;i<array.size();i++)
	{
		JSONObject arrobj=(JSONObject)array.get(i);
	}
	return array;
	
}

}
