
package com.bridgelabz.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.seviceImplementation.DoctorServiceImpl;
import com.bridgelabz.seviceImplementation.ManagerServiceImpl;
import com.bridgelabz.seviceImplementation.PatientServiceImpl;
/*************************************************************************************************************
 * 
 * purpose:This programme is used to manage a list of
   Doctors associated with the Clinique. This also manages the list of patients who use the
   clinique. It manages Doctors by Name, Id, Specialization and Availability (AM, PM or
   both). It manages Patients by Name, ID, Mobile Number and Age. The Program allows
   users to search Doctor by name, id, Specialization or Availability. Also the programs
   allows users to search patient by name, mobile number or id. The programs allows
   patients to take appointment with the doctor. A doctor at any availability time can see
   only 5 patients. If exceeded the user can take appointment for patient at different date or
   availability time. Print the Doctor Patient Report.
 * @author Lakshmi Priya
 * @version 1.0
 * @since 11-06-18
 * 
 * **************************************************************************************************/

public class CliniqueManager {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, 
	org.json.simple.parser.ParseException {
		int choice=0;
		DoctorServiceImpl docserviceimpl=new DoctorServiceImpl();
		PatientServiceImpl patserviceimpl=new PatientServiceImpl();
		ManagerServiceImpl manserviceimpl=new ManagerServiceImpl();
		System.out.println("WELCOME TO TIMES CLINIQUE");
		System.out.println("1.Show popular doctor");
		System.out.println("2.Take Appointment");
		System.out.println("3.Doctor details");
		System.out.println("4.Patient details");
		System.out.println("5.Print Report");
		while(choice<10)
		{
			System.out.println("enter choice");
			 choice=Utility.Int();
			 switch(choice)
			 {
			 case 1:
					System.out.println("Show popular Doctor");
					patserviceimpl.showPopularDoctor();
					break;
				case 2:
					System.out.println("Take Appointment");
					patserviceimpl.takeAppointment();
	break;
		
			 case 3:System.out.println("Doctor details"); 
			        System.out.println("Add doctor details");
			        System.out.println("update doctor details");
			        System.out.println("delete doctor details");
			        System.out.println("Search doctor by name ");
			        System.out.println("search doctor by ID");
			        System.out.println("search doctor by specialization");
			        int doption=0;
			  while(doption<7)    
			  {
			        System.out.println("enter ur choice");
			          doption=Utility.Int();
			        switch(doption)
			        {
			        case 1: manserviceimpl.addDoctor();
			                break;
			        case 2: System.out.println("enter doctor ID");
			                int id=Utility.Int();
			                manserviceimpl.updateDoctor(id);
			                break;
			        case 3: System.out.println("enter doctor ID");
			                int did=Utility.Int();
			                manserviceimpl.deleteDoctor(did);
			                break;
			        case 4: System.out.println("enter doctor ID");
	                        int did1=Utility.Int();
	                        docserviceimpl.searchByDoctorID(did1);
	                        break;
			        case 5: System.out.println("enter doctor name");
                            String name=Utility.String();
                            docserviceimpl.searchBydoctorName(name);
                            break;
			        case 6: System.out.println("enter doctor specialization");
                            String specialization=Utility.String();
                            docserviceimpl.searchByDoctorSpecialization(specialization);
                            break;
	                }
			      
			  }
		case 4:
			System.out.println("Patient Details");
			System.out.println("1:Show Patient Details");
			System.out.println("2:SEARCH PATIENT BY NAME");
			System.out.println("3:SEARCH PATIENT BY ID");
			System.out.println("4:SEARCH PATIENT BY MOBILE NUMBER");
			System.out.println("5:ADD PATIENT DETAILS");
			System.out.println("6:UPDATE PATIENT BY AGE");
			System.out.println("7:UPDATE PATIENT BY MOBILE NUMBER");
			System.out.println("8:DELETE PATIENT BY ID");
			int ch = 0;
			while (ch <9) {
				System.out.println("Enter your choice");
				ch = Utility.Int();
				switch (ch) {
				case 1:
					patserviceimpl.showPatientDetails();
					break;

				case 2:
					System.out.println("Enter Patient name");
					String patientName = Utility.String();
					patserviceimpl.searchPatientByName(patientName);
					break;
				case 3:
					System.out.println("Enter Patient Id");
					int patientId = Utility.Int();
					patserviceimpl.searchPatientByID(patientId);;
					break;
				case 4:
					System.out.println("Enter Patient Mobile number");
					long mobileNum = Utility.Long();
					patserviceimpl.searchPatientbyMobile(mobileNum);;
					break;
				case 5:
					manserviceimpl.addPatient();
					break;
				case 6:
					System.out.println("Enter patientid to update");
					int ptid = Utility.Int();
					manserviceimpl.updatePatientByAge(ptid);
					break;
				case 7:
					System.out.println("Enter patientid to update");
					int ptid1 = Utility.Int();
					manserviceimpl.updatePatientByMobileNum(ptid1);
					break;
				case 8:
					System.out.println("Enter patientid to delete");
					int pid = Utility.Int();
					manserviceimpl.deletePatient(pid);
					break;
				case 9:
				default:
					System.out.println("Exit");
				}
				
			}
			break;
		case 5:
			System.out.println("Print report");
			 manserviceimpl.printReport();
			break;
		default:
			System.out.println("Exit");
		}
			 

		
	}

}
}

