
package com.bridgelabz.seviceImplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
	public ArrayList<Doctor> doctorlist=new ArrayList<>();
	File file=new File("/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Doctor.json");
	
	public void showDoctorDetails() throws JsonParseException, JsonMappingException, IOException {
		
		doctorlist=Utility.parseJSONArray(file, Doctor.class);
		
		for(int i=0;i<doctorlist.size();i++)
		{
			System.out.println(Utility.mapper.writerWithDefaultPrettyPrinter().writeValueAsString(doctorlist.get(i).toString()));
		}
	}


	public void searchByDoctorID(int doctorID) {
	try 
	{
		doctorlist=Utility.parseJSONArray(file, Doctor.class);
		}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	boolean search=false;
	for(int i=0;i<doctorlist.size();i++)
	{
		if(doctorlist.get(i).getDoctorID()==doctorID)
		{
			System.out.println("doctor available");
			search=true;
		}
	}
	if(!search)
	{
		System.out.println("doctor is not available");
	}
	}


	public void searchByDoctorSpecialization(String specialization) {
		try 
		{
			doctorlist=Utility.parseJSONArray(file, Doctor.class);
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		boolean search=false;
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getDoctorSpecialization().equalsIgnoreCase(specialization))
			{
				System.out.println("doctor available");
				search=true;
			}
		}
		if(!search)
		{
			System.out.println("doctor is not available");
		}
		
	}


	public void searchBydoctorName(String name) {
		try 
		{
			doctorlist=Utility.parseJSONArray(file, Doctor.class);
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		boolean search=false;
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getDoctorName().equalsIgnoreCase(name))
			{
				System.out.println("doctor available");
				search=true;
			}
		}
		if(!search)
		{
			System.out.println("doctor is not available");
		}
		
	}


	public void searchByAvailability() {
	
		
	}

	
}
