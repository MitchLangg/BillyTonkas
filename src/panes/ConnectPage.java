package panes;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Window;
import main.MainRun;
import scenes.HomeScene;


public class ConnectPage extends GridPane{
	
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

    private void addUIControls(GridPane gridPane) {
    	//Image view
    	Image image = new Image("Images/logo.png");
    	ImageView logo = new ImageView();
    	logo.setImage(image);
    	gridPane.add(logo,0,0,2,1);
        GridPane.setHalignment(logo, HPos.CENTER);
        GridPane.setMargin(logo, new Insets(20, 0,20,0));
        //Header
      //  Label headerLabel = new Label("Billy Tonkas Connection Login");
       // headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
      //  gridPane.add(headerLabel, 0,0,2,1);
      //  GridPane.setHalignment(headerLabel, HPos.CENTER);
     //   GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        //Name Label
        Label employeeID = new Label("Employee ID : ");
        gridPane.add(employeeID, 0,1);

        //Name Text Field
        TextField employeeIDfield = new TextField();
        employeeIDfield.setPrefHeight(40);
        gridPane.add(employeeIDfield, 1,1);


        //Email Label
        Label database = new Label("Database : ");
        gridPane.add(database, 0, 2);

        //Email Text Field
        TextField databaseField = new TextField();
        databaseField.setPrefHeight(40);
        gridPane.add(databaseField, 1, 2);

        //Password Label
        Label password = new Label("Password : ");
        gridPane.add(password, 0, 3);

        //Password Field
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 3);

        //Submit Button
        Button submitButton = new Button("Make Connection");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(130);
        gridPane.add(submitButton, 0, 4, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(employeeIDfield.getText().isEmpty()) {
                			//Images [x]
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your ID");
                    return;
                }
                if(databaseField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a Database");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }
                		//Image [Check]
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Credentials Successful!", "Welcome " + employeeIDfield.getText());
                MainRun.mainStage.setScene(new HomeScene());
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
	
	public ConnectPage() {
		GridPane gridPane = createRegistrationFormPane();
		//Possibly find new pane for this
		 addUIControls(gridPane);
		
		  
		

	}
}


