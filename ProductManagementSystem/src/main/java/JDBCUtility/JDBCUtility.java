package JDBCUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {

	private static Connection con=null;
	
	public static Connection getConnection() {
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","root");
			System.out.println("Connected to Database!!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
