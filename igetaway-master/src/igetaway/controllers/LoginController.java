/**
 * LoginController.java
 * Author: Mike Davis
 * Last Revision: 6/04/2018
 * This logic supports user login functionality
 */
package igetaway.controllers;

import igetaway.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import java.io.File;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField fxUserNameTextField;
    @FXML
    private PasswordField fxPasswordTextField;
    @FXML
    private Label fxLoginMsgLabel;

    private User tempUser;

    @FXML
    public int loginClicked(ActionEvent event) throws Exception {
        String tempUsername = "";
        String tempPassword = "";
        String savedPassword = "";

        tempUsername = fxUserNameTextField.getText();
        tempPassword = fxPasswordTextField.getText();

        tempUser = new User();

        File tempFile = new File("src/igetaway/models/" + tempUsername + ".txt");
        
        // Test for missing credentials
        if (tempUsername.equals("") && tempPassword.equals("")) {
            fxLoginMsgLabel.setText("Missing username and password");
            return -1;
        }// End if
        if (tempUsername.equals("")) {
            fxLoginMsgLabel.setText("Missing username");
            return -1;
        }// End if
        else if (tempPassword.equals("")) {
            fxLoginMsgLabel.setText("Missing password");
            return -1;
        }// End else if

        // Check to see if username exits
        if (tempFile.exists()) {

            tempUser = User.deserialize(tempUsername);
            savedPassword = tempUser.getPassWord();
            String name = tempUser.getFirstName();
            
            // Check to see if password matches
            if (savedPassword.equals(tempPassword)) {

                // FXML Loader that accesses the mainUI.fxml file
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../views/mainUI.fxml"));
                Parent mainUISceneParent = loader.load();
                Scene mainUIScene = new Scene(mainUISceneParent);

                // Access MainUIController and call initUserData method
                MainUIController m_Controller = loader.getController();
                m_Controller.initUserData(name);

                // Stage Information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(mainUIScene);
                window.centerOnScreen();
                window.show();
                return 0;
            }// End inner if            

        }// End outer if
        // Check for incorrect username and/or password
        else if (!tempFile.exists() || savedPassword.equals(tempPassword)) {
            fxLoginMsgLabel.setText("Username and/or password is incorrect");

            return -1;
        }// End if else

        return 0;
    }// End method

    @FXML
    public void registerLinkClicked(ActionEvent event) throws IOException {
        Parent registrationSceneParent = FXMLLoader.load(getClass().getResource("../views/registration.fxml"));
        Scene registrationScene = new Scene(registrationSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(registrationScene);
        window.centerOnScreen();
        window.show();
    }// End method
}// End class
