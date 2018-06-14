
package com.bridgelabz.service;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface DoctorService {
	public void showDoctorDetails() throws JsonParseException, JsonMappingException, IOException;
	public void searchByDoctorID(int doctorID);
	public void searchByDoctorSpecialization(String specialization);
	public boolean searchBydoctorName(String name);
	public boolean searchByDoctorAvailability(String availability);

}
