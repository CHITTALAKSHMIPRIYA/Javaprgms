
package com.bridgelabz.Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;


public class Utility {
		static Scanner sc=new Scanner(System.in);
        public static ObjectMapper mapper=new ObjectMapper();
        static Doctor doctor;
        static Patient patient; 
		public final static int Int()
		{
			return sc.nextInt();
		}

		public static double Double()
		{
			return sc.nextDouble();
		}
		public static String String()
		{
			return sc.next();
		}
		public static long Long()
		{
			return sc.nextLong();
		}
		public static boolean Boolean()
		{
			return sc.nextBoolean();
		}
		public static <T> ArrayList<T> parseJSONArray(File file, Class<T> clazz)
	            throws JsonParseException, JsonMappingException, IOException {
	        ArrayList<T> arrayList = new ArrayList<T>();
	        CollectionType javaType = mapper.getTypeFactory()
	                  .constructCollectionType(List.class, clazz);
	        arrayList = mapper.readValue(file, javaType);
	        return arrayList;
	     }
		public static Doctor doctordetails()
		{
			System.out.println("enter doctor name");
			String name=sc.next();
			System.out.println("enter doctor id");
			int id=sc.nextInt();
			System.out.println("enter doctor availability");
			String availabletime=sc.next();
			System.out.println("enter doctor Specialization");
			String specialization=sc.next();
			System.out.println("enter count of patients");
			int count=sc.nextInt();
			return doctor=new Doctor(name,id,availabletime,specialization,count);
		}
		public static Patient patientdetails()
		{
			System.out.println("enter patient name");
			String pname=sc.next();
			System.out.println("enter patient id");
			int pid=sc.nextInt();
			System.out.println("enter mobile num");
			long mobilenum=sc.nextInt();
			System.out.println("enter patient age");
			int age=sc.nextInt();
			patient=new Patient(pname,pid,mobilenum,age);
			return patient;
		}
		

}
