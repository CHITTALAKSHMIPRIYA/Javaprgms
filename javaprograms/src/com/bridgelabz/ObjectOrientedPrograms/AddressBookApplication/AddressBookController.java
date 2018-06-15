/**
 * 
 */
package com.bridgelabz.ObjectOrientedPrograms.AddressBookApplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Vector;

import org.json.simple.JSONArray;

import com.bridgelabz.util.Utility;

/**
 * @author bridgelabz
 *
 */
public class AddressBookController {
	static AddressBook a1;
	Vector<String> addressbook = new Vector<String>();

	public void doAdd() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.addfirstPerson();
	}
	public void doAddagain() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.addPerson();;
	}

	public void doDelete() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.removePerson();
	}

	public void doEdit() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.updatePerson();
	}

	public void doNew() {
		System.out.println("Set a name for new address book");
		addressbook.add(Utility.String());
		a1 = new AddressBook();		
		a1.writeToJson(new JSONArray() , a1.fileLocation);
	}
    public void doOpen() throws org.json.simple.parser.ParseException, ParseException {
    	System.out.println("Choose your address book:");
    	for (int i = 0; i < addressbook.size(); i++) {
		System.out.println((i+1)+" "+addressbook.get(i));	
		}
    	
    	a1=new AddressBook();
    	a1.loadObject();
    }
	public static void doSave() {
	
		a1.toJsonArray(a1.toJsonObject());
		a1.writeToJson(a1.contactArray, a1.getFile());
	}

	public void doExit()
	{
		a1.writeToJson(a1.contactArray, a1.getFile());		
	}
	public void doSortByName() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.sortByName();
		
	}

	public void doSortByZip() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		a1.sortByZip();
	
}
}
