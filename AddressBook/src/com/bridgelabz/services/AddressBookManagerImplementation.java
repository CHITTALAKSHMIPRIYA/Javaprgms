/**
 * 
 */
package com.bridgelabz.services;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.parser.ParseException;

import com.bridgelabz.models.Person;
import com.bridgelabz.repositories.Serialiser;
import com.bridgelabz.repositories.SerialiserFactory;
import com.bridgelabz.utility.AddressUtility;


public class AddressBookManagerImplementation 
{
	Serialiser serialiserFactoryInterface;
	AddressBookImplementation addressBook = new AddressBookImplementation();
	ObjectMapper mapper = new ObjectMapper();
	AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
	AddressUtility addressUtility= new AddressUtility();
	public ArrayList<Person> personList = new ArrayList<Person>();
	public ArrayList<String> addressBookList = new ArrayList<String>();
	static String template = "/home/bridgelabz/Javaprograms/AddressBook/src/com/bridgelabz/";
	static String bookList="/home/bridgelabz/Javaprograms/AddressBook/src/com/bridgelabz/addressbooklist.json";
	static Serialiser serialiser;

	/**
	 * To create a new addressbook and save it to JSON
	 * @param serialiseType
	 * @param addressBookName
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws SQLException
	 * @throws PropertyVetoException
	 */
	public void createAddressBook(String serialiseType,String addressBookName) throws JsonGenerationException, JsonMappingException, IOException, SQLException, PropertyVetoException 
	{
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		serialiser.createBook(addressBookName);
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void displayAddressBookList() throws FileNotFoundException, IOException, ParseException {
		System.out.println("The addressBooks available with us is displayed below:");
		addressBookList = mapper.readValue(new File(bookList), new TypeReference<ArrayList<String>>() {});
		for(int i=0 ;i<addressBookList.size();i++) {
			System.out.println(addressBookList.get(i));
		}
	}


	/**
	 * @param serialiseType
	 * @throws SQLException
	 * @throws IOException
	 * @throws PropertyVetoException
	 */
	public void deleteAddressBook(String serialiseType) throws SQLException, IOException, PropertyVetoException 
	{
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		serialiser.deleteAddressBook();
		
		
	}


	/**
	 * @param serialiseType
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws ParseException
	 * @throws SQLException
	 * @throws PropertyVetoException
	 */
	public void openExistingAdBook(String serialiseType) throws JsonGenerationException, JsonMappingException, IOException, ParseException, SQLException, PropertyVetoException 
	{
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		System.out.println("Enter the address book you want to view ");
		String addressBookName=AddressUtility.String();
		serialiser.viewAddressbook(addressBookName);
		
	}


	public void addPerson(String serialiseType,String addressbookName) throws JsonGenerationException, JsonMappingException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		addressBookImplementation.addPerson(serialiser,addressbookName);

		
	}



	
	public void removePerson(String serialiseType,String addressbookName) throws FileNotFoundException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		addressBookImplementation.removePerson(serialiser,addressbookName);
		
	}




	public void updatePerson(String serialiseType,String addressbookName) throws FileNotFoundException, SecurityException, IOException, ParseException, InterruptedException, SQLException, PropertyVetoException {
	
		serialiser=SerialiserFactory.getSerialiser(serialiseType);
		addressBookImplementation.updatePerson(serialiser, addressbookName);
	}



	}


