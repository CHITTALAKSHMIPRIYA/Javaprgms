
package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


public interface PatientService {
	public void takeAppointment() throws JsonParseException, JsonMappingException, IOException;
public void showPatientDetails() throws JsonGenerationException, JsonMappingException, IOException;
public void searchPatientByName(String name) throws JsonParseException, JsonMappingException, IOException;
public void searchPatientByID(int patientID) throws JsonParseException, JsonMappingException, IOException;
public void searchPatientbyMobile(long mobilenum) throws JsonParseException, JsonMappingException, IOException;
public void showPopularDoctor();
}
