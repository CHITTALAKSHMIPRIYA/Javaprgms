/**
 * 
 */
package com.bridgelabz.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Patient;

/**
 * @author bridgelabz
 *
 */
public interface ManagerService {
public void addDoctor() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException;
public void addPatient() throws JsonGenerationException, JsonMappingException, IOException;
public void deleteDoctor();
public void deletePatient();
public void updateDoctor();
public void updatePatient();

}
