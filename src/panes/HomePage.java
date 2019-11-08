package panes;

import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import main.MainRun;
import scenes.HomeScene;

public class HomePage extends BorderPane{
	public HomePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
		
		
		
		//MENU BAR FUNCTIONS ----------------------------------
		
		//When the exit button is clicked the program is closed
		MainMenuBar.fileMenu1.setOnAction(e->{
			System.exit(0);
		});
		
		addPage.setOnAction(e->{
			
		});
		deletePage.setOnAction(e->{
			
		});
		updatePage.setOnAction(e->{
			
		});
		
		
		//-----------------------------------------------------
		//Sets the menu bar  to top (displays it to screen)
		this.setTop(MainMenuBar.getMenuBar());
	}
}
