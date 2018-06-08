
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.Utility;

public class AddressBook {
ArrayList<Person> list =new ArrayList<>();
static Person person;
AddressBookManager manager=new AddressBookManager();
static ObjectMapper mapper=new ObjectMapper();
static File file=new File("/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/ObjectOrientedPrograms/"
		+ "AddressBook/addressbook.json") ;
/**
 * @throws JsonGenerationException
 * @throws JsonMappingException
 * @throws IOException
 * @throws ParseException
 * @throws org.json.simple.parser.ParseException
 */
public void addPerson() throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException
{
	 System.out.println("Enter how many details you need");
     int value = Utility.Int();
     for (int i = 0; i < value; i++) {
	 person= new Person();
	System.out.println("enter first name");
	String firstName=Utility.String();
	person.setFirstName(firstName);
	System.out.println("enter last name");
	String lastName=Utility.String();
    person.setLastName(lastName);
	System.out.println("enter address");
	String address=Utility.String();
	person.setAddress(address);
	System.out.println("enter state name");
	String state=Utility.String();
	person.setState(state);
	System.out.println("enter city name");
	String city=Utility.String();
	person.setCity(city);
	System.out.println("enter ZIP");
	String ZIP=Utility.String();
	person.setZip(ZIP);
	System.out.println("enter phone num");
    String phone=Utility.String();
    person.setPhone(phone);
    list.add(person);
     }
    JSONObject Ob = person.toJsonObject();
    mapper.writeValue((file), list);
    System.out.println("person added successfully");
   manager.option();
 
}
/**
 * @throws JsonGenerationException
 * @throws JsonMappingException
 * @throws IOException
 * @throws ParseException
 * @throws org.json.simple.parser.ParseException
 */
public void update() throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException
{
	  Person p = search();
      int index = list.indexOf(p);
      System.out.println(index);
	System.out.println("choose what u want to update");
	System.out.println("1 address \n2 state\n3 city\n4 ZIP\n5 phone");
    int choice =Utility.Int();
    switch(choice)
    {
    case 1:System.out.println("enter address");
           String address=Utility.String();
           list.get(index).setAddress(address);
           mapper.writeValue((file), list);
           break;
    case 2:System.out.println("enter state");
           String state=Utility.String();
           list.get(index).setState(state);
           mapper.writeValue((file), list);
           break;
    case 3:System.out.println("enter city");
           String city=Utility.String();
           list.get(index).setCity(city);
           mapper.writeValue((file), list);
           break;
    case 4:System.out.println("enter zip");
           String ZIP=Utility.String();
           list.get(index).setZip(ZIP);
           mapper.writeValue((file), list);
           break;
    case 5:System.out.println("enter phone");
           String phone=Utility.String();
           list.get(index).setPhone(phone);
           mapper.writeValue((file), list);
           break;
    }
   manager.option();
}
/**
 * @throws JsonGenerationException
 * @throws JsonMappingException
 * @throws IOException
 * @throws ParseException
 * @throws org.json.simple.parser.ParseException
 */

public void delete() throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException
{
	int index= searchByindex();
	System.out.println(index);
	list.remove(index+1);
	mapper.writeValue((file), list);
	manager.option();
}
/**
 * @return
 */
public Person search()
{
	System.out.println("enter the first name to search");
	String firstname=Utility.String();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getFirstName().equals(firstname));
		{
		System.out.println("name found");
	    return list.get(i);
        }
	}
	System.out.println("not found");
	return null;
}
/**
 * @return
 */
public int searchByindex()
{
	System.out.println("enter the first name to search");
	String firstName=Utility.String();
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getFirstName().equals(firstName));
		{
		System.out.println("name found");
		return i;
		}
	}
	return 0;
}
/**
 * @throws JsonGenerationException
 * @throws JsonMappingException
 * @throws IOException
 * @throws ParseException
 * @throws org.json.simple.parser.ParseException
 */
public void sortByName() throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException 
{
	JSONArray addressArray=person.loadObject();
	System.out.println(addressArray);
    ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
    for (int i = 0; i < addressArray.size(); i++) {
        JSONObject temp = (JSONObject) addressArray.get(i);
        arrayList.add(temp);
    }
    for(int i=0;i<arrayList.size()-1;i++)
    {
    	for(int j=0;j<arrayList.size()-1-i;j++)
    	{
    		JSONObject object1 = (JSONObject) arrayList.get(i);
            String person1 = (String) object1.get("lastName");
            JSONObject object2 = (JSONObject) arrayList.get(j+1);
            String person2 = (String) object2.get("lastName");
            if (person1.compareTo(person2) > 0) {
                JSONObject temp = object1;
                arrayList.set(i, object2);
                arrayList.set(j+1, object1);
            }
}
    	}
    mapper.writeValue((file), arrayList);
   manager.option();
    }
/**
 * @throws JsonGenerationException
 * @throws JsonMappingException
 * @throws IOException
 * @throws ParseException
 * @throws org.json.simple.parser.ParseException
 */
public void sortByZIP() throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException 
{
	JSONArray addressArray=person.loadObject();
	System.out.println(addressArray);
    ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
    for (int i = 0; i < addressArray.size(); i++) {
        JSONObject temp = (JSONObject) addressArray.get(i);
        arrayList.add(temp);
    }
    for(int i=0;i<arrayList.size()-1;i++)
    {
    	for(int j=0;j<arrayList.size();j++)
    	{
    		JSONObject object1 = (JSONObject) arrayList.get(i);
            String person1 = (String) object1.get("zip");
            JSONObject object2 = (JSONObject) arrayList.get(j+1);
            String person2 = (String) object2.get("zip");
            if (person1.compareTo(person2) > 0) {
                JSONObject temp = object1;
                arrayList.set(i, object2);
                arrayList.set(j+1, object1);
            }
}
    	}
    mapper.writeValue((file), arrayList);
    manager.option();
    }

















}
