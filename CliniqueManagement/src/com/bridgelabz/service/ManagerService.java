/**
 * 
 */
package com.bridgelabz.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Patient;


public interface ManagerService {
public void addDoctor() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException;
public void addPatient() throws JsonGenerationException, JsonMappingException, IOException;
public void deleteDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException;
public void deletePatient(int patientID) throws JsonGenerationException, JsonMappingException, IOException;
public void updateDoctor(int doctorID) throws JsonParseException, JsonMappingException, IOException;
public void updatePatientByAge(int doctorID) throws JsonGenerationException, JsonMappingException, IOException;
public void updatePatientByMobileNum(int doctorID) throws JsonParseException, JsonMappingException, IOException;
}
