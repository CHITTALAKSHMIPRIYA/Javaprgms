
package com.bridgelabz.model;

public class Doctor {
	private int doctorID;
	private String doctorName;
	private String doctorSpecialization;
	private String doctorAvailability;
	private int count;
	public Doctor()
	{
		
	}
	/**
	 * @param doctorName
	 * @param doctorID
	 * @param doctorSpecialization
	 * @param doctorAvailability
	 * @param count
	 */
	public Doctor(String doctorName, int doctorID, String doctorSpecialization, String doctorAvailability, int count) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorAvailability = doctorAvailability;
		this.count = count;
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
	 * @return the doctorSpecialization
	 */
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	/**
	 * @param doctorSpecialization the doctorSpecialization to set
	 */
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	/**
	 * @return the doctorAvailability
	 */
	public String getDoctorAvailability() {
		return doctorAvailability;
	}
	/**
	 * @param doctorAvailability the doctorAvailability to set
	 */
	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	public String toString()
	{
		return doctorName+" "+doctorID+" "+doctorSpecialization+" "+doctorAvailability+" "+count;
	}
}