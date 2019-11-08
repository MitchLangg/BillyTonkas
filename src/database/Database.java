package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static Database instance = null;
	public static Connection connection;
	
	
	private Database() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://php.scweb.ca/" + Const.DB_NAME, 
						Const.DB_USER, Const.DB_PASS);
				System.out.println("Created Connection");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

