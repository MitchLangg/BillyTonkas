package panes;

import javabeans.Candy;
import javabeans.Chocolate;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import main.MainRun;
import scenes.ConnnectScene;
import scenes.DeleteScene;
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;
import tables.CandyStatsTable;
import tables.CandyTable;
import tables.ChocolateStatsTable;
import tables.ChocolateTable;
import tables.GummyStatsTable;
import tables.GummyTable;
import tables.InventoryTable;
import tables.LoginTable;


public class AddPage extends BorderPane{
	public AddPage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
    	//Contents of the page
    	Text testText = new Text("This is the AddPage");
    	
    	
 		//MENU BAR FUNCTIONS ----------------------------------
 		//When the exit button is clicked the program is closed
 		MainMenuBar.getFileMenu1().setOnAction(e->{
 			System.exit(0);
 		});
 		
 		MainMenuBar.getDeletePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new DeleteScene());
 		});
 		MainMenuBar.getHomePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new HomeScene());
 		});
 		MainMenuBar.getUpdatePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new UpdateScene());
 		});
 		MainMenuBar.getDisplayPage().setOnAction(e->{
 			MainRun.mainStage.setScene(new DisplayScene());
 		});
 		MainMenuBar.getAccount().setOnAction(e->{
 			ConnectPage.connectButtonText = "Add Account";
 			MainRun.mainStage.setScene(new ConnnectScene());
 			ConnectPage.checkbox.setSelected(true);
 			ConnectPage.checkbox.setDisable(true);
 		});
 		
 		
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		
 		//Layout the contents of screen
 		this.setCenter(testText);
 		
 		CandyTable candyTable = new CandyTable();
 		ChocolateTable chocolateTable = new ChocolateTable();		
 		GummyTable gummyTable = new GummyTable();
 		InventoryTable inventoryTable = new InventoryTable();
 
 		
 		GridPane root = new GridPane();
 		
 		Text candyTDisplay = new Text("Add into candy table: ");
 		root.add(candyTDisplay, 0, 0);
 		
 		Text candyID = new Text("ID");
		root.add(candyID, 0, 2);
		
		TextField candyIDTF = new TextField();
		root.add(candyIDTF, 0, 3);
		
		Text candyName = new Text("Candy Name");
		root.add(candyName, 0, 4);
		
		TextField candyNameTF = new TextField();
		root.add(candyNameTF, 0, 5);
		
		Text candyPrice = new Text("Candy Price");
		root.add(candyPrice, 0, 6);
		
		TextField candyPriceTF = new TextField();
		root.add(candyPriceTF, 0, 7);
		
		Text candyQuantity = new Text("Candy Quantity");
		root.add(candyQuantity, 0, 8);
		
		TextField candyQuantityTF = new TextField();
		root.add(candyQuantityTF, 0, 9);
		
		Button candySubmit = new Button("Submit");
		candySubmit.setOnAction(e->{
			Candy candy = new Candy(
					Integer.parseInt(candyIDTF.getText()),
					candyNameTF.getText(),
					Double.parseDouble(candyPriceTF.getText()),
					Integer.parseInt(candyQuantityTF.getText()));
					
			candyTable.createCandy(candy);
			
		});
		root.add(candySubmit, 0, 10);
		
		Text chocolateTDisplay = new Text("Add into chocolate table: ");
 		root.add(chocolateTDisplay, 1, 0);
 		
 		Text chocolateID = new Text("ID");
		root.add(chocolateID, 1, 2);
		
		TextField chocolateIDTF = new TextField();
		root.add(chocolateIDTF, 1, 3);
		
		Text chocolateName = new Text("Chocolate Name");
		root.add(chocolateName, 1, 4);
		
		TextField chocolateNameTF = new TextField();
		root.add(chocolateNameTF, 1, 5);
		
		Text chocolatePrice = new Text("Chocolate Price");
		root.add(chocolatePrice, 1, 6);
		
		TextField chocolatePriceTF = new TextField();
		root.add(chocolatePriceTF, 1, 7);
		
		Text chocolateQuantity = new Text("Chocolate Quantity");
		root.add(chocolateQuantity, 1, 8);
		
		TextField chocolateQuantityTF = new TextField();
		root.add(chocolateQuantityTF, 1, 9);
		
		Button chocolateSubmit = new Button("Submit");
		chocolateSubmit.setOnAction(e->{
			Chocolate chocolate = new Chocolate(
					Integer.parseInt(chocolateIDTF.getText()),
					chocolateNameTF.getText(),
					Double.parseDouble(chocolatePriceTF.getText()),
					Integer.parseInt(chocolateQuantityTF.getText()));
					
			chocolateTable.createChocolate(chocolate);
			
		});
		root.add(chocolateSubmit, 1, 10);
		
		
		
		this.setCenter(root);
		
		
		
		
	}
}
