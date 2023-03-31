package org.fsb.projetfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
    primaryStage.setTitle("Test");
    BorderPane root=new BorderPane();
    Button btnHello=new Button("Hello world");
   
    root.setCenter(btnHello);
    Scene scene=new Scene(root,250,100);
    primaryStage.setScene(scene);
    primaryStage.show()
;    
    
	
	  scene = new Scene(loadFXML("primary"), 640, 480); 
	}
	  
	  static void setRoot(String fxml) throws IOException {
	  scene.setRoot(loadFXML(fxml)); }
	  
	  private static Parent loadFXML(String fxml) throws IOException { FXMLLoader
	  fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml")); return
	  fxmlLoader.load(); }
	 

    public static void main(String[] args) {
        launch();
    }

}