package panes;

import javabeans.Candy;
import javabeans.Chocolate;
import javabeans.Gummy;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import main.MainRun;
import scenes.AddScene;
import scenes.ConnnectScene;
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;
import tables.CandyTable;
import tables.ChocolateTable;
import tables.GummyTable;
import tables.InventoryTable;

public class DeletePage extends BorderPane {
	public DeletePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
 		
    	//////Contents of the page//////
    	Text testText = new Text("This is the DeletePage");
    	
    	
    	
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
 		
 		//////Layout of page content//////
 		this.setCenter(testText);
		
 		/*
 		 * @author MitchellTodd
 		 */
 		
 		CandyTable candyTable = new CandyTable();
 		ChocolateTable chocolateTable = new ChocolateTable();		
 		GummyTable gummyTable = new GummyTable();
 		InventoryTable inventoryTable = new InventoryTable();
 
 		GridPane root = new GridPane();
 		Font textFont = Font.font("Ariel", 18);
 		Font titleFont = Font.font("Bookman", 24);
 		Background background = new Background(
				new BackgroundFill(Color.BEIGE, new CornerRadii(0), new Insets(0, 0, 0, 0)));
 		VBox candyBox = new VBox();
 		/////////////////////////////CANDY DELETE FORM///////////////////////////////////
 		
 		Text candyTDisplay = new Text("Delete from candy table: ");
 		
 		Text candyID = new Text("ID");
		
		TextField candyIDTF = new TextField();
		
		
		Button candySubmit = new Button("Delete");
		candySubmit.setOnAction(e->{
			Candy candy = new Candy(
					Integer.parseInt(candyIDTF.getText()));
			candyTable.deleteCandy(candy);
			
		});
		candyBox.getChildren().addAll(candyTDisplay, candyID, candyIDTF, candySubmit);
		candyBox.setAlignment(Pos.CENTER);
		candyBox.setPadding(new Insets(20,20,20,20));
		
		candyTDisplay.setFont(titleFont);
		candyID.setFont(textFont);
		candyBox.setBackground(background);
		root.add(candyBox, 2, 1);
		
		/////////////////////////////CHOCOLATE DELETE FORM///////////////////////////////////
		VBox chocolateBox = new VBox();
		Text chocolateTDisplay = new Text("Delete from chocolate table: ");
 		Text chocolateID = new Text("ID");
		TextField chocolateIDTF = new TextField();
		
		chocolateTDisplay.setFont(titleFont);
		chocolateID.setFont(textFont);
		
		Button chocolateSubmit = new Button("Delete");
		chocolateSubmit.setOnAction(e->{
			Chocolate chocolate = new Chocolate(
					Integer.parseInt(chocolateIDTF.getText()));
			chocolateTable.deleteChocolate(chocolate);
			 
		});
		chocolateBox.getChildren().addAll(chocolateTDisplay, chocolateID, chocolateIDTF, chocolateSubmit);
		chocolateBox.setAlignment(Pos.CENTER);
		chocolateBox.setPadding(new Insets(20,20,20,20));
		chocolateBox.setBackground(background);
		root.add(chocolateBox, 4, 1);
		
		/////////////////////////////GUMMY DELETE FORM///////////////////////////////////
		VBox gummyBox = new VBox();
		Text gummyTDisplay = new Text("Delete from gummy table: ");
 		Text gummyID = new Text("ID");
		TextField gummyIDTF = new TextField();
		
		gummyTDisplay.setFont(titleFont);
		gummyID.setFont(textFont);
		
		Button gummySubmit = new Button("Delete");
		gummySubmit.setOnAction(e->{
			Gummy gummy = new Gummy(
					Integer.parseInt(gummyIDTF.getText()));
			gummyTable.deleteGummy(gummy);
			
		});
		gummyBox.getChildren().addAll(gummyTDisplay, gummyID, gummyIDTF, gummySubmit);
		gummyBox.setAlignment(Pos.CENTER);
		gummyBox.setPadding(new Insets(20,20,20,20));
		gummyBox.setBackground(background);
		root.add(gummyBox, 6, 1);
		root.setGridLinesVisible(true);
		root.setAlignment(Pos.CENTER);
		
		this.setCenter(root);
		
		
		
		
	}
}

	

