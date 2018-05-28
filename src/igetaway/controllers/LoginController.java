/**
 * LoginController.java
 * Author:
 * Last Revision: 5/23/2018
 * This logic supports user login functionality
 */

package igetaway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public void loginClicked(ActionEvent event) throws Exception{

        Parent mainUISceneParent = FXMLLoader.load(getClass().getResource("../views/mainUI.fxml"));
        Scene mainUIScene = new Scene(mainUISceneParent);

        //Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainUIScene);
        window.show();
    }// End method

    @FXML
    public void registerLinkClicked(ActionEvent event) throws IOException {
        Parent registrationSceneParent = FXMLLoader.load(getClass().getResource("../views/registration.fxml"));
        Scene registrationScene = new Scene(registrationSceneParent);

        //Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(registrationScene);
        window.show();
    }// End method
}// End class
