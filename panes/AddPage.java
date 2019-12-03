package panes;

import javabeans.Candy;
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
import scenes.AddScene;
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
    	
    	//TO:DO Temporary Delete Later
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
 		
 		
 		
 		//-----------------------------------------------------
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		//TO:DO Temporary Delete Later
 		this.setCenter(testText);
 		
 		CandyTable candyTable = new CandyTable();
 		CandyStatsTable candyStatsTable = new CandyStatsTable();
 		ChocolateTable chocolateTable = new ChocolateTable();
 		ChocolateStatsTable chocolateStatsTable = new ChocolateStatsTable();
 		GummyTable gummyTable = new GummyTable();
 		GummyStatsTable gummyStatsTable = new GummyStatsTable();
 		InventoryTable inventoryTable = new InventoryTable();
 		LoginTable loginTable = new LoginTable();
 		
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
		
		Button submit = new Button("Submit");
		submit.setOnAction(e->{
			Candy candy = new Candy(
					Integer.parseInt(candyIDTF.getText()),
					candyNameTF.getText(),
					Double.parseDouble(candyPriceTF.getText()),
					Integer.parseInt(candyQuantityTF.getText()));
					
			candyTable.createCandy(candy);
			
		});
		root.add(submit, 0, 10);
		this.setCenter(root);
		
		
		
		
	}
}
