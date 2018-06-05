/**
 * RegistrationController.java
 * Author:
 * Last Revision: 5/23/2018
 * This logic supports account registration functionality
 */

package igetaway.controllers;


import igetaway.models.User;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class RegistrationController {
    private static User[] registeredUserNames = new User[500];
    // Variables
    @FXML
    private TextField fxFirstNameField, fxLastNameField, fxInitialField, fxEmailField, fxPhoneField, fxUserNameField,
            fxPasswordField, fxConfirmPasswordField;
    @FXML
    private Label fxFirstNameLabel, fxLastNameLabel, fxUserNameLabel, fxPassWordLabel, fxPassConfirmLabel;
    @FXML
    private Button fxBackToLoginButton;

    private User user;
    private int validationCounter;
    private boolean isEmpty = true;


    @FXML
    /* This method creates a new 'User' instance and gets the regsitration data from the text fields.  Once the data is
    set, the user will be validated */
    private void submitClicked(ActionEvent event) throws Exception {
        user = new User();
        String firstName = fxFirstNameField.getText();
        user.setFirstName(firstName);

        String lastName = fxLastNameField.getText();
        user.setLastName(lastName);

        String initial = fxInitialField.getText();
        user.setMiddleInit(initial);

        String email = fxEmailField.getText();
        user.setEmail(email);

        String phone = fxPhoneField.getText();
        user.setPhone(phone);

        String userName = fxUserNameField.getText();
        user.setUserName(userName);

        String password = fxPasswordField.getText();
        user.setPassWord(password);

        String passConfirm = fxConfirmPasswordField.getText();
        user.setConfirmedPassWord(passConfirm);


        int rtn = validate(user);

        if (rtn == 0) {
            Parent confirmationSceneParent = FXMLLoader.load(getClass().getResource("../views/confirmation.fxml"));
            Scene confirmationScene = new Scene(confirmationSceneParent);

            //Stage Information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(confirmationScene);
            window.show();
        }// End if
    }// End method

    @FXML
    // This method clears all text fields when the 'Clear' button is presses.
    private void clearClicked(ActionEvent event) {
        fxFirstNameField.setText("");
        fxLastNameField.setText("");
        fxInitialField.setText("");
        fxEmailField.setText("");
        fxPhoneField.setText("");
        fxUserNameField.setText("");
        fxPasswordField.setText("");
        fxConfirmPasswordField.setText("");
    }// End method

    @FXML
    // This methods navigates back to the login screem
    private void backToLoginButtonClicked(ActionEvent event) throws Exception {
        Parent loginSceneParent = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
        Scene loginScene = new Scene(loginSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }// End method

    /* This method validates that the required fields have been filled.  There is a validation counter to "check-off"
        user data that is accepted.  If the counter totals '5', the user will be logged.
     */
    private int validate(User user) {
        validationCounter = 0;
        String prospectiveUserName = user.getUserName();
        System.out.println("prospective: " + prospectiveUserName);

        // validate first name
        if (user.getFirstName().equals("")) {
            fxFirstNameLabel.setText("Missing first name");


        }// End if
        else if (!user.getUserName().equals("")) {
            fxFirstNameLabel.setText("");
            validationCounter++; // Count is 1
        }


        // Validate last name
        if (user.getLastName().equals("")) {
            fxLastNameLabel.setText("Missing last name");


        }// End if
        else if (!user.getLastName().equals("")) {
            fxLastNameLabel.setText("");
            validationCounter++; // Count is 2
        }


        // Check if username is taken
        String tempUserName;

        if (user.getUserName().equals("")) {
            fxUserNameLabel.setText("Missing user name");
        }// End if


        for (int i = 0; i < registeredUserNames.length; i++) {

            if(isEmpty && !user.getUserName().equals("")) {
                fxUserNameLabel.setText("");
                validationCounter++; // Count is 3
                break;
            }// End if
            else if (!isEmpty) {
                tempUserName = registeredUserNames[i].getUserName();
                if (tempUserName != null && prospectiveUserName == tempUserName) {
                    fxUserNameLabel.setText("User name unavailable");
                    break;
                }// End if
            }// End else if
        }// End for

        // Validate password
        if (user.getPassWord().equals("")) {
            fxPassWordLabel.setText("Missing password");


        }// End if
        else if (!user.getPassWord().equals("")) {
            fxPassWordLabel.setText("");
            validationCounter++; // Count is 4
        }


        // Validate passwords match
        if (user.getConfirmedPassWord().equals("")) {
            fxPassConfirmLabel.setText("Missing confirmation");

        }// End if
        else if (!user.getConfirmedPassWord().equals(user.getPassWord())) {
            fxPassConfirmLabel.setText("Passwords must match");

        }// End else if
        else if (!fxConfirmPasswordField.equals("")) {
            fxPassConfirmLabel.setText("");
            validationCounter++; // Count is 5
        }

        System.out.println(validationCounter);

        int rtn = 0;
        if (validationCounter == 5) {
            rtn = logUserToArray(user);

            int value = rtn;
            return value;
        }// End if
        else
            return -1;

    }// End method

    // This method writes the registered user to a user file for data management
    private int logUserToArray(User user) {
        int i = 0;
        while (registeredUserNames[i] != null) {

            i++;

        }// End while

            // Create new user instance for array
            registeredUserNames[i] = new User();
            registeredUserNames[i].setUserName(user.getUserName());
            String tempName;
            for (int j = 0; j < 3; j++) {

                System.out.println(registeredUserNames[j]);
            }

            registeredUserNames[i].setPassWord(user.getPassWord());
            registeredUserNames[i].setLastName(user.getLastName());
            registeredUserNames[i].setFirstName(user.getFirstName());
            registeredUserNames[i].setMiddleInit(user.getMiddleInit());
            registeredUserNames[i].setEmail(user.getEmail());
            registeredUserNames[i].setPhone(user.getPhone());
            isEmpty = false;

        return 0;
    }// End method

}// End class
