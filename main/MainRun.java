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

/**
 * @author MitchellTodd, IzaccLucas
 * @description Java class that contains main and launches application
 * @date Week 1-9
 */

public class MainRun extends Application {
	public static Stage mainStage;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		if(Files.exists(Paths.get("userAccount1.txt"))) {
			try {
				Scanner scanner = new Scanner(Paths.get("userAccount1.txt"));
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
