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
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;

public class DeletePage extends BorderPane {
	public DeletePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);
    	
 		
    	//////Contents of the page//////
    	Text testText = new Text("This is the DeletePage");
    	
    	
    	
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
 		
 		//////Layout of page content//////
 		this.setCenter(testText);
		
		
	}
}
