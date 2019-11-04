package main;
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.ConnnectScene;

public class MainRun extends Application {
	public static Stage mainStage;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		primaryStage.setScene(new ConnnectScene());
		primaryStage.setTitle("BillyTonkas Database");
		primaryStage.show();
		
	}

}
