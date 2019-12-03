package panes;

import java.util.ArrayList;

import javabeans.Candy;
import javabeans.Chocolate;
import javabeans.Gummy;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
import scenes.ConnnectScene;
import scenes.DeleteScene;
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;
import tables.CandyTable;
import tables.ChocolateTable;
import tables.GummyTable;
import tables.InventoryTable;
import tables.LoginTable;

/*
 * @author MitchellTodd/Mitchell Lang
 */
public class AddPage extends BorderPane{
	private PieChart chart;
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
 
 		/*
 		 * @author Mitchell Lang
 		 */
 		GridPane root = new GridPane();
 		//Font for text
 		Font textFont = Font.font("Ariel", 18);
 		Font titleFont = Font.font("Bookman", 24);
 		VBox candyBox = new VBox();
 		
 		//Creating VBox/Text/TextViews
 		Text candyTDisplay = new Text("Add into candy table: ");
 		Text candyID = new Text("ID");
		TextField candyIDTF = new TextField();
		Text candyName = new Text("Candy Name");
		TextField candyNameTF = new TextField();
		Text candyPrice = new Text("Candy Price");
		TextField candyPriceTF = new TextField();
		Text candyQuantity = new Text("Candy Quantity");
		TextField candyQuantityTF = new TextField();
		
		//Setting text fonts
		candyTDisplay.setFont(titleFont);
		candyID.setFont(textFont);
		candyName.setFont(textFont);
		candyPrice.setFont(textFont);
		candyQuantity.setFont(textFont);
		
		//submit button functionality
		Button candySubmit = new Button("Submit");
		candySubmit.setOnAction(e->{
			Candy candy = new Candy(
					candyNameTF.getText(),
					Double.parseDouble(candyPriceTF.getText()),
					Integer.parseInt(candyQuantityTF.getText()));
					
			candyTable.createCandy(candy);
			
		});
		candyBox.getChildren().addAll(candyTDisplay, candyID, candyIDTF, candyName, candyNameTF, candyPrice, candyPriceTF, candyQuantity, candyQuantityTF, candySubmit);
		candyBox.setAlignment(Pos.CENTER);
		candyBox.setPadding(new Insets(5,5,5,5));
		root.add(candyBox, 2, 1);
		
		//////////////////////////////////////////////////////////////////
		//Creating Vbox/Text/TextViews
		VBox chocolateBox = new VBox();
		Text chocolateTDisplay = new Text("Add into chocolate table: ");
 		Text chocolateID = new Text("ID");
		TextField chocolateIDTF = new TextField();
		Text chocolateName = new Text("Chocolate Name");
		TextField chocolateNameTF = new TextField();	
		Text chocolatePrice = new Text("Chocolate Price");	
		TextField chocolatePriceTF = new TextField();	
		Text chocolateQuantity = new Text("Chocolate Quantity");	
		TextField chocolateQuantityTF = new TextField();
		
		//Setting text fonts
		chocolateTDisplay.setFont(titleFont);
		chocolateID.setFont(textFont);
		chocolateName.setFont(textFont);
		chocolatePrice.setFont(textFont);
		chocolateQuantity.setFont(textFont);
		
		//submit button functionality
		Button chocolateSubmit = new Button("Submit");
		chocolateSubmit.setOnAction(e->{
			Chocolate chocolate = new Chocolate(
					Integer.parseInt(chocolateIDTF.getText()),
					chocolateNameTF.getText(),
					Double.parseDouble(chocolatePriceTF.getText()),
					Integer.parseInt(chocolateQuantityTF.getText()));
					
			chocolateTable.createChocolate(chocolate);
			
		});
		chocolateBox.getChildren().addAll(chocolateTDisplay, chocolateID, chocolateIDTF, chocolateName, chocolateNameTF, chocolatePrice, chocolatePriceTF, chocolateQuantity, chocolateQuantityTF, chocolateSubmit);
		chocolateBox.setAlignment(Pos.CENTER);
		chocolateBox.setPadding(new Insets(5,5,5,5));
		root.add(chocolateBox, 4, 1);
		
		////////////////////////////////////////////////////////////////
		
		/*
		 * @author MitchellTodd
		 */
		//Creating Vbox/Text/TextFields
		VBox gummyBox = new VBox();
		Text gummyTDisplay = new Text("Add into gummy table: ");
 		Text gummyID = new Text("ID");		
		TextField gummyIDTF = new TextField();		
		Text gummyName = new Text("Gummy Name");		
		TextField gummyNameTF = new TextField();	
		Text gummyPrice = new Text("Gummy Price");	
		TextField gummyPriceTF = new TextField();	
		Text gummyQuantity = new Text("Gummy Quantity");	
		TextField gummyQuantityTF = new TextField();
		
		//Setting Fonts for the text
		gummyTDisplay.setFont(titleFont);
		gummyID.setFont(textFont);
		gummyName.setFont(textFont);
		gummyPrice.setFont(textFont);
		gummyQuantity.setFont(textFont);
		
		//Submit button functionality
		Button gummySubmit = new Button("Submit");
		gummySubmit.setOnAction(e->{
			Gummy gummy = new Gummy(
					Integer.parseInt(gummyIDTF.getText()),
					gummyNameTF.getText(),
					Double.parseDouble(gummyPriceTF.getText()),
					Integer.parseInt(gummyQuantityTF.getText()));
					
			gummyTable.createGummy(gummy);
			
		});
		gummyBox.getChildren().addAll(gummyTDisplay, gummyID, gummyIDTF, gummyName, gummyNameTF, gummyPrice, gummyPriceTF, gummyQuantity, gummyQuantityTF, gummySubmit);
		gummyBox.setAlignment(Pos.CENTER);
		gummyBox.setPadding(new Insets(5,5,5,5));
		root.add(gummyBox, 6, 1);
		
		
		chart = new PieChart();
		chart.setTitle("All Candies");
		chart.setLabelsVisible(true);
		generateChart(root);
		
		
		this.setCenter(root);
			
	}
	public void generateChart(GridPane gridPane){
		//Get access to the database
		CandyTable candyTable = new CandyTable();
		ChocolateTable chocolateTable = new ChocolateTable();
		GummyTable gummyTable = new GummyTable();
		InventoryTable invTable = new InventoryTable();
		//Grab a list of coin types
		ArrayList<Candy> candys = candyTable.getAllCandy();
		ArrayList<Chocolate> chocolates = chocolateTable.getAllChocolate();
		ArrayList<Gummy> gummys = gummyTable.getAllGummy();
		//Clear the data in the chart 
		chart.getData().clear();
		//Build a list of PieChart data
		ArrayList<PieChart.Data> data = new ArrayList<>();
		
		for(Candy candy : candys) {
			PieChart.Data data1 = new PieChart.Data(candy.getName(), candy.getId());
			chart.getData().add(data1);
		}
		
		for(Chocolate chocolate : chocolates) {
				PieChart.Data data2 = new PieChart.Data(chocolate.getName(), chocolate.getId());
				chart.getData().add(data2);
			}
	
		for(Gummy gummy : gummys) {
			PieChart.Data data3 = new PieChart.Data(gummy.getName(), gummy.getId());
			chart.getData().add(data3);
		}
		
		//Wrap the list in an ObservableList
				ObservableList<PieChart.Data> chartData = 
						FXCollections.observableArrayList(data);
				
				//Populate the chart
				//chart.setData(chartData);
				gridPane.add(chart, 7, 1);
				
	}
	
		
	}

