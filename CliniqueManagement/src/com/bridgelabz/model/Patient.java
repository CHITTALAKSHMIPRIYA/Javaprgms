
package com.bridgelabz.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Patient {
	private String patientName;
	private int patientID;
	private long patientMobileNUm;
	private int patientAge;
	public Patient()
	{
		
	}
	/**
	 * @param patientName
	 * @param patientID
	 * @param patientMobileNUm
	 * @param patientAge
	 */
	public Patient(String patientName, int patientID, long patientMobileNUm, int patientAge) {
		super();
		this.patientName = patientName;
		this.patientID = patientID;
		this.patientMobileNUm = patientMobileNUm;
		this.patientAge = patientAge;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * @return the patientID
	 */
	public int getPatientID() {
		return patientID;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	/**
	 * @return the patientMobileNUm
	 */
	public long getPatientMobileNUm() {
		return patientMobileNUm;
	}
	/**
	 * @param patientMobileNUm the patientMobileNUm to set
	 */
	public void setPatientMobileNUm(long patientMobileNUm) {
		this.patientMobileNUm = patientMobileNUm;
	}
	/**
	 * @return the patientAge
	 */
	public int getPatientAge() {
		return patientAge;
	}
	/**
	 * @param patientAge the patientAge to set
	 */
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String toString()
	{
		return patientName+" "+patientID+" "+patientMobileNUm+" "+patientAge;
	}

}
