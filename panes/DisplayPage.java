package panes;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javafx.embed.swing.SwingNode;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import main.MainRun;
import scenes.AddScene;
import scenes.ConnnectScene;
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;
import tables.CandyTable;

public class DisplayPage extends BorderPane{
	public DisplayPage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
 		
    	//Contents of the page
    	String[] candyColumnNames = {"id",
                "name",
                "price",
                "quantity"};
    	//Initialization of the candy table
    	CandyTable candyTable = new CandyTable();
    	Object data[][] = new Object[candyTable.getAllCandy().size()][4];
    	for (int i = 0; i < candyTable.getAllCandy().size(); i++) {
    		 data[i][0] = candyTable.getAllCandy().get(i).getId();
    		 data[i][1] = candyTable.getAllCandy().get(i).getName();
    		 data[i][2] = candyTable.getAllCandy().get(i).getPrice();
    		 data[i][3] = candyTable.getAllCandy().get(i).getQuantity();
        	};
    	BorderLayout border = new BorderLayout();
    	
    	SwingNode swingNode = new SwingNode();
    	JTable table = new JTable(data ,(Object[]) candyColumnNames);
    	JScrollPane scrollPane = new JScrollPane(table);
    	scrollPane.setBackground(java.awt.Color.getHSBColor(34, 33, 82));
    	scrollPane.setForeground(java.awt.Color.getHSBColor(34, 33, 82));
    	scrollPane.setEnabled(false);
    	table.setFillsViewportHeight(true);
    	table.setDefaultEditor(Object.class, null);
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
 		
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		
 		//Layout of content of page
 		this.setCenter(swingNode);
		
		
	}
}
