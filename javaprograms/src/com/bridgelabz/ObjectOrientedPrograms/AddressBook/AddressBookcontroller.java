package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class AddressBookcontroller {
static AddressBook a1;
Vector<String> addressbook = new Vector<String>();
public void doadd()
{
	a1.addPerson();
}
public void doDelete() throws FileNotFoundException, IOException, ParseException
{
	a1.removePerson();
}
public void doEdit() throws FileNotFoundException, IOException, ParseException
{
	a1.updatePerson();
}
public void doNew()
{
	System.out.println("give a new name for address book");
	addressbook.add(Utility.String());
	a1=new AddressBook();
}
public void doSave() {
	a1.writeToJSON(a1.toJsonarray(a1.toJsonObject()), a1.getFile());
}
public void dosortByName()
{
	a1.sortByName();
	doSave();
}
public void dosortByZIP()
{
	a1.sortByZIP();
	doSave();
}
}
