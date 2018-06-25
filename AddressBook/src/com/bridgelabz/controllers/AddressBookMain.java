
package com.bridgelabz.controllers;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.services.AddressBookManagerImplementation;
import com.bridgelabz.utility.AddressUtility;

/**
 * @author Lakshmi Priya
 *
 */
public class AddressBookMain {

	/**
	 * @param args
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * @throws InterruptedException 
	 * @throws ParseException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, SQLException, PropertyVetoException, SecurityException, ParseException, InterruptedException 
	 {
		String serialiseType = args[0];
		AddressBookManagerImplementation addressBookMgrImpl = new AddressBookManagerImplementation();
		System.out.println("ADDRESS BOOK");
		boolean keepOn=true;
		while(keepOn) {
		System.out.println("Enter your choice");
		System.out.println("1. CREATE NEW ADDRESSBOOK");
		System.out.println("2. VIEW PARTICULAR ADDRESSBOOK");
		System.out.println("3. OPEN EXISTING ADDRESSBOOK");
		System.out.println("4. VIEW ADDRESSBOOK LIST");
		System.out.println("5. DELETE ADDRESSBOOK");
		System.out.println("6. QUIT ADDRESSBOOK");

		int choice = AddressUtility.integer();
		switch (choice) 
		{
		case 1:
            System.out.println("Enter addressbook name you want to create");
            String addressBookName=AddressUtility.String();
			addressBookMgrImpl.createAddressBook(serialiseType,addressBookName);
			System.out.println("Now add persons on your address book");
			System.out.println("1. ADD A PERSON TO ADDRESSBOOK");
			System.out.println("2. QUIT ADDRESSBOOK");
			int choice1 = AddressUtility.integer();
			switch (choice1) {
			case 1:
			
				addressBookMgrImpl.addPerson(serialiseType,addressBookName);
				break;

			default:
				System.out.println("Exit address book");
			}

			break;

		case 2:
			addressBookMgrImpl.openExistingAdBook(serialiseType);
			break;

		case 3:
			System.out.println("Enter the name of address book you want to open ");
			String addressBookName1 = AddressUtility.String();

			System.out.println("You may perform following operations on existing address book ");
			System.out.println("1. ADD A PERSON TO ADDRESSBOOK");
			System.out.println("2. DELETE A PERSON FROM ADDRESSBOOK");
			System.out.println("3. EDIT A PERSON IN ADDRESSBOOK");
			System.out.println("4. QUIT ADDRESSBOOK");

			int choice2 = AddressUtility.integer();
			switch (choice2) {

			case 1:
				addressBookMgrImpl.addPerson(serialiseType,addressBookName1);
				break;

			case 2:
				addressBookMgrImpl.removePerson(serialiseType,addressBookName1);
				break;

			case 3:
				addressBookMgrImpl.updatePerson(serialiseType,addressBookName1);
				break;

			default:
				System.out.println("Exit address book");

			}
			break;

		case 4:
			addressBookMgrImpl.deleteAddressBook(serialiseType);
			break;
		default:keepOn=false;
		System.out.println("Exit addressbook");
		}
		
		}
	}

}
