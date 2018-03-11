package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Text txt = new Text("Sup");
			TextField namefld = new TextField();
			Button btn = new Button();
			btn.setText("Say Sup?");
			btn.setOnAction(evt -> System.out.println("Sup " + namefld.getText()));
			txt.setY(50);
			
			VBox box = new VBox();
			box.getChildren().addAll(txt, namefld, btn);
			root.getChildren().add(box);
			
			primaryStage.setTitle("Sup");
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
