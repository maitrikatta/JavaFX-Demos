package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root =  new Group();
		Scene scene  =  new Scene(root, Color.AZURE);
		stage.setScene(scene);
		Image icon = new Image("food.png");
		stage.getIcons().add(icon);
		stage.setWidth(550);
		stage.setHeight(550);
		stage.setResizable(false);
		stage.setTitle("Hello World");
		stage.show();
		
	}
}
