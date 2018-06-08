
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Utility;

public class AddressBookManager {

	static AddressBook addressbook=new AddressBook();
	  public static void option() throws JsonGenerationException, JsonMappingException, IOException,
	  ParseException, org.json.simple.parser.ParseException {
		   System.out.println("--------------FILE MENU--------------");
		   System.out.println("1.ADD \n2.EDIT \n3.DELETE \n4.SORT BY NAME \n5.SORT BY ZIP \n6.EXIT \n7.OPEN");
	        int choice = Utility.Int();
	        performOperation(choice);
	    }

	    public static void performOperation(int choice)
	            throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException {
	    	
	        switch (choice) {
	        case 1:
	            addressbook.addPerson();
	            break;
	        case 2:
	           
	            addressbook.update();
	            break;
	        case 3:
	            addressbook.delete();
	            break;
	        case 4:
	          addressbook.sortByName();
	            break;
	        case 5:
	            addressbook.sortByZIP();
	            break;
	        case 6:
	            addressbook.search();
	            break;
	        case 7:
	          //  addressbook.quit();
	            break;
	        }
	    }

	    public static void main(String[] args)
	            throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException {
	        System.out.println("adding first person to address book");
	        addressbook.addPerson();

	    }

	}


