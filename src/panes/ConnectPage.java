package panes;

import java.awt.Insets;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ConnectPage extends BorderPane{
	public ConnectPage() {

		//Possibly find new pane for this
		GridPane gpane = new GridPane();
		
		
		
		
		//Text for the form
		Text text1 = new Text("EmployeeID:");
		Text text2 = new Text("Password:");
		Text text3 = new Text("Database:");
		
		//Area to fill out the form
		TextArea employeeId = new TextArea();
		employeeId.setMaxWidth(100);
		employeeId.setMinHeight(25);
		employeeId.setMaxHeight(25);
		TextArea password = new TextArea();
		password.setMaxWidth(100);
		password.setMinHeight(25);
		password.setMaxHeight(25);
		TextArea database = new TextArea();
		database.setMaxWidth(100);
		database.setMinHeight(25);
		database.setMaxHeight(25);
		//Submit button
		Button submitButton = new Button("Connect Now");
		submitButton.setMinWidth(100);
		submitButton.setAlignment(Pos.CENTER);
		
		gpane.getChildren().addAll(text1, text2, text3, employeeId, password, database, submitButton);
		GridPane.setRowIndex(text1, 0);
		GridPane.setRowIndex(text2, 1);
		GridPane.setRowIndex(text3, 2);
		GridPane.setRowIndex(employeeId, 0);
		GridPane.setRowIndex(password, 1);
		GridPane.setRowIndex(database, 2);
		GridPane.setColumnIndex(employeeId, 1);
		GridPane.setColumnIndex(password, 1);
		GridPane.setColumnIndex(database, 1);
		GridPane.setRowIndex(submitButton, 3);
		GridPane.setColumnSpan(submitButton, 1);
		
		this.setCenter(gpane);

	}
	


}


