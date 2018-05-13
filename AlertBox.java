package pksoftFX;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
     
public static void displayMe(String title, String message) {
	Stage window = new Stage();
	window.setTitle("Alert Box");
	
	window.initModality(Modality.APPLICATION_MODAL); // for not using other stage while using me
	
	Label label2 = new Label();
	label2.setText("This is alert box - MESSAGE");
	Button closeButton = new Button();
	closeButton.setText("Close Me");
	closeButton.setOnAction(e->{
		window.close();
	});
	VBox layout2 = new VBox(20);
	layout2.setAlignment(Pos.CENTER); //  making them in center
	
	layout2.getChildren().addAll(label2, closeButton);
	Scene scene2 = new Scene(layout2, 500, 300);
	
	window.setScene(scene2);
	window.showAndWait();
	
}
}
