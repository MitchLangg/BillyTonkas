package panes;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import main.MainRun;
import scenes.HomeScene;

public class HomePage extends BorderPane{
	public HomePage() {
		//Creates the Menu bar
		MenuBar menuBar = new MenuBar();
		
		
		//MENU BAR PAGES -------------------------------------------
		
		//Creates the drop down menu "File" in the menu bar
		Menu fileMenu = new Menu("File");
		Menu toolsMenu = new Menu("Tools");
		
		
		//----------------------------------------------------------
		
		//MENU BAR ITEMS -------------------------------------------
		
		MenuItem homePage = new MenuItem("Home");
		MenuItem addPage = new MenuItem("Add Items");
		MenuItem deletePage = new MenuItem("Delete Items");
		MenuItem updatePage = new MenuItem("Update Items");
		
		
		//Creates the menu item "Exit"
		MenuItem fileMenu1 = new MenuItem("Exit");
		
		
		//Adds the exit menu item to File
		fileMenu.getItems().addAll(fileMenu1);
		toolsMenu.getItems().addAll(homePage, addPage, deletePage, updatePage);
		
		//Adds all menubar pages and their children to the menubar
		menuBar.getMenus().addAll(fileMenu, toolsMenu);
		
		//----------------------------------------------------------
		
		
		//MENU BAR FUNCTIONS ----------------------------------
		
		//When the exit button is clicked the program is closed
		fileMenu1.setOnAction(e->{
			System.exit(0);
		});
		homePage.setOnAction(e->{
			//This works, figure out how to get it to work with external scenes
			if (MainRun.mainStage.getScene() != this.getScene()) {
				MainRun.mainStage.setScene(new HomeScene());
			}else {
				
			}
		});
		addPage.setOnAction(e->{
			
		});
		deletePage.setOnAction(e->{
			
		});
		updatePage.setOnAction(e->{
			
		});
		
		
		//-----------------------------------------------------
		//Sets the menu bar  to top (displays it to screen)
		this.setTop(menuBar);
	}
}
