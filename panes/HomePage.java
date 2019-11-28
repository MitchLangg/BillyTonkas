package panes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import main.MainRun;
import scenes.AddScene;
import scenes.ConnnectScene;
import scenes.DeleteScene;
import scenes.DisplayScene;
import scenes.HomeScene;
import scenes.UpdateScene;

public class HomePage extends BorderPane{
	public HomePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);

    	if (MainMenuBar.isPopulated() == false){
    		MainMenuBar menuBar = new MainMenuBar();
    	}else {
    		
    	}
    	/**
    	 * @author MitchellTodd
    	 */
    	//Layout of nodes
    	Text title = new Text("Welcome To Billy Tonkas");
    	HBox titleBox = new HBox(title);
    	titleBox.setAlignment(Pos.TOP_CENTER);
    	
    	Image gummy = new Image("Images/gummy.jpg");
    	ImageView gummyView = new ImageView();
    	gummyView.setImage(gummy);
    	gummyView.setFitHeight(550);
    	gummyView.setFitWidth(350);
    	HBox gummyBox = new HBox(gummyView);
    	gummyBox.setAlignment(Pos.CENTER);
    	gummyBox.setPadding(new Insets(50,50,50,50));
    	
    	Image candy = new Image("Images/candy.jpg");
    	ImageView candyView = new ImageView();
    	candyView.setImage(candy);
    	candyView.setFitHeight(550);
    	candyView.setFitWidth(350);
    	HBox candyBox = new HBox(candyView);
    	candyBox.setAlignment(Pos.CENTER);
    	candyBox.setPadding(new Insets(50,50,50,50));
    	
    	Image chocolate = new Image("Images/chocolate.jpg");
    	ImageView chocolateView = new ImageView();
    	chocolateView.setImage(chocolate);
    	chocolateView.setFitHeight(550);
    	chocolateView.setFitWidth(350);
    	HBox chocolateBox = new HBox(chocolateView);
    	chocolateBox.setAlignment(Pos.CENTER);
    	
    	
    	Text coders = new Text("                  Billy Tonkas Software 2019\nCreated by: Mitch, Izacc, and Mitch - Billy Tonkas");
    	HBox codersBox = new HBox(coders);
    	codersBox.setAlignment(Pos.CENTER);
 		//MENU BAR FUNCTIONS ----------------------------------
 		
 		//When the exit button is clicked the program is closed
 		MainMenuBar.getFileMenu1().setOnAction(e->{
 			System.exit(0);
 		});
 		
 		MainMenuBar.getAddPage().setOnAction(e->{
 			MainRun.mainStage.setScene(new AddScene());
 		});
 		MainMenuBar.getDeletePage().setOnAction(e->{
 			MainRun.mainStage.setScene(new DeleteScene());
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
 		
 		
 		//-----------------------------------------------------
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		//TO:DO Temporary Delete Later
 	
 		this.setRight(candyBox);
 		this.setCenter(chocolateBox);
 		this.setLeft(gummyBox);
		this.setBottom(codersBox);
		
	}
}
