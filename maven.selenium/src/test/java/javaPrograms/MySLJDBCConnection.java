package javaPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class MySLJDBCConnection {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/rahul","root","rahul");  
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from station");
			System.out.println("ID"+"  "+"City"+"  "+"State"+"  "+"Lat_N"+"  "+"Lat_W");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4)+"  "+rs.getDouble(5));  
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
