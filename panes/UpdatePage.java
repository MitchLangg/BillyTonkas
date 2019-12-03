package panes;

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
import scenes.DeleteScene;
import scenes.DisplayScene;
import scenes.HomeScene;


public class UpdatePage extends BorderPane{
	public UpdatePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
    	//Contents of page
    	Text testText = new Text("This is the UpdatePage");
 		
    	
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
 		MainMenuBar.getDeletePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new DeleteScene());
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
 		
 		//Layout of items on page
 		this.setCenter(testText);
	
	}
}
