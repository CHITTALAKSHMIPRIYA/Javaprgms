
package com.bridgelabz.seviceImplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;


public class ManagerServiceImpl implements ManagerService{
Doctor doctor=new Doctor();
 Patient patient=new Patient();
ArrayList<Doctor> doctorlist=new ArrayList<Doctor>() ;
ArrayList<Patient> patientlist=new ArrayList<Patient>();

   
Appointment appointment = new Appointment();
ArrayList<Appointment> appointmentList = new ArrayList<>();
File appFile = new File(
		"/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Appointment.json");
File doctorFile = new File(
		"/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Doctor.json");
File patientFile = new File(
"/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Patient.json");
    public  void addDoctor() throws JsonParseException, JsonMappingException, IOException 
   {
    	try
    	{
    		doctorlist=Utility.parseJSONArray(doctorFile, Doctor.class);
    	}catch(IOException e)
    	{
    		e.printStackTrace();
    	}
	doctor=Utility.doctordetails();
	doctorlist.add(doctor);
	try
	{
	Utility.mapper.writeValue(doctorFile,doctorlist);
}catch(IOException e)
	{
	e.printStackTrace();
	}
   }
	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException 
	{
		try {
		patientlist=Utility.parseJSONArray(patientFile, Patient.class);
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
		patient=Utility.patientdetails();
		patientlist.add(patient);
		try
		{
		Utility.mapper.writeValue(patientFile,patientlist);
	}
		catch(IOException e)
		{
		e.printStackTrace();
		}
	   }

	
	public void deleteDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException {
		try
		{
		doctorlist=Utility.parseJSONArray(doctorFile, Doctor.class);
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
				doctorlist.remove(i);
				search=true;
			}
		}
		if(search)
		{
			try
			{
			Utility.mapper.writeValue(doctorFile,doctorlist);
			}catch(IOException e)
			{
				e.printStackTrace();
				}
			System.out.println("doctor record deleted");
		}
		else
		{
			System.out.println("doctor record not found");
		}
		
	}

	
	public void deletePatient(int patientID) throws JsonGenerationException, JsonMappingException, IOException {
		try
		{
		patientlist=Utility.parseJSONArray(patientFile,Patient.class);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		boolean search=false;
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getPatientID()==patientID)
			{
				patientlist.remove(i);
				search=true;
			}
		}
		if(search)
		{
			try
			{
			Utility.mapper.writeValue(patientFile,patientlist);
			}catch(IOException e)
			{
				e.printStackTrace();
				}
			System.out.println("patient record deleted");
		}
		else
		{
			System.out.println("patient record not found");
	}
	}
	
	public void updateDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException {
		try
		{
	doctorlist	=Utility.parseJSONArray(doctorFile, Doctor.class);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		boolean search=false;
		ArrayList<Doctor> findList=new ArrayList<>();
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getDoctorID()==doctorID)
			{
				findList.add(doctorlist.get(i));
				search=true;
			}
		}
		if(search)
		{
			System.out.println("enter time to update");
			String time=Utility.String();
			for(int i=0;i<findList.size();i++)
			{
				findList.get(i).setDoctorAvailability(time);
			}
		}
		try {
		Utility.mapper.writeValue(doctorFile,doctorlist);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		
	}

	
	public void updatePatientByAge(int patientID) throws JsonGenerationException, JsonMappingException, IOException {
		try
		{
		patientlist	=Utility.parseJSONArray(patientFile,Patient.class);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		boolean search=false;
		ArrayList<Patient> findList=new ArrayList<>();
		for(int i=0;i<patientlist.size();i++)
		{
			if(doctorlist.get(i).getDoctorID()==patientID)
			{
				findList.add(patientlist.get(i));
				search=true;
			}
		}
		if(search)
		{
			System.out.println("enter age");
			int age=Utility.Int();
			for(int i=0;i<findList.size();i++)
			{
				findList.get(i).setPatientAge(age);;
			}
		}
		try
		{
		Utility.mapper.writeValue(patientFile,patientlist);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}

		
	}
	
	public void updatePatientByMobileNum(int patientID) throws JsonParseException, JsonMappingException, IOException {
		try
		{
		patientlist	=Utility.parseJSONArray(patientFile,Patient.class);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		boolean search=false;
		ArrayList<Patient> findList=new ArrayList<>();
		for(int i=0;i<patientlist.size();i++)
		{
			if(doctorlist.get(i).getDoctorID()==patientID)
			{
				findList.add(patientlist.get(i));
				search=true;
			}
		}
		if(search)
		{
			System.out.println("enter mobilenum");
			int mobilenum=Utility.Int();
			for(int i=0;i<findList.size();i++)
			{
				findList.get(i).setPatientMobileNUm(mobilenum);
			}
		}
		try
		{
		Utility.mapper.writeValue(patientFile,patientlist);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}

		
	}
	public void addAppointement(int index) throws JsonParseException, JsonMappingException, IOException {
		appointmentList = Utility.parseJSONArray(appFile, Appointment.class);

		for (int i = 0; i < doctorlist.size(); i++) {
			if (i == index) {
				appointment.setDoctorName(doctorlist.get(index).getDoctorName());
				appointment.setDoctorID(doctorlist.get(index).getDoctorID());
			}
		}

		System.out.println("Enter patient Name");
		String patientName = Utility.String();
		appointment.setPatientName(patientName);
		System.out.println("Enter Patient Id");
		int patientId = Utility.Int();
		appointment.setPatientID(patientId);
		appointment.setTimeStamp(appointment.getTimeStamp());

		appointmentList.add(appointment);

		Utility.mapper.writeValue(appFile, appointmentList);
	}

	public void fixAppontement( String fixedDoctor)
			throws JsonParseException, JsonMappingException, IOException {

		int count;
		int index = 0;
		doctorlist = Utility.parseJSONArray(doctorFile, Doctor.class);

		
			for (int i = 0; i < doctorlist.size(); i++) {
				if (doctorlist.get(i).getDoctorName().equalsIgnoreCase(fixedDoctor)) {
					index = i;
					break;
				}
			}
			count=doctorlist.get(index).getCount();
			if(count<=5) {
				addPatient();
				addAppointement(index);
				count=count+1;
				doctorlist.get(index).setCount(count);
				Utility.mapper.writeValue(doctorFile, doctorlist);
				System.out.println("Appointment fixed");
}
	}
	public void printReport() {
		try {
			appointmentList = Utility.parseJSONArray(appFile, Appointment.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Appointment list:appointmentList) {
			try {
				System.out.println(Utility.mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
			} catch (IOException e) {
				e.printStackTrace();
			}
}
	}
}
