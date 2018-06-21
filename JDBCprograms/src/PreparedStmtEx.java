import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class PreparedStmtEx {

	
	public static void main(String[] args) {
		//get run time values
				String regno=args[2];
				String firstname=args[0];
				String lastname=args[1];
				
				Connection con =null;
				PreparedStatement ptmt=null;
				try
				{
				Driver driverRef=new Driver();
				DriverManager.registerDriver(driverRef);
				String url="jdbc:mysql://localhost:3306/"+"bridgelabz?user=root&password=root";
				con=DriverManager.getConnection(url);
				String query="update students_info set firstname=?,lastname=?" + "where regno=?";
				//String query=" insert into students_info "+ "values(?,?,?)";
				ptmt=con.prepareStatement(query);
				ptmt.setInt(3,Integer.parseInt(regno));
				ptmt.setString(1,firstname);
				ptmt.setString(2,lastname);
				
			    int count=ptmt.executeUpdate();
			    System.out.println("rows affected:"+count);
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						if(con!=null)
						{
							con.close();
						}
						if(ptmt!=null)
						{
							ptmt.close();
						}
					}
					catch(SQLException e)
					{
						e.printStackTrace();
						
					}
				}
	}

}
