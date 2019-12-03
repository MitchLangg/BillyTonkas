package panes;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javafx.embed.swing.SwingNode;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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

public class DisplayPage extends BorderPane{
	public DisplayPage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	java.awt.Color tan = new java.awt.Color(210, 180, 140);
    	
 		
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
    	
    	Button candyButton = new Button("Candy Table");
    	Button gummyButton = new Button("Gummy Table");
    	Button chocolateButton = new Button("Chocolate Table");
    	
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
 		candyButton.setOnAction(e->{
 			JScrollPane scrollerPane = new JScrollPane(candyTableInfo);
 	    	swingNode.setContent(scrollerPane);
 		});
		gummyButton.setOnAction(e->{
			JScrollPane scrollerPane = new JScrollPane(gummyTableInfo);
	    	swingNode.setContent(scrollerPane);		
		});
		chocolateButton.setOnAction(e->{
			JScrollPane scrollerPane = new JScrollPane(chocolateTableInfo);
	    	swingNode.setContent(scrollerPane);	
		});
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		
 		VBox vbox = new VBox();
 		VBox.setMargin(candyButton, new Insets(100,0,100,0));
 		VBox.setMargin(gummyButton, new Insets(100,0,100,0));
 		VBox.setMargin(chocolateButton, new Insets(100,0,100,0));
 		vbox.getChildren().addAll(candyButton, gummyButton, chocolateButton);
 		this.setRight(vbox);
 		//Layout of content of page
 		this.setCenter(swingNode);
		
		
	}
}
