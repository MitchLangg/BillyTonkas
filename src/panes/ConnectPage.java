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
		Text text1 = new Text("UserID:");
		Text text2 = new Text("Password:");
		Text text3 = new Text("Database:");
		
		//Area to fill out the form
		TextArea textA1 = new TextArea();
		textA1.setMaxWidth(100);
		textA1.setMinHeight(25);
		textA1.setMaxHeight(25);
		TextArea textA2 = new TextArea();
		textA2.setMaxWidth(100);
		textA2.setMinHeight(25);
		textA2.setMaxHeight(25);
		TextArea textA3 = new TextArea();
		textA3.setMaxWidth(100);
		textA3.setMinHeight(25);
		textA3.setMaxHeight(25);
		//Submit button
		Button submitButton = new Button("Button");
		submitButton.setMinWidth(100);
		
		gpane.getChildren().addAll(text1, text2, text3, textA1, textA2, textA3, submitButton);
		GridPane.setRowIndex(text1, 0);
		GridPane.setRowIndex(text2, 1);
		GridPane.setRowIndex(text3, 2);
		GridPane.setRowIndex(textA1, 0);
		GridPane.setRowIndex(textA2, 1);
		GridPane.setRowIndex(textA3, 2);
		GridPane.setColumnIndex(textA1, 1);
		GridPane.setColumnIndex(textA2, 1);
		GridPane.setColumnIndex(textA3, 1);
		GridPane.setRowIndex(submitButton, 3);
		GridPane.setColumnSpan(submitButton, 1);
		
		this.setCenter(gpane);
		
	}
	


}


