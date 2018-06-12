
package com.bridgelabz.seviceImplementation;

import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;


public class ManagerServiceImpl implements ManagerService{


Doctor doctor=new Doctor();
 Patient patient=new Patient();
ArrayList<Doctor> doctorlist=new ArrayList<Doctor>() ;
ArrayList<Patient> patientlist=new ArrayList<Patient>();
DoctorServiceImpl docimpl=new DoctorServiceImpl();
PatientServiceImpl patimpl=new PatientServiceImpl();
   

    public  void addDoctor() throws JsonParseException, JsonMappingException, IOException 
   {
	doctorlist=Utility.parseJSONArray(docimpl.file, Doctor.class);
	doctor=Utility.doctordetails();
	doctorlist.add(doctor);
	Utility.mapper.writeValue(docimpl.file,doctorlist);

   }
	public void addPatient() throws JsonGenerationException, JsonMappingException, IOException 
	{
		patientlist=Utility.parseJSONArray(patimpl.file, Patient.class);
		patient=Utility.patientdetails();
		patientlist.add(patient);
		Utility.mapper.writeValue(patimpl.file,patientlist);
	}

	
	public void deleteDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException {
		doctorlist=Utility.parseJSONArray(docimpl.file, Doctor.class);
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
			Utility.mapper.writeValue(docimpl.file,doctorlist);
			System.out.println("doctor record deleted");
		}
		else
		{
			System.out.println("doctor record not found");
		}
		
	}

	
	public void deletePatient(int patientID) throws JsonGenerationException, JsonMappingException, IOException {
		patientlist=Utility.parseJSONArray(patimpl.file,Patient.class);
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
			Utility.mapper.writeValue(patimpl.file,patientlist);
			System.out.println("patient record deleted");
		}
		else
		{
			System.out.println("patient record not found");
	}
	}
	
	public void updateDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException {
	doctorlist	=Utility.parseJSONArray(docimpl.file, Doctor.class);
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
		Utility.mapper.writeValue(docimpl.file,doctorlist);
		
	}

	
	public void updatePatientByAge(int patientID) throws JsonGenerationException, JsonMappingException, IOException {
		patientlist	=Utility.parseJSONArray(patimpl.file,Patient.class);
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
		Utility.mapper.writeValue(patimpl.file,patientlist);

		
	}
	public void deleteDoctor() {
		// TODO Auto-generated method stub
		
	}
	
	public void updateDoctor() {
		// TODO Auto-generated method stub
		
	}
	public void updatePatientByMobileNum(int patientID) throws JsonParseException, JsonMappingException, IOException {
		patientlist	=Utility.parseJSONArray(patimpl.file,Patient.class);
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
		Utility.mapper.writeValue(patimpl.file,patientlist);

		
	}
	
	public void updatePatient() {
		// TODO Auto-generated method stub
		
	}
	public void deletePatient() {
		// TODO Auto-generated method stub
		
	}
}
