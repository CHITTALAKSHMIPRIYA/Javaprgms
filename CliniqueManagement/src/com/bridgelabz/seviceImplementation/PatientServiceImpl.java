/**
 * 
 */
package com.bridgelabz.seviceImplementation;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.PatientService;

public class PatientServiceImpl implements PatientService {
	DoctorServiceImpl doctorServiceImpl = new DoctorServiceImpl();
	ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();
	public ArrayList<Patient> patientlist=new ArrayList<>();
	
	File file=new File("/home/bridgelabz/Javaprograms/CliniqueManagement/src/com/bridgelabz/files/Patient.json");
	public void takeAppointment() throws JsonParseException, JsonMappingException, IOException {
		doctorServiceImpl.showDoctorDetails();
		
System.out.println("Search Doctor by name\n");
		
		System.out.println("Enter the doctor name");
		String fixedDoctor = Utility.String();
		boolean avail = doctorServiceImpl.searchBydoctorName(fixedDoctor);
		// System.out.println("index" + avail);
		if (avail) {

			try {
				managerServiceImpl.fixAppontement(fixedDoctor);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Doctor is not available!!!!");
		}
		doctorServiceImpl.showDoctorDetails();

}
	

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
	
	public void showPopularDoctor() {
		ArrayList<Integer> countPatients=new ArrayList<>();
		 try {
			managerServiceImpl.doctorlist=Utility.parseJSONArray(managerServiceImpl.doctorFile, Doctor.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 for (int i = 0; i <managerServiceImpl.doctorlist.size() ; i++) {
			 int count=managerServiceImpl.doctorlist.get(i).getCount();
			countPatients.add(count);
		}
		// System.out.println("Popular doctor: "+Collections.max(countPatients));
		 for (int i = 0; i < managerServiceImpl.doctorlist.size(); i++) {
			if(managerServiceImpl.doctorlist.get(i).getCount()==Collections.max(countPatients)) {
				String popular=managerServiceImpl.doctorlist.get(i).getDoctorName();
				System.out.println("Popular doctor:"+popular);
			}
}
		
	}

	

}
