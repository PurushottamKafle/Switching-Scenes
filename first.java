package pksoftFX;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class first extends Application { // inherits from Application
	
	Button btn;
	Label label;
	public static void main(String[]args) {
		launch(args);
		
	}
	public void start(Stage primaryStage) {
		primaryStage.setTitle("First Window or Scene");
		label = new Label();
		label.setText("This is first stage if you want to go in AlertBox stage then click below button");
		btn = new Button();
		btn.setText("Click here");
		/**
		 * Here code for go in AlertBox
		 * 
		 */
		btn.setOnAction(e->{
			AlertBox.displayMe("Alert Box Title", "Congratulations your code Successfully RUNED! ");
		});
		
		VBox layout = new VBox();
		layout.getChildren().addAll(btn, label);
		Scene scene = new Scene(layout, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
	
	
	
	
}
