/**
 * RegistrationController.java
 * Author:
 * Last Revision: 5/23/2018
 * This logic supports the registration confirmation UI message
 */

package igetaway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrationConfirmationController {

    @FXML
    private void OKButtonClicked(ActionEvent event) throws Exception {
        Parent confirmationSceneParent = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
        Scene confirmationScene = new Scene(confirmationSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(confirmationScene);
        window.show();
    }// End method
}// End class
