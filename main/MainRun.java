package main;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import database.Credentials;
import database.Database;
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.ConnnectScene;
import scenes.HomeScene;
import panes.ConnectPage;

public class MainRun extends Application {
	public static Stage mainStage;
	public static void main(String[] args) {
		launch(args);
	}

	String userAccount = "Default";
	public void start(Stage primaryStage) throws Exception {
	if(ConnectPage.currentAccount.exists()) {
		try {
			Scanner scanner2 = new Scanner(ConnectPage.currentAccount);
			userAccount = scanner2.next();
			scanner2.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		mainStage = primaryStage;
		if(Files.exists(Paths.get(userAccount))) {
			try {
				Scanner scanner = new Scanner(Paths.get(userAccount));
				Credentials.SERVER = scanner.next();
				Credentials.DB_NAME = scanner.next();
				Credentials.DB_USER = scanner.next();
				Credentials.DB_PASS = scanner.next();
				
				scanner.close();
			}catch(Exception e) {
				e.printStackTrace();
			}	
			Database.getInstance();
			primaryStage.setScene(new HomeScene());
			primaryStage.setTitle("BillyTonkas Database");
			primaryStage.show();
		}else {
			primaryStage.setScene(new ConnnectScene());
			primaryStage.setTitle("BillyTonkas Database");
			primaryStage.show();
		}
		
		
	}

}
