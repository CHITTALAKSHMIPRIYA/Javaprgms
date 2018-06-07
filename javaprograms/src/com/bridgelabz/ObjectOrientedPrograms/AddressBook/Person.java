
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import com.bridgelabz.util.Utility;

public class Person {
   static String firstName;
   static String lastName;
  static String address;
  static String city;
  static String state;
  static String ZIP;
  static String phone;
  
  

  public Person() {
		setFirstName();
		setLastName();
		setAddress();
		setCity();
		setState();
		setZip();
		setPhone();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 */
	public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.ZIP = zip;
		this.phone = phone;
	}

	/**
	 * 
	 */
	public void setFirstName() {
		this.firstName = Utility.String();
	}

	/**
	 * 
	 */
	public void setLastName() {
		this.lastName = Utility.String();
	}

	/**
	 * 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public void setAddress() {
		
		this.address =  Utility.String();
	}
	/**
	 * 
	 */
	public void setCity() {
		this.city = Utility.String();
	}
	
	/**
	 * 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public void setState() {
		this.state = Utility.String();
	}
	/**
	 * 
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 */
	public void setZip() {
		this.ZIP =Utility.String();
	}
	/**
	 * 
	 */
	public void setZip(String zip) {
		this.ZIP =zip;
	}
	/**
	 * 
	 */
	public void setPhone(String mobile) {
		this.phone = phone;
	}
	/**
	 * 
	 */
	public void setPhone() {
		this.phone = Utility.String();
	}
	
	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return
	 */
	public String getZip() {
		return ZIP;
	}

	/**
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	
	public static class CompareByName {

		public CompareByName() {
		}
		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			int compareByLastName=person1.lastName.compareTo(person2.lastName);
			if(compareByLastName!=0)
			{
				return compareByLastName;
			}
			else {
				return (person1.firstName.compareTo(person2.firstName));
			}
		}
		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return compare(person1,person2) == 0 ? true : false;
		}
	}
	public static class CompareByZip {

		/**
		 * 
		 */
		public CompareByZip() {
		}


		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			int compareByZip=person1.ZIP.compareTo(person2.ZIP);
			if(compareByZip!=0)
			{
				return compareByZip;
			}
			else {
				return new CompareByName().compare(person1, person2);
			}
			
		}

		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.ZIP.compareTo(person2.ZIP) == 0 ? true : false;
		}
}
}



