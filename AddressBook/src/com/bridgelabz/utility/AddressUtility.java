
package com.bridgelabz.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;


public class AddressUtility {
	public static ObjectMapper mapper = new ObjectMapper();
	static Scanner sc=new Scanner(System.in);
	
		public static String String() 
		{
			return sc.next();

		}
        public static Long Long() 
        {
			return sc.nextLong();

		}

		public static String StringLine() 
		{
			return sc.nextLine();
		}

		
		public static int integer() 
		{
			return sc.nextInt();
		}

		
		public static Double userInputDouble() {
			return sc.nextDouble();
		}

		
		public static boolean Boolean() 
		{
			return sc.nextBoolean();
		}

		
		public static String[] askForInputs() 
		{
			System.out.println("Enter the first name of the person");
			String firstName = String();

			System.out.println("Enter the last name of the person");
			String lastName = String();

			System.out.println("Enter the address of the person");
			String address = String();

			System.out.println("Enter the city of the person");
			String city =String();

			System.out.println("Enter the state of the person");
			String state = String();

			System.out.println("Enter the zipCode of the area");
			String zip = String();

			System.out.println("Enter the phone number of the person");
			String phone = String();

			String[] string = { firstName, lastName, address, city, state, zip, phone };
			return string;

		}

		/**
		 * Method to take inputs from user regarding person's details for updation
		 * 
		 * @return String containing person's details
		 */
		public static String[] askForInputsUpdate() 
		{

			System.out.println("Enter the address of the person");
			String address =String();

			System.out.println("Enter the city of the person");
			String city =String();

			System.out.println("Enter the state of the person");
			String state = String();

			System.out.println("Enter the zipCode of the area");
			String zip = String();

			System.out.println("Enter the phone number of the person");
			String phone =String();

			String[] string = { address, city, state, zip, phone };
			return string;

		}

		/**
		 * Method to parse the JSON file and store into the array list
		 * 
		 * @param file
		 * @return
		 * @throws JsonMappingException
		 * @throws JsonParseException
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static <T> ArrayList<T> parseJSONArray(File file, Class<T> clazz)
				throws JsonParseException, JsonMappingException, IOException 
		{
			ArrayList<T> arrayList = new ArrayList<T>();
			CollectionType javaType = mapper.getTypeFactory()
				      .constructCollectionType(List.class, clazz);
			arrayList = mapper.readValue(file, javaType);
			return arrayList;
			}
		}

