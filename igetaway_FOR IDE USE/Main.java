/**
 * Main.java
 * Author:
 * Last Revision: 5/23/2018
 * This logic serves as the entry point for the application
 */

package igetaway;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/igetaway/views/login.fxml"));
        primaryStage.setTitle("iGetaway");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 366, 401));
        primaryStage.show();

    }// End method


    public static void main(String[] args) {
        launch(args);
    }// End method
}// End class