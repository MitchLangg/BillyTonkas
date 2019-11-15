package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private static Database instance = null;
	public static Connection connection = null;
	
	
	private Database() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://php.scweb.ca/" + Credentials.DB_NAME, 
						Credentials.DB_USER, Credentials.DB_PASS);
				System.out.println("Created Connection");
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			try {
				createTable(Const.TABLE_CHOCOLATE,
							Const.CREATE_TABLE_CHOCOLATE,
							connection);
				createTable(Const.TABLE_CHOCOLATE_STATS,
						Const.CREATE_TABLE_CHOCOLATE_STATS,
						connection);
				createTable(Const.TABLE_CANDY,
						Const.CREATE_TABLE_CANDY,
						connection);
				createTable(Const.TABLE_CANDY_STATS,
						Const.CREATE_TABLE_CANDY_STATS,
						connection);
				createTable(Const.TABLE_INVENTORY,
						Const.CREATE_TABLE_INVENTORY,
						connection);
				createTable(Const.TABLE_LOGIN,
						Const.CREATE_TABLE_LOGIN,
						connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		}
	
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return connection;	
	}
	
	public void createTable(String tableName, String tableQuery, 
			Connection connection) throws SQLException {
		
		Statement sqlStatement;
		DatabaseMetaData md = connection.getMetaData();
		ResultSet result = md.getTables(null, null, tableName, null);
		if(result.next()) {
			System.out.println(tableName + " table already exists");
		}
		else {
			sqlStatement = connection.createStatement();
			sqlStatement.execute(tableQuery);
			System.out.println("The "
					+ tableName + " table has been created");
		}
		
	}

}

