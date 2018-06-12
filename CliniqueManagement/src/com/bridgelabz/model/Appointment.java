
package com.bridgelabz.model;


public class Appointment {
  private String doctorName;
  private int doctorID;
  private String patientName;
  private int patientID;
  /**
 * @param doctorName
 * @param doctorID
 * @param patientName
 * @param patientID
 * @param timeStamp
 */
public Appointment(String doctorName,int doctorID, String patientName, int patientID, String timeStamp) {
	super();
	this.doctorName = doctorName;
	this.doctorID = doctorID;
	this.patientName = patientName;
	this.patientID = patientID;
	this.timeStamp = timeStamp;
}
/**
 * 
 */
public Appointment() {
	// TODO Auto-generated constructor stub
}
private String timeStamp;
/**
 * @return the doctorName
 */
public String getDoctorName() {
	return doctorName;
}
/**
 * @param doctorName the doctorName to set
 */
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
/**
 * @return the doctorID
 */
public int getDoctorID() {
	return doctorID;
}
/**
 * @param doctorID the doctorID to set
 */
public void setDoctorID(int doctorID) {
	this.doctorID = doctorID;
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
 * @return the timeStamp
 */
public String getTimeStamp() {
	return timeStamp;
}
/**
 * @param timeStamp the timeStamp to set
 */
public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}
public String toString()
{
	return patientName+" "+patientID+" "+doctorName+" "+doctorID+" "+timeStamp;
}

  
}
