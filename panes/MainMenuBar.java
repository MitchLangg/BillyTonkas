package panes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
	public void AccountSwapper(int i) {
		if (settingMenu.getItems().size() > i) {
		settingMenu.getItems().get(i).setOnAction(e->{
			try {
				PrintWriter printer = new PrintWriter(new FileOutputStream(ConnectPage.currentAccount, false));
				printer.print("userAccount" + i +".txt");
				printer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
}

	public MainMenuBar() {
				//Adds the exit menu item to File
				fileMenu.getItems().addAll(fileMenu1);
				toolsMenu.getItems().addAll(homePage, addPage, deletePage, updatePage);
				settingMenu.getItems().addAll(account);	
				//Adds all menubar pages and their children to the menubar
				menuBar.getMenus().addAll(fileMenu, toolsMenu, settingMenu);
				populated = true;
				
				for(int i = 1; menuBarLoader; i++) {
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
				
				//This is dumb, find a way to replace this
				AccountSwapper(1);
				AccountSwapper(2);
				AccountSwapper(3);
				AccountSwapper(4);
				AccountSwapper(5);
				AccountSwapper(6);
				AccountSwapper(7);
				AccountSwapper(8);
				AccountSwapper(9);
				AccountSwapper(10);
				AccountSwapper(11);
				AccountSwapper(12);
				
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
