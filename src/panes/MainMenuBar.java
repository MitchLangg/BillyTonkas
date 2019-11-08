package panes;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MainMenuBar{
	//Creates the Menu bar
	private static MenuBar menuBar = new MenuBar();
	
	//MENU BAR PAGES -------------------------------------------
	//Creates the drop down menu "File" in the menu bar
		private static Menu fileMenu = new Menu("File");
		private static Menu toolsMenu = new Menu("Tools");
		private static Menu settingMenu = new Menu("Settings");
	
		
		
		//MENU BAR ITEMS -------------------------------------------
		private MenuItem account = new MenuItem("Account");
		private MenuItem homePage = new MenuItem("Home");
		private MenuItem addPage = new MenuItem("Add Items");
		private MenuItem deletePage = new MenuItem("Delete Items");
		private MenuItem updatePage = new MenuItem("Update Items");
		
		
		//Creates the menu item "Exit"
		private MenuItem fileMenu1 = new MenuItem("Exit");
	
	//----------------------------------------------------------
	

	public MainMenuBar() {
				//Adds the exit menu item to File
				fileMenu.getItems().addAll(fileMenu1);
				toolsMenu.getItems().addAll(homePage, addPage, deletePage, updatePage);
				settingMenu.getItems().addAll(account);	
				//Adds all menubar pages and their children to the menubar
				menuBar.getMenus().addAll(fileMenu, toolsMenu, settingMenu);
				
				//----------------------------------------------------------
	}

	
}
