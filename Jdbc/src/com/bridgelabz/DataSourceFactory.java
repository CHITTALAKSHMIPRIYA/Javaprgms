
package com.bridgelabz;

import java.io.FileInputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceFactory {
public  static DataSource getMySQLDataSource() {
	Properties prop=new Properties();
	FileInputStream fs=null;
	MysqlDataSource mysqlds=null;
	try
	{
		fs=new FileInputStream("/home/bridgelabz/Javaprograms/Jdbc/src/com/bridgelabz/pool.properties");
		prop.load(fs);
		mysqlds=new MysqlDataSource();
		mysqlds.setURL(prop.getProperty("MYSQL_DB_URL"));
		mysqlds.setUser(prop.getProperty("MYSQL_DB_USER"));
		mysqlds.setPassword(prop.getProperty("MYSQL_DB_PASSWORD"));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return mysqlds;
	
}
}
