/**
 * 
 */
package com.bridgelabz.seviceImplementation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.PatientService;

public class PatientServiceImpl implements PatientService {

	public ArrayList<Patient> patientlist=new ArrayList<>();
	public ArrayList<Doctor> doctorlist=new ArrayList<>();
	public ArrayList<Appointment> appointmentlist=new ArrayList<>();
	
	File file=new File("/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Patient.json");
	
	public void showPatientDetails() throws JsonGenerationException, JsonMappingException, IOException {
		
      patientlist=Utility.parseJSONArray(file,Patient.class);
	  
      for(int i=0;i<patientlist.size();i++)
		{
			System.out.println(Utility.mapper.writerWithDefaultPrettyPrinter().writeValueAsString(patientlist.get(i).toString()));
		}
		
		
	}

	
	public void searchPatientByName(String name) throws JsonParseException, JsonMappingException, IOException {
		  patientlist=Utility.parseJSONArray(file,Patient.class);
		  boolean search=false;
		  for(int i=0;i<patientlist.size();i++)
			{
				if(patientlist.get(i).getPatientName().equalsIgnoreCase(name))
				{
					System.out.println("patient available");
					search=true;
				}
			}
			if(!search)
			{
				System.out.println("patient not available");
			}
		
	}

	
	public void searchPatientByID(int patientID) throws JsonParseException, JsonMappingException, IOException {
		patientlist=Utility.parseJSONArray(file,Patient.class);
		  boolean search=false;
		  for(int i=0;i<patientlist.size();i++)
			{
				if(patientlist.get(i).getPatientID()==(patientID))
				{
					System.out.println("patient available");
					search=true;
				}
			}
			if(!search)
			{
				System.out.println("patient not available");
			}
		
	}

	
	public void searchPatientbyMobile(long mobilenum) throws JsonParseException, JsonMappingException, IOException {
		patientlist=Utility.parseJSONArray(file,Patient.class);
		  boolean search=false;
		  for(int i=0;i<patientlist.size();i++)
			{
				if(patientlist.get(i).getPatientMobileNUm()==(mobilenum))
				{
					System.out.println("patient available");
					search=true;
				}
			}
			if(!search)
			{
				System.out.println("patient not available");
			}
		
	}
	/*public void fixAppointment() throws JsonParseException, JsonMappingException, IOException
	{
		Appointment appointment=new Appointment();
		System.out.println("enter patient name");
		if(searchPatientByName(String name))
		{
			
		}
		
	}
	public void searchFamousDoctor()
	{
		for(int i=0;i<doctorlist.size();i++)
		{
			Doctor doctor = null;
			if(doctor.getCount()==5)
			{
				System.out.println("famous doctor in hospital is"+doctorlist.get(i));
			}
		}
	}*/


	/* (non-Javadoc)
	 * @see com.bridgelabz.service.PatientService#searchFamousDoctor()
	 */
	@Override
	public void searchFamousDoctor() {
		// TODO Auto-generated method stub
		
	}

}
