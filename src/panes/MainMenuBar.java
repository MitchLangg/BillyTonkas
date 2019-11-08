package panes;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MainMenuBar{
	
		private static boolean populated = false;
		//Creates the Menu bar
		private static MenuBar menuBar = new MenuBar();
	
		//MENU BAR PAGES -------------------------------------------
		//Creates the drop down menu "File" in the menu bar
		private static Menu fileMenu = new Menu("File");
		private static Menu toolsMenu = new Menu("Tools");
		private static Menu settingMenu = new Menu("Settings");
	
		
		//-----------------------------------------------------------
		
		
		//MENU BAR ITEMS -------------------------------------------
		private static MenuItem account = new MenuItem("Account");
		private static MenuItem homePage = new MenuItem("Home");
		private static MenuItem addPage = new MenuItem("Add Items");
		private static MenuItem deletePage = new MenuItem("Delete Items");
		private static  MenuItem updatePage = new MenuItem("Update Items");
		
		
		//Creates the menu item "Exit"
		private static MenuItem fileMenu1 = new MenuItem("Exit");
	
		//----------------------------------------------------------
	

	public MainMenuBar() {
				//Adds the exit menu item to File
				fileMenu.getItems().addAll(fileMenu1);
				toolsMenu.getItems().addAll(homePage, addPage, deletePage, updatePage);
				settingMenu.getItems().addAll(account);	
				//Adds all menubar pages and their children to the menubar
				menuBar.getMenus().addAll(fileMenu, toolsMenu, settingMenu);
	}

	public static MenuItem getAccount() {
		return account;
	}

	public static  MenuItem getHomePage() {
		return homePage;
	}

	public static MenuItem getAddPage() {
		return addPage;
	}

	public static MenuItem getDeletePage() {
		return deletePage;
	}

	public static MenuItem getUpdatePage() {
		return updatePage;
	}

	public static MenuItem getFileMenu1() {
		return fileMenu1;
	}

	public static MenuBar getMenuBar() {
		return menuBar;
	}

	public static boolean isPopulated() {
		return populated;
	}

	public static void setPopulated(boolean populated) {
		MainMenuBar.populated = populated;
	}
	
}
