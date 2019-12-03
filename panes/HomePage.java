package panes;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import main.MainRun;
import scenes.AddScene;
import scenes.ConnnectScene;
import scenes.DeleteScene;
import scenes.DisplayScene;
import scenes.UpdateScene;

public class HomePage extends BorderPane{
	/**
		 * @author MitchellTodd
		 * @description creating home page pane. This is our main screen
		 * @date Week 13-15
		 */
	public HomePage() {
    	Background rootBackground = new Background(
				new BackgroundFill(Color.TAN, new CornerRadii(0), new Insets(0, 0, 0, 0)));
    	this.setBackground(rootBackground);

    	if (MainMenuBar.isPopulated() == false){
    		//Ignore menu bar "not being used error" if absent wont work
    		MainMenuBar menuBar = new MainMenuBar();
    	}else {
    		//dont do anything
    	}
    
    	//Layout of nodes
    	Text title = new Text("Welcome To Billy Tonkas");
    	HBox titleBox = new HBox(title);
    	titleBox.setAlignment(Pos.TOP_CENTER);
    	
    	Image gummy = new Image("Images/gummy2.jpg");
    	ImageView gummyView = new ImageView();
    	gummyView.setImage(gummy);
    	gummyView.setFitHeight(500);
    	gummyView.setFitWidth(400);
    	HBox gummyBox = new HBox(gummyView);
    	gummyBox.setAlignment(Pos.CENTER);
    	
    	Image candy = new Image("Images/candy.jpg");
    	ImageView candyView = new ImageView();
    	candyView.setImage(candy);
    	candyView.setFitHeight(500);
    	candyView.setFitWidth(400);
    	HBox candyBox = new HBox(candyView);
    	candyBox.setAlignment(Pos.CENTER);
    
    	/**
    	 * @author Mitchell Lang
    	 * @description Creating all the buttons and adding functionality
    	 */
    	
    	 //Submit Button Borders/Backgrounds/Font
        Background buttonBackground = new Background(
				new BackgroundFill(Color.MAROON, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border buttonBorder = new Border(
				new BorderStroke(Color.BROWN, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		
		Background buttonBackgroundHover = new Background(
				new BackgroundFill(Color.RED, new CornerRadii(10), new Insets(0, 0, 0, 0)));
		
		Border buttonBorderHover = new Border(
				new BorderStroke(Color.CHOCOLATE, BorderStrokeStyle.SOLID, new CornerRadii(10), new BorderWidths(2)));
		//button font
		 Font buttonFont = Font.font("Ariel", 20);
		//logo at top of screen
		Image image = new Image("Images/newlogo.png");
	    ImageView logo = new ImageView();
	    logo.setImage(image);
		 
        //Add Button
        Text addButton = new Text("Add Item");
		addButton.setFont(buttonFont);
		addButton.setFill(Color.WHITE);
		VBox addButtonBox = new VBox();
		addButtonBox.getChildren().add(addButton);
		addButtonBox.setMaxHeight(80);
		addButtonBox.setMaxWidth(200);
		addButtonBox.setAlignment(Pos.CENTER);
		addButtonBox.setSpacing(25);
		addButtonBox.setBackground(buttonBackground);
		addButtonBox.setBorder(buttonBorder);
		addButton.setFont(buttonFont);
		FadeTransition addFade = new FadeTransition(Duration.millis(100), addButton);
		addFade.setFromValue(1);
		addFade.setToValue(0);
		addFade.setAutoReverse(true);
		addFade.setCycleCount(2);
		SequentialTransition addFadeAnim = new SequentialTransition(addFade);
		
		//Delete Button
        Text deleteButton = new Text("Delete Item");
		deleteButton.setFont(buttonFont);
		deleteButton.setFill(Color.WHITE);
		VBox deleteButtonBox = new VBox();
		deleteButtonBox.getChildren().add(deleteButton);
		deleteButtonBox.setMaxHeight(80);
		deleteButtonBox.setMaxWidth(200);
		deleteButtonBox.setAlignment(Pos.CENTER);
		deleteButtonBox.setSpacing(25);
		deleteButtonBox.setBackground(buttonBackground);
		deleteButtonBox.setBorder(buttonBorder);
		deleteButton.setFont(buttonFont); 
		FadeTransition deleteFade = new FadeTransition(Duration.millis(100), deleteButton);
		deleteFade.setFromValue(1);
		deleteFade.setToValue(0);
		deleteFade.setAutoReverse(true);
		deleteFade.setCycleCount(2);
		SequentialTransition deleteFadeAnim = new SequentialTransition(deleteFade);
		
		//Update Button
        Text updateButton = new Text("Update Item");
        updateButton.setFont(buttonFont);
        updateButton.setFill(Color.WHITE);
		VBox updateButtonBox = new VBox();
		updateButtonBox.getChildren().add(updateButton);
		updateButtonBox.setMaxHeight(80);
		updateButtonBox.setMaxWidth(200);
		updateButtonBox.setAlignment(Pos.CENTER);
		updateButtonBox.setSpacing(25);
		updateButtonBox.setBackground(buttonBackground);
		updateButtonBox.setBorder(buttonBorder);
		updateButton.setFont(buttonFont);
		FadeTransition updateFade = new FadeTransition(Duration.millis(100), updateButton);
		updateFade.setFromValue(1);
		updateFade.setToValue(0);
		updateFade.setAutoReverse(true);
		updateFade.setCycleCount(2);
		SequentialTransition updateFadeAnim = new SequentialTransition(updateFade);
		
		//Display Button
        Text displayButton = new Text("Display Items");
        displayButton.setFont(buttonFont);
        displayButton.setFill(Color.WHITE);
		VBox displayButtonBox = new VBox();
		displayButtonBox.getChildren().add(displayButton);
		displayButtonBox.setMaxHeight(80);
		displayButtonBox.setMaxWidth(200);
		displayButtonBox.setAlignment(Pos.CENTER);
		displayButtonBox.setSpacing(25);
		displayButtonBox.setBackground(buttonBackground);
		displayButtonBox.setBorder(buttonBorder);
		displayButton.setFont(buttonFont);
		FadeTransition displayFade = new FadeTransition(Duration.millis(100), displayButton);
		displayFade.setFromValue(1);
		displayFade.setToValue(0);
		displayFade.setAutoReverse(true);
		displayFade.setCycleCount(2);
		SequentialTransition displayFadeAnim = new SequentialTransition(displayFade);
	
		//Exit Button
        Text exitButton = new Text("Exit");
        exitButton.setFont(buttonFont);
        exitButton.setFill(Color.WHITE);
		VBox exitButtonBox = new VBox();
		exitButtonBox.getChildren().add(exitButton);
		exitButtonBox.setMaxHeight(80);
		exitButtonBox.setMaxWidth(200);
		exitButtonBox.setAlignment(Pos.CENTER);
		exitButtonBox.setSpacing(25);
		exitButtonBox.setBackground(buttonBackground);
		exitButtonBox.setBorder(buttonBorder);
    	exitButton.setFont(buttonFont);
		FadeTransition exitFade = new FadeTransition(Duration.millis(100), exitButton);
		exitFade.setFromValue(1);
		exitFade.setToValue(0);
		exitFade.setAutoReverse(true);
		exitFade.setCycleCount(2);
		SequentialTransition exitFadeAnim = new SequentialTransition(exitFade);
	
		//Button VBox to hold all buttons and logo in alignment
		VBox buttonBox = new VBox();
		buttonBox.getChildren().addAll(logo, addButtonBox, deleteButtonBox, updateButtonBox, displayButtonBox, exitButtonBox);
		buttonBox.setPadding(new Insets(10, 10, 10, 10));
		buttonBox.setSpacing(40);
		buttonBox.setAlignment(Pos.CENTER);
    	
		/**
 		 * @author MitchellTodd
 		 * @description adding functionality for exit
 		 * @date Week 12-13
 		 */
		
		exitButtonBox.setOnMouseEntered(e -> {
			exitButtonBox.setBackground(buttonBackgroundHover);
			exitButtonBox.setBorder(buttonBorderHover);
			exitFade.setToValue(0);
			exitFadeAnim.playFromStart();
		});
		exitButtonBox.setOnMouseExited(e -> {
			exitButtonBox.setBackground(buttonBackground);
			exitButtonBox.setBorder(buttonBorder);
			exitFade.setToValue(1);
			exitFadeAnim.stop();
		
		});

		exitButtonBox.setOnMouseClicked(e -> {
		System.exit(0);
		});
    
    	//Add item button functionality
		addButtonBox.setOnMouseEntered(e -> {
			addButtonBox.setBackground(buttonBackgroundHover);
			addButtonBox.setBorder(buttonBorderHover);
			addFade.setToValue(0);
			addFadeAnim.playFromStart();
		});
		addButtonBox.setOnMouseExited(e -> {
			addButtonBox.setBackground(buttonBackground);
			addButtonBox.setBorder(buttonBorder);
			addFade.setToValue(1);
			addFadeAnim.stop();
		});

		addButtonBox.setOnMouseClicked(e -> {
			MainRun.mainStage.setScene(new AddScene());
		});
    	
    	//Delete item button functionality
		deleteButtonBox.setOnMouseEntered(e -> {
			deleteButtonBox.setBackground(buttonBackgroundHover);
			deleteButtonBox.setBorder(buttonBorderHover);
			deleteFade.setToValue(0);
			deleteFadeAnim.playFromStart();
		});
		deleteButtonBox.setOnMouseExited(e -> {
			deleteButtonBox.setBackground(buttonBackground);
			deleteButtonBox.setBorder(buttonBorder);
			deleteFade.setToValue(1);
			deleteFadeAnim.stop();
		});

		deleteButtonBox.setOnMouseClicked(e -> {
			MainRun.mainStage.setScene(new DeleteScene());
		});
		
		//Update item button functionality
		updateButtonBox.setOnMouseEntered(e -> {
			updateButtonBox.setBackground(buttonBackgroundHover);
			updateButtonBox.setBorder(buttonBorderHover);
			updateFade.setToValue(0);
			updateFadeAnim.playFromStart();
		});
		updateButtonBox.setOnMouseExited(e -> {
			updateButtonBox.setBackground(buttonBackground);
			updateButtonBox.setBorder(buttonBorder);
			updateFade.setToValue(1);
			updateFadeAnim.stop();
		});

		updateButtonBox.setOnMouseClicked(e -> {
			MainRun.mainStage.setScene(new UpdateScene());
		});
    	
		//Display item button functionality
		displayButtonBox.setOnMouseEntered(e -> {
			displayButtonBox.setBackground(buttonBackgroundHover);
			displayButtonBox.setBorder(buttonBorderHover);
			displayFade.setToValue(0);
			displayFadeAnim.playFromStart();
		});
		displayButtonBox.setOnMouseExited(e -> {
			displayButtonBox.setBackground(buttonBackground);
			displayButtonBox.setBorder(buttonBorder);
			displayFade.setToValue(1);
			displayFadeAnim.stop();
		});

		displayButtonBox.setOnMouseClicked(e -> {
			MainRun.mainStage.setScene(new DisplayScene());
		});
    	
    	//Bottom Text
    	Text coders = new Text("                  Billy Tonkas Software 2019\nCreated by: Mitch, Izacc, and Mitch - Billy Tonkas");
    	HBox codersBox = new HBox(coders);
    	codersBox.setAlignment(Pos.CENTER);
    
 		/*-----------------MENU BAR FUNCTIONS----------------------*/
    	
    	/**
    	 * @author MitchTodd/MitchLang
    	 * @description menu buttons for nav
    	 * @date Week 11-13
    	 */
    	
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
 		
 		//Sets the menu bar  to top (displays it to screen)
 		this.setTop(MainMenuBar.getMenuBar());
 		
 		//Layout contents of the page
 		this.setRight(candyBox);
 		this.setCenter(buttonBox);
 		this.setLeft(gummyBox);
		this.setBottom(codersBox);
		
	}
}
