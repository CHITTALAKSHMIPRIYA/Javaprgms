
package com.bridgelabz.repositories;

/**
 * @author bridgelabz
 *
 */
public class SerialiserFactory 
{
	public static Serialiser getSerialiser(String serialiserType) 
	{
		
		if(("JSON").equalsIgnoreCase(serialiserType)) 
		{
			return new JSONSerializer();
		}
		else if(("JDBC").equalsIgnoreCase(serialiserType)) 
		{
			return new JDBCSerializer();
		}
		return null;
	}
}
