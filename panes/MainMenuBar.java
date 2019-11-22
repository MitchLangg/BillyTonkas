package panes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import database.Credentials;
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
		private static MenuItem account = new MenuItem("New account");
		private static MenuItem homePage = new MenuItem("Home");
		private static MenuItem addPage = new MenuItem("Add Items");
		private static MenuItem deletePage = new MenuItem("Delete Items");
		private static  MenuItem updatePage = new MenuItem("Update Items");
		
		public boolean menuBarLoader = true;
		
		
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
				populated = true;
				
				for(int i = 0; menuBarLoader; i++) {
					if (Files.exists(Paths.get("userAccount"+ i +".txt"))){
						Scanner scanner;
						try {
							scanner = new Scanner(Paths.get("userAccount"+ i +".txt"));
							scanner.next();
							MenuItem account = new MenuItem("Account " + scanner.next());
							MainMenuBar.getSettingMenu().getItems().add(account);
							scanner.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}else {
						menuBarLoader = false;
					}
				}
				//DO NO DELETE THIS, REFERENCE CODE FOR ME settingMenu.getItems().get(1).setOnAction(e->{});
	}
	
	
	public static Menu getSettingMenu() {
		return settingMenu;
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
