
package com.bridgelabz.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.seviceImplementation.DoctorServiceImpl;
import com.bridgelabz.seviceImplementation.ManagerServiceImpl;
import com.bridgelabz.seviceImplementation.PatientServiceImpl;

public class CliniqueManager {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, 
	org.json.simple.parser.ParseException {
		int choice=0;
		DoctorServiceImpl docserviceimpl=new DoctorServiceImpl();
		PatientServiceImpl patserviceimpl=new PatientServiceImpl();
		ManagerServiceImpl manserviceimpl=new ManagerServiceImpl();
		System.out.println("WELCOME TO TIMES CLINIQUE");
		System.out.println("Add doctor details");
		System.out.println("show doctor details");
		System.out.println("Take Appointment");
		System.out.println("Add Patient details");
		System.out.println("show patient details");
		while(choice<10)
		{
			System.out.println("enter choice");
			 choice=Utility.Int();
			 switch(choice)
			 {
			 case 1:docserviceimpl.showDoctorDetails();
			        break;
			 case 2:System.out.println("Doctor details"); 
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
			        doption++;
			  }
		case 3:
			System.out.println("Patient Details");
			System.out.println("1:Show Patient Details");
			System.out.println("2:SEARCH PATIENT BY NAME");
			System.out.println("3:SEARCH PATIENT BY ID");
			System.out.println("4:SEARCH PATIENT BY MOBILE NUMBER");
			System.out.println("5:ADD PATIENT DETAILS");
			System.out.println("6:UPDATE PATIENT BY AGE");
			System.out.println("7:UPDATE PATIENT BY MOBILE NUMBER");
			System.out.println("8:DELETE PATIENT BY ID");
			System.out.println("9:SEARCH FAMOUS DOCTOR");
			int ch = 0;
			while (ch < 10) {
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
				ch++;
			}
			break;

		default:
			System.out.println("sssssssss");
		}
		choice++;
	}

}
}

