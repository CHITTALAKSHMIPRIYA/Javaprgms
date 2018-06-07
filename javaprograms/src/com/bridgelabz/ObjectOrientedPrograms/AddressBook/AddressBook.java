
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class AddressBook{
	Vector<Person> addressbook=new Vector<Person>();
	static File file;
	public AddressBook()
	{
		setFile();
	}
	
	public void addPerson()
	{
		System.out.println("enter first name");
		String firstName=Utility.String();
		System.out.println("enter last name");
		String lastName=Utility.String();
		System.out.println("enter address");
		String address=Utility.String();
		System.out.println("enter state name");
		String state=Utility.String();
		System.out.println("enter city name");
		String city=Utility.String();
		System.out.println("enter ZIP");
		String ZIP=Utility.String();
		System.out.println("enter phone num");
		String phone=Utility.String();
		addressbook.add(new Person(firstName,lastName,address,state,city,ZIP,phone));
		writeToJSON(toJsonarray(toJsonObject()), getFile());
		System.out.println(" Added successfully");
        printAll();
	}
	public int getNumberofPersons()
	{
		return addressbook.size();
	}
	public String getFullNameOfPerson(int index)
	{
		return addressbook.get(index).getFirstName()+addressbook.get(index).getFirstName();
	}
	public String[] getOtherPersonInformation(int index)
	{
		String[] otherInformation=new String[5];
		otherInformation[0]=addressbook.get(index).getAddress();
		otherInformation[1]=addressbook.get(index).getState();
		otherInformation[2]=addressbook.get(index).getCity();
		otherInformation[3]=addressbook.get(index).getZip();
		otherInformation[4]=addressbook.get(index).getPhone();
		return otherInformation;
	
	}
	public void updatePerson() throws FileNotFoundException, IOException, ParseException
	{
		System.out.println("select based on index");
		int index=Utility.Int();
		System.out.println("choose what u want to update");
		System.out.println("1 address \n2 state\n3 city\n4 ZIP\n5 phone");
	    int choice =Utility.Int();
	   switch(choice)
	    {
	    case 1:   addressbook.get(index).setAddress();
	              break;
	    case 2:   addressbook.get(index).setState();
                  break;
	    case 3:   addressbook.get(index).setCity();
                  break;
	    case 4:   addressbook.get(index).setZip();
                  break;
	    case 5:   addressbook.get(index).setPhone();
                  break;
        default:  System.out.println("Invalid choice");
                  break;
	    }
                  writeToJSON(toJsonarray(toJsonObject()), getFile());
                  System.out.println("updated successfully");
	    
	    }
	   

	public void removePerson() throws FileNotFoundException, IOException, ParseException
	{
		System.out.println("select based on index");
		int index=Utility.Int();
		addressbook.remove(index);
		writeToJSON(toJsonarray(toJsonObject()),getFile());
	}
public void sortByName()
	{
		Comparator cmp=(Object obj1,Object obj2)->
		{
			Person p1=(Person)obj1;
			Person p2=(Person)obj2;
			int value=new Person.CompareByName().compare(p1,p2);
			return value;
		};
	}
	
	public void sortByZIP()
	{
		@SuppressWarnings("rawtypes")
		Comparator cmp=(Object obj1,Object obj2)->
		{
			Person p1=(Person)obj1;
			Person p2=(Person)obj2;
			int value=new Person.CompareByZip().compare(p1,p2);
			return value;
		};
	}
	public void printAll()
	{
		for(int i=0;i<addressbook.size();i++)
		{
			System.out.println("first name:"+addressbook.get(i).getFirstName());
			System.out.println("last name:"+addressbook.get(i).getLastName());
			System.out.println("address:"+addressbook.get(i).getAddress());
			System.out.println("state:"+addressbook.get(i).getState());
			System.out.println("city:"+addressbook.get(i).getCity());
			System.out.println("phone:"+addressbook.get(i).getPhone());
			System.out.println("ZIP:"+addressbook.get(i).getZip());
		}
	}
	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject()
	{
		JSONObject object=new JSONObject();
		object.put("First Name",Person.firstName);
		object.put("Last Name",Person.lastName);
		object.put("Address",Person.address);
		object.put("State",Person.state);
		object.put("city",Person.city);
		object.put("ZIP",Person.ZIP);
		object.put("phone",Person.phone);
		return object;
	}
	public JSONArray toJsonarray(JSONObject object)
	{
		JSONArray array=new JSONArray();
		array.add(object);
		return array;
	}
	public void writeToJSON(JSONArray array,File file)
	{
		try {
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileWriter fw=new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(array.toString());
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void setFile()
	{
		System.out.println("enter file name");
		String filename=Utility.String();
		file=new File("/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/ObjectOrientedPrograms/"
				+ "AddressBook/Addressbook.json");
	}
	public File getFile()
	{
		return file;
    }
	public void shownames() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader(getFile()));
		JSONArray name=(JSONArray)obj;
		for(int i=0;i<name.size();i++)
		{
			JSONObject jsnobj=(JSONObject)name.get(i);
			System.out.println(i + "     " + jsnobj.get("First Name") );
		}
	}
	

}
