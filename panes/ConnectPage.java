package panes;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import database.Credentials;
import database.Database;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Window;
import main.MainRun;
import scenes.HomeScene;

/**
 * @author MitchellTodd/Mitchell Lang
 * @description creating the connection page
 * @date Week 8-13
 */

public class ConnectPage extends GridPane{
	//File.io
	File incrementer = new File("incrementer.txt");
	File currentAccount = new File("currentAccount.txt");
	int fileIncrementer = 0;
	public static String connectButtonText = "Connect";
	public static CheckBox checkbox;
	
	private GridPane createRegistrationFormPane() {
        // Instantiate a new Grid Pane
        // Position the pane at the center of the screen, both vertically and horizontally
        this.setAlignment(Pos.CENTER);
        // Set a padding of 20px on each side
        this.setPadding(new Insets(40, 40, 40, 40));
        // Set the horizontal gap between columns
        this.setHgap(10);
        // Set the vertical gap between rows
        this.setVgap(10);
        // Add Column Constraints
        //columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        //columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        this.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return this;
    }
	
	public void FileAccountCreator(int incrementer) {
		File file = new File("userAccount" + incrementer + ".txt");
		try {
			file.createNewFile();
			if (file.getPath().equals("userAccount1.txt")) {
				currentAccount.createNewFile();
				PrintWriter printer = new PrintWriter(new FileOutputStream(currentAccount,false));
				printer.print(file.getPath());
				printer.close();
			}
			PrintWriter printer = new PrintWriter(new FileWriter(file,true));
			printer.print(Credentials.SERVER + " ");
			printer.print(Credentials.DB_NAME + " ");
			printer.print(Credentials.DB_USER + " ");
			printer.print(Credentials.DB_PASS + " ");
			printer.close();
			MenuItem account = new MenuItem("Account " + Credentials.DB_NAME );
			MainMenuBar.getSettingMenu().getItems().add(account);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
    private void addUIControls(GridPane gridPane) {
    	//Colourway
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
    	//Image view
    	Image image = new Image("Images/newlogo.png");
    	ImageView logo = new ImageView();
    	logo.setImage(image);
    	gridPane.add(logo,0,0,2,1);
        GridPane.setHalignment(logo, HPos.CENTER);
        GridPane.setMargin(logo, new Insets(20, 0,20,0));
        
        //Server Label
        Label serverName = new Label("Server : ");
        gridPane.add(serverName, 0,1);

        //Server Text Field
        TextField serverField = new TextField();
        serverField.setPrefHeight(40);
        gridPane.add(serverField, 1,1);
        
        //Database Label
        Label database = new Label("Database : ");
        gridPane.add(database, 0,2);

        //Database Text Field
        TextField dataBaseField = new TextField();
        dataBaseField.setPrefHeight(40);
        gridPane.add(dataBaseField, 1,2);

        //Username Label
        Label username = new Label("Username : ");
        gridPane.add(username, 0, 3);

        //Username Text Field
        TextField usernameField = new TextField();
        usernameField.setPrefHeight(40);
        gridPane.add(usernameField, 1, 3);

        //Password Label
        Label password = new Label("Password : ");
        gridPane.add(password, 0, 4);

        //Password Field
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 4);

        //Submit Button Borders/Backgrounds/Font
        Background submitBackground = new Background(
				new BackgroundFill(Color.MAROON, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border submitBorder = new Border(
				new BorderStroke(Color.BROWN, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		
		Background submitBackgroundHover = new Background(
				new BackgroundFill(Color.RED, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border submitBorderHover = new Border(
				new BorderStroke(Color.CHOCOLATE, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		
		 Font submitFont = Font.font("Ariel", 18);
		 Font exitFont = Font.font("Ariel", 18);
		 
        //Connect Button (remade)
        Text submitButton = new Text(connectButtonText);
		submitButton.setFont(submitFont);
		submitButton.setFill(Color.WHITE);
		VBox submitButtonBox = new VBox();
		submitButtonBox.getChildren().add(submitButton);
		submitButtonBox.setMaxHeight(40);
		submitButtonBox.setMaxWidth(130);
		submitButtonBox.setAlignment(Pos.CENTER);
		submitButtonBox.setSpacing(25);
		submitButtonBox.setBackground(submitBackground);
		submitButtonBox.setBorder(submitBorder);
		gridPane.add(submitButtonBox, 0, 6, 2, 1);
		GridPane.setHalignment(submitButtonBox, HPos.CENTER);
		
		//CheckBox
		checkbox = new CheckBox("Save Credentials?");
		GridPane.setHalignment(checkbox, HPos.LEFT);
		gridPane.add(checkbox, 1, 6);
		
		//Exit Button
        Text exitButton = new Text("Exit");
        exitButton.setFont(exitFont);
        exitButton.setFill(Color.WHITE);
		VBox exitButtonBox = new VBox();
		exitButtonBox.getChildren().add(exitButton);
		exitButtonBox.setMaxHeight(40);
		exitButtonBox.setMaxWidth(130);
		exitButtonBox.setAlignment(Pos.CENTER);
		exitButtonBox.setSpacing(25);
		exitButtonBox.setBackground(submitBackground);
		exitButtonBox.setBorder(submitBorder);
		gridPane.add(exitButtonBox, 0, 7, 2, 1);
		GridPane.setHalignment(exitButtonBox, HPos.CENTER);
		
		//Exit button functionality
		exitButtonBox.setOnMouseEntered(e -> {
			exitButtonBox.setBackground(submitBackgroundHover);
			exitButtonBox.setBorder(submitBorderHover);
		});
		exitButtonBox.setOnMouseExited(e -> {
			exitButtonBox.setBackground(submitBackground);
			exitButtonBox.setBorder(submitBorder);
		});

		exitButtonBox.setOnMouseClicked(e -> {
		System.exit(0);
		});
		
		//Submit button functionality 
		submitButtonBox.setOnMouseEntered(e -> {
			submitButtonBox.setBackground(submitBackgroundHover);
			submitButtonBox.setBorder(submitBorderHover);
		});

		submitButtonBox.setOnMouseExited(e -> {
			submitButtonBox.setBackground(submitBackground);
			submitButtonBox.setBorder(submitBorder);
		});

		submitButtonBox.setOnMouseClicked(e -> {
			if(serverField.getText().isEmpty()) {
		    	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Server entry");
		    	return;
			}
			 if(dataBaseField.getText().isEmpty()) {
				 showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Database entry");
				 return;
			 	}
			 if(usernameField.getText().isEmpty()) {
			     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Username entry");
			     return;
			 }
			 if(passwordField.getText().isEmpty()) {
			     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Password entry");
			     return;
			 }else {
				 Credentials.DB_NAME = dataBaseField.getText();
		    	 Credentials.DB_USER = usernameField.getText();
		    	 Credentials.DB_PASS = passwordField.getText();
		    	 Credentials.SERVER = serverField.getText();
		    	 
		    	 if (checkbox.isSelected() == true) {
						
						if(!incrementer.exists()) {
							try {
								incrementer.createNewFile();
								PrintWriter printer = new PrintWriter(new FileOutputStream(incrementer,false));
								printer.print(1);
								printer.close();
								Scanner scanner = new Scanner(incrementer);
								fileIncrementer = scanner.nextInt();
								scanner.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}else {
							try {
								Scanner scanner = new Scanner(incrementer);
								fileIncrementer = scanner.nextInt();
								scanner.close();
								PrintWriter printer = new PrintWriter(new FileOutputStream(incrementer,false));
								fileIncrementer += 1;
								printer.print(fileIncrementer);
								printer.close();
							}catch(Exception e1) {
								e1.printStackTrace();
							}	
						}
						FileAccountCreator(fileIncrementer);
					}
	  			Database.getInstance();
	  			showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Credentials Successful!", "Welcome " + usernameField.getText());
	  			MainRun.mainStage.setScene(new HomeScene());
			 }	
			});
		/**
		 * @author MitchellTodd
		 * @description checking input on connect page
		 * @date Week 5-8
		 */
		
		//When the enter key is pressed, call the enterButton Function
	    gridPane.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
			if (ev.getCode() == KeyCode.ENTER) {
			enterButtonFunc(gridPane, usernameField, serverField, dataBaseField, passwordField);
			 if(serverField.getText().isEmpty()) {
			    	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Server entry");
			    	return;
				}
				 if(dataBaseField.getText().isEmpty()) {
					 showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Database entry");
					 return;
				 	}
				 if(usernameField.getText().isEmpty()) {
				     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Username entry");
				     return;
				 }
				 if(passwordField.getText().isEmpty()) {
				     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Password entry");
				     return;
				 }else {
				Credentials.DB_NAME = dataBaseField.getText();
				Credentials.DB_USER = usernameField.getText();
				Credentials.DB_PASS = passwordField.getText();
				Credentials.SERVER = serverField.getText();

					if (checkbox.isSelected() == true) {

					if(!incrementer.exists()) {
						try {
							incrementer.createNewFile();
							PrintWriter printer = new PrintWriter(new FileOutputStream(incrementer,false));
							printer.print(1);
							printer.close();
							Scanner scanner = new Scanner(incrementer);
							fileIncrementer = scanner.nextInt();
							scanner.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}else {
						try {
							Scanner scanner = new Scanner(incrementer);
							fileIncrementer = scanner.nextInt();
							scanner.close();
							PrintWriter printer = new PrintWriter(new FileOutputStream(incrementer,false));
							fileIncrementer += 1;
							printer.print(fileIncrementer);
							printer.close();
						}catch(Exception e1) {
							e1.printStackTrace();
						}
					}
					FileAccountCreator(fileIncrementer);
				}
	 			Database.getInstance();
	 			showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Credentials Successful!", "Welcome " + usernameField.getText());
	 			MainRun.mainStage.setScene(new HomeScene());
				 }
			}
	});
  }
	/**
	 * @author MitchellTodd
	 * @description checking input on connect page
	 * @date Week 5-8
	 */
    
 		//enterButtonFunc checks if each textfield is filled and with the correct info, if yes then create the connection.
    	//based on the conditions user recieves specific output
		public static void enterButtonFunc(GridPane gridPane, TextField usernameField, TextField serverField, TextField dataBaseField, TextField passwordField) {
				//Enter functionality for connecting
					   if(serverField.getText().isEmpty()) {
					    	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Server entry");
					    	return;
						}
						 if(dataBaseField.getText().isEmpty()) {
							 showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Database entry");
							 return;
						 	}
						 if(usernameField.getText().isEmpty()) {
						     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Username entry");
						     return;
						 }
						 if(passwordField.getText().isEmpty()) {
						     showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Login Error!", "Please check Password entry");
						     return;
						 }else {
							 Credentials.DB_NAME = dataBaseField.getText();
					    	 Credentials.DB_USER = usernameField.getText();
					    	 Credentials.DB_PASS = passwordField.getText();
					    	 Credentials.SERVER = serverField.getText();
					     }

				   }
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
	
	public ConnectPage() {
			GridPane gridPane = createRegistrationFormPane();
			addUIControls(gridPane);
	}
}
    


