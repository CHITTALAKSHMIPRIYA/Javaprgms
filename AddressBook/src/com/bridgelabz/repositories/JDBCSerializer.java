
package com.bridgelabz.repositories;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.models.Person;
import com.bridgelabz.utility.AddressUtility;
import com.bridgelabz.utility.DataSource;
/**
 * @author bridgelabz
 *
 */
public class JDBCSerializer implements Serialiser  
{
	static Connection con= null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	@Override
	public Connection getConnection() throws SQLException, IOException, PropertyVetoException 
	{
		Connection connection = DataSource.getInstance().getConnection();
		return connection;
	}

	public void closeConnection() {
		if (rs!= null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		if (pstmt!= null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt!= null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void addPerson(Person person, String addressbookName)
			throws SQLException, IOException, PropertyVetoException {
		try {
			String query = "insert into " + addressbookName + " values(?,?,?,?,?,?,?,?)";

			pstmt = getConnection().prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, person.getFirstName());
			pstmt.setString(3, person.getLastName());
			pstmt.setString(4, person.getAddress());
			pstmt.setString(5, person.getCity());
			pstmt.setString(6, person.getState());
			pstmt.setString(7, person.getZip());
			pstmt.setString(8, person.getPhone());
			int count = pstmt.executeUpdate();
			if (count != 0)
				System.out.println("Person added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	public void deletePerson(String addressBookName) throws SQLException, IOException, PropertyVetoException {
		System.out.println("Enter the person id you want to delete");
		int personid = AddressUtility.integer();
		String query = "select * from " + addressBookName;
		Statement statement = getConnection().createStatement();
		rs = statement.executeQuery(query);
		while (rs.next()) {
			if (rs.getInt(1) == personid) {
				String query1 = "delete from " + addressBookName + " where personid=" + personid;
				statement.executeUpdate(query1);
				break;
			}
		}
		closeConnection();
	}

	@Override
	public void deleteAddressBook() throws SQLException, IOException, PropertyVetoException {
		System.out.println("Enter the addressbook name ypu want to delete");
		String addressBook = AddressUtility.String();
		String query1 = "drop table " + addressBook + ";";
		Statement statement = getConnection().createStatement();
		statement.executeUpdate(query1);

	}
	@Override
	public void createBook(String addressBookName)
			throws  IOException, SQLException, PropertyVetoException {
		
		String query = "create table " + addressBookName
				+ "(personid int(3) auto_increment primary key,firstName varchar(20),lastName varchar(30),address varchar(30),city varchar(20),state varchar(20),zip varchar(20),phone varchar(25))";
		Statement statement = getConnection().createStatement();
		statement.execute(query);
		
		closeConnection();

	}


	@Override
	public void viewAddressbook(String addressBookName)
			throws IOException, SQLException, PropertyVetoException {
		String query= "select * from " + addressBookName;
		Statement statement = getConnection().createStatement();
		rs = statement.executeQuery(query);
		while(rs.next()) {
			System.out.println("Person id: "+rs.getInt(1));
			System.out.println("FirstName: "+rs.getString(2));
			System.out.println("LastName: "+rs.getString(3));
			System.out.println("Address: "+rs.getString(4));
			System.out.println("City: "+rs.getString(5));
			System.out.println("State: "+rs.getString(6));
			System.out.println("ZipCode: "+rs.getString(7));
			System.out.println("PhoneNum: "+rs.getString(8));
			
		}
		closeConnection();
	}

	@Override
	public void updatePerson(String addressBookName, String[] inputs)
			throws IOException, SQLException, PropertyVetoException {
		String query= "select * from " + addressBookName;
		viewAddressbook(addressBookName);
		System.out.println("Enter id of person you want to update: ");
		int personid=AddressUtility.integer();
		String query1="update "+addressBookName+" set address='"+inputs[0]+"',city='"+inputs[1]+"',state='"+inputs[2]+"',zip='"+inputs[3]+"',phone='"+inputs[4]+ "' where personid="+personid;
		Statement statement = getConnection().createStatement();
		statement.executeQuery(query);
		statement.executeUpdate(query1);
		System.out.println("Updated successfully");
		closeConnection();
		}
	}


