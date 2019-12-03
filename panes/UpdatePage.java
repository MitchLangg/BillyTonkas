package panes;

import javabeans.Candy;
import javabeans.Chocolate;
import javabeans.Gummy;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
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
import tables.CandyTable;
import tables.ChocolateTable;
import tables.GummyTable;
import tables.InventoryTable;


public class UpdatePage extends BorderPane{
	public UpdatePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
    	//Contents of page
    	Text testText = new Text("This is the UpdatePage");
 		
    	
    	//MENU BAR FUNCTIONS
 		//When the exit button is clicked the program is closed
 		MainMenuBar.getFileMenu1().setOnAction(e->{
 			System.exit(0);
 		});
 		
 		MainMenuBar.getAddPage().setOnAction(e->{
 			MainRun.mainStage.setScene(new AddScene());
 		});
 		MainMenuBar.getHomePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new HomeScene());
 		});
 		MainMenuBar.getDeletePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new DeleteScene());
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
 		
 		//Layout of items on page
 		this.setCenter(testText);
	
 		/*
 		 * @author MitchellTodd
 		 */
 		
 		CandyTable candyTable = new CandyTable();
 		ChocolateTable chocolateTable = new ChocolateTable();		
 		GummyTable gummyTable = new GummyTable();
 		InventoryTable inventoryTable = new InventoryTable();
 
 		GridPane root = new GridPane();
 		
 		/////////////////////////////CANDY UPDATE FORM///////////////////////////////////
 		
 		Text candyTDisplay = new Text("Update within candy table: ");
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
		
		Text candyQuantity = new Text("Update Quantity");
		root.add(candyQuantity, 0, 8);
		
		TextField candyQuantityTF = new TextField();
		root.add(candyQuantityTF, 0, 9);
		
		Button candySubmit = new Button("Update");
		candySubmit.setOnAction(e->{
			Candy candy = new Candy(
					Integer.parseInt(candyIDTF.getText()),
					candyNameTF.getText(),
					Double.parseDouble(candyPriceTF.getText()),
					Integer.parseInt(candyQuantityTF.getText()));
					
			candyTable.updateCandy(candy);
			
		});
		root.add(candySubmit, 0, 10);
		
		/////////////////////////////CHOCOLATE UPDATE FORM///////////////////////////////////
		
		Text chocolateTDisplay = new Text("Update within chocolate table: ");
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
		
		Text chocolateQuantity = new Text("Update Quantity");
		root.add(chocolateQuantity, 1, 8);
		
		TextField chocolateQuantityTF = new TextField();
		root.add(chocolateQuantityTF, 1, 9);
		
		Button chocolateSubmit = new Button("Update");
		chocolateSubmit.setOnAction(e->{
			Chocolate chocolate = new Chocolate(
					Integer.parseInt(chocolateIDTF.getText()),
					chocolateNameTF.getText(),
					Double.parseDouble(chocolatePriceTF.getText()),
					Integer.parseInt(chocolateQuantityTF.getText()));
					
			chocolateTable.updateChocolate(chocolate);
			
		});
		root.add(chocolateSubmit, 1, 10);
		
		/////////////////////////////GUMMY UPDATE FORM///////////////////////////////////
		
		Text gummyTDisplay = new Text("Update within gummy table: ");
 		root.add(gummyTDisplay, 2, 0);
 		
 		Text gummyID = new Text("ID");
		root.add(gummyID, 2, 2);
		
		TextField gummyIDTF = new TextField();
		root.add(gummyIDTF, 2, 3);
		
		Text gummyName = new Text("Gummy Name");
		root.add(gummyName, 2, 4);
		
		TextField gummyNameTF = new TextField();
		root.add(gummyNameTF, 2, 5);
		
		Text gummyPrice = new Text("Gummy Price");
		root.add(gummyPrice, 2, 6);
		
		TextField gummyPriceTF = new TextField();
		root.add(gummyPriceTF, 2, 7);
		
		Text gummyQuantity = new Text("Update Quantity");
		root.add(gummyQuantity, 2, 8);
		
		TextField gummyQuantityTF = new TextField();
		root.add(gummyQuantityTF, 2, 9);
		
		Button gummySubmit = new Button("Update");
		gummySubmit.setOnAction(e->{
			Gummy gummy = new Gummy(
					Integer.parseInt(gummyIDTF.getText()),
					gummyNameTF.getText(),
					Double.parseDouble(gummyPriceTF.getText()),
					Integer.parseInt(gummyQuantityTF.getText()));
					
			gummyTable.updateGummy(gummy);
			
		});
		root.add(gummySubmit, 2, 10);
		
		
		this.setCenter(root);
		
		
		
		
	}
}

	



