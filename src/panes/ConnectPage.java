package panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectPage extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Possibly find new pane for t
		GridPane gpane = new GridPane();
		
		
		BorderPane borderpane = new BorderPane();
		
		
		//Text for the form
		Text text1 = new Text("UserID:");
		Text text2 = new Text("Password:");
		Text text3 = new Text("Database:");
		
		//Area to fill out the form
		TextArea textA1 = new TextArea();
		textA1.setMaxWidth(100);
		textA1.setMaxHeight(10);
		TextArea textA2 = new TextArea();
		textA2.setMaxWidth(100);
		textA2.setMaxHeight(10);
		TextArea textA3 = new TextArea();
		textA3.setMaxWidth(100);
		textA3.setMaxHeight(10);
		
		//Submit button
		Button submitButton = new Button("Button");
		
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
		
		borderpane.setCenter(gpane);
		Scene Connectscene = new Scene(borderpane,1280,720);
		primaryStage.setScene(Connectscene);
		primaryStage.setTitle("BillyTonkas Database");
		primaryStage.show();
		
		
	}

}