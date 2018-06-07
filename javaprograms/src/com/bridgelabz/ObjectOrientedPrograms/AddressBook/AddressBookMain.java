
package com.bridgelabz.ObjectOrientedPrograms.AddressBook;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.util.Utility;

public class AddressBookMain {

 public static void main(String[] args) {
		AddressBookcontroller ac=new AddressBookcontroller();
		System.out.println(" ADDRESSBOOK");
		boolean close = false;
		while (close == false) {
			System.out.println("1.NEW \n2.ADD \n3.EDIT \n4.DELETE \n5.SAVE \n6.SORT BY NAME "
					+ "\n7.SORT BY ZIP \n8.EXIT");
			System.out.println("Enter choice");
			int choice = Utility.Int();
			switch (choice) {
			case 1:
				ac.doNew();
				break;
			case 2:
				ac.doadd();
				break;
			case 3:
				try {
					ac.doEdit();
				} catch (IOException | ParseException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					ac.doDelete();
				} catch (IOException | ParseException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				ac.doSave();
				break;
			case 6:
				ac.dosortByName();
				break;
			case 7:
				ac.dosortByZIP();
				break;
			case 8:
				close = true;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}


	}


