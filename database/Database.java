package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Alert;
import main.MainRun;
import panes.ConnectPage;
import panes.MainMenuBar;
import scenes.ConnnectScene;

public class Database {

	private static Database instance = null;
	public static Connection connection = null;
	public static boolean databaseFailure = false;
	
	
	private Database() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://" + Credentials.SERVER + "/" + Credentials.DB_NAME + "?useSSL=false", 
						Credentials.DB_USER, Credentials.DB_PASS);
				System.out.println("Created Connection");
			}
			
			catch(Exception e) {
				databaseFailure = true;
				MainRun.mainStage.setScene(new ConnnectScene());
				MainRun.mainStage.setTitle("BillyTonkas Database");
				
				MainRun.mainStage.show();
				ConnectPage.showAlert(Alert.AlertType.ERROR, main.MainRun.mainStage.getScene().getWindow(), "Invalid Credentials", "Please Try Again!");
				
			}
			if(!databaseFailure) {
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
					createTable(Const.TABLE_GUMMY,
							Const.CREATE_TABLE_GUMMY,
							connection);
				createTable(Const.TABLE_GUMMY_STATS,
						Const.CREATE_TABLE_GUMMY_STATS,
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

