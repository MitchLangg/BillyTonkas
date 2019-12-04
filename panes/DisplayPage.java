package panes;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javafx.embed.swing.SwingNode;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
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

/**
	 * @author IzaccLucas
	 * @description A class containing the information that displays the database information
	 * @date Week 13-15
	 */

public class DisplayPage extends BorderPane{
	public DisplayPage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	java.awt.Color tan = new java.awt.Color(210, 180, 140);
    	
    	 //Submit Button Borders/Backgrounds/Font
        Background buttonBackground = new Background(
				new BackgroundFill(Color.MAROON, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border buttonBorder = new Border(
				new BorderStroke(Color.BROWN, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		
		Background buttonBackgroundHover = new Background(
				new BackgroundFill(Color.RED, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border buttonBorderHover = new Border(
				new BorderStroke(Color.CHOCOLATE, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		//button font
		Font buttonFont = Font.font("Ariel", 18);
    	
    	Text candyButton = new Text("Candy Table");
    	candyButton.setFont(buttonFont);
    	candyButton.setFill(Color.WHITE);
		VBox candyButtonBox = new VBox();
		candyButtonBox.getChildren().add(candyButton);
		candyButtonBox.setMaxHeight(80);
		candyButtonBox.setMaxWidth(200);
		candyButtonBox.setAlignment(Pos.CENTER);
		candyButtonBox.setSpacing(25);
		candyButtonBox.setBackground(buttonBackground);
		candyButtonBox.setBorder(buttonBorder);
		
		//Delete Button
        Text gummyButton = new Text("Gummy Table");
        gummyButton.setFont(buttonFont);
        gummyButton.setFill(Color.WHITE);
		VBox gummyButtonBox = new VBox();
		gummyButtonBox.getChildren().add(gummyButton);
		gummyButtonBox.setMaxHeight(80);
		gummyButtonBox.setMaxWidth(200);
		gummyButtonBox.setAlignment(Pos.CENTER);
		gummyButtonBox.setSpacing(25);
		gummyButtonBox.setBackground(buttonBackground);
		gummyButtonBox.setBorder(buttonBorder);
		
		Text chocolateButton = new Text("Chocolate Table");
		chocolateButton.setFont(buttonFont);
		chocolateButton.setFill(Color.WHITE);
		VBox chocolateButtonBox = new VBox();
		chocolateButtonBox.getChildren().add(chocolateButton);
		chocolateButtonBox.setMaxHeight(80);
		chocolateButtonBox.setMaxWidth(200);
		chocolateButtonBox.setAlignment(Pos.CENTER);
		chocolateButtonBox.setSpacing(25);
		chocolateButtonBox.setBackground(buttonBackground);
		chocolateButtonBox.setBorder(buttonBorder);
 		
    	//Contents of the page
    	String[] candyColumnNames = {"id",
                "name",
                "price",
                "quantity"};
    	//Initialization of the candy table
    	CandyTable candyTable = new CandyTable();
    	Object dataCandy[][] = new Object[candyTable.getAllCandy().size()][4];
    	for (int i = 0; i < candyTable.getAllCandy().size(); i++) {
    		 dataCandy[i][0] = candyTable.getAllCandy().get(i).getId();
    		 dataCandy[i][1] = candyTable.getAllCandy().get(i).getName();
    		 dataCandy[i][2] = candyTable.getAllCandy().get(i).getPrice();
    		 dataCandy[i][3] = candyTable.getAllCandy().get(i).getQuantity();
        	};
        JTable candyTableInfo = new JTable(dataCandy ,(Object[]) candyColumnNames);
        candyTableInfo.setBackground(tan);
        candyTableInfo.setFillsViewportHeight(true);
        candyTableInfo.setDefaultEditor(Object.class, null);	
        //Initialization of the gummy table	
    	GummyTable gummyTable = new GummyTable();
    	Object dataGummy[][] = new Object[gummyTable.getAllGummy().size()][4];
    	for (int i = 0; i < gummyTable.getAllGummy().size(); i++) {
    		dataGummy[i][0] = gummyTable.getAllGummy().get(i).getId();
    		dataGummy[i][1] = gummyTable.getAllGummy().get(i).getName();
    		dataGummy[i][2] = gummyTable.getAllGummy().get(i).getPrice();
    		dataGummy[i][3] = gummyTable.getAllGummy().get(i).getQuantity();
        	};
        JTable gummyTableInfo = new JTable(dataGummy ,(Object[]) candyColumnNames);
        gummyTableInfo.setBackground(tan);
        gummyTableInfo.setFillsViewportHeight(true);
        gummyTableInfo.setDefaultEditor(Object.class, null);
        //Initialization of the chocolate table	
    	ChocolateTable chocolateTable = new ChocolateTable();
    	Object dataChocolate[][] = new Object[chocolateTable.getAllChocolate().size()][4];
    	for (int i = 0; i < chocolateTable.getAllChocolate().size(); i++) {
    		dataChocolate[i][0] = chocolateTable.getAllChocolate().get(i).getId();
    		dataChocolate[i][1] = chocolateTable.getAllChocolate().get(i).getName();
    		dataChocolate[i][2] = chocolateTable.getAllChocolate().get(i).getPrice();
    		dataChocolate[i][3] = chocolateTable.getAllChocolate().get(i).getQuantity();
        	};    	
        JTable chocolateTableInfo = new JTable(dataChocolate ,(Object[]) candyColumnNames);
        chocolateTableInfo.setFillsViewportHeight(true);
        chocolateTableInfo.setDefaultEditor(Object.class, null);
    	chocolateTableInfo.setBackground(tan);
    	SwingNode swingNode = new SwingNode();
    	JScrollPane scrollPane = new JScrollPane(candyTableInfo);
    	scrollPane.getViewport().setBackground(tan);
    	swingNode.setContent(scrollPane);
    	
    	
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
 		candyButtonBox.setOnMouseEntered(e -> {
 			candyButtonBox.setBackground(buttonBackgroundHover);
			candyButtonBox.setBorder(buttonBorderHover);
		});
 		candyButtonBox.setOnMouseExited(e -> {
 			candyButtonBox.setBackground(buttonBackground);
 			candyButtonBox.setBorder(buttonBorder);
		});
 		candyButtonBox.setOnMouseClicked(e->{
 			JScrollPane scrollerPane = new JScrollPane(candyTableInfo);
 			scrollerPane.getViewport().setBackground(tan);
 	    	swingNode.setContent(scrollerPane);
 	    	
 		});
 		gummyButtonBox.setOnMouseEntered(e -> {
 			gummyButtonBox.setBackground(buttonBackgroundHover);
 			gummyButtonBox.setBorder(buttonBorderHover);
		});
 		gummyButtonBox.setOnMouseExited(e -> {
 			gummyButtonBox.setBackground(buttonBackground);
 			gummyButtonBox.setBorder(buttonBorder);
		});
		gummyButtonBox.setOnMouseClicked(e->{
			JScrollPane scrollerPane = new JScrollPane(gummyTableInfo);
			scrollerPane.getViewport().setBackground(tan);
	    	swingNode.setContent(scrollerPane);		
		});
		chocolateButtonBox.setOnMouseEntered(e -> {
			chocolateButtonBox.setBackground(buttonBackgroundHover);
 			chocolateButtonBox.setBorder(buttonBorderHover);
		});
		chocolateButtonBox.setOnMouseExited(e -> {
 			chocolateButtonBox.setBackground(buttonBackground);
 			chocolateButtonBox.setBorder(buttonBorder);
		});
		
		chocolateButtonBox.setOnMouseClicked(e->{
			JScrollPane scrollerPane = new JScrollPane(chocolateTableInfo);
			scrollerPane.getViewport().setBackground(tan);
	    	swingNode.setContent(scrollerPane);	
		});
		
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		
 		VBox vbox = new VBox();
 		VBox.setMargin(candyButton, new Insets(5,0,5,0));
 		VBox.setMargin(gummyButton, new Insets(5,0,5,0));
 		VBox.setMargin(chocolateButton, new Insets(5,0,5,0));
 		vbox.getChildren().addAll(candyButtonBox, gummyButtonBox, chocolateButtonBox);
 		vbox.setSpacing(5);
 		this.setRight(vbox);
 		//Layout of content of page
 		this.setCenter(swingNode);
		
		
	}
}
