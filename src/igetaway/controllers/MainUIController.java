package igetaway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MainUIController {

    @FXML
    TextField fxMainSearchField;
    @FXML
    TextArea fxTextArea;
    @FXML
    Button fxFlightButton;
    @FXML
    Hyperlink fxLogoutLink;
    @FXML
    Label fxGreetingLabel;
    @FXML
    ListView<String> fxFlightListView;

    private String[] searchList = new String[]{"Flight No: 002 - Hawaii: 05/18/2018", 
        "Flight No.: 131 - Texas: 06/18/2018", "Flight No.: 453 - Chicago: 07/23/2018",
        "Flight No.: 239 - Boston: 08/19/2018", "Flight No.: 222 - San Diego: 09/15,2018", 
        "Flight No.: 089 - Washington: 10/02/2018", "Flight No.: 623 - Miami: 11/30/2018",
        "Flight No.: 923 - New York: 12/18/2018"};

    private int matchCount;

    @FXML
    private int searchButtonClicked(ActionEvent event) throws IOException {
                
        matchCount = 0;
        String searchString = fxMainSearchField.getText();
        fxTextArea.clear();

        if (searchString.equals("")) {
            fxTextArea.appendText("Missing your search criteria");
            return -1;
        }// End if

        if (searchString.matches(".*haw.*")) {
            fxTextArea.appendText((searchList[0] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*05.*")) {
            fxTextArea.appendText(searchList[0] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*05 18.*")) {
            fxTextArea.appendText(searchList[0] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*may.*")) {
            fxTextArea.appendText(searchList[0] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[0] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*tex.*")) {
            fxTextArea.appendText(searchList[1] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*06.*")) {
            fxTextArea.appendText(searchList[1] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*06 18.*")) {
            fxTextArea.appendText(searchList[1] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*jun.*")) {
            fxTextArea.appendText(searchList[1] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[1] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*chi.*")) {
            fxTextArea.appendText(searchList[2] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*07.*")) {
            fxTextArea.appendText(searchList[2] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*07 23.*")) {
            fxTextArea.appendText(searchList[2] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*jul.*")) {
            fxTextArea.appendText(searchList[2] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[2] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*bos.*")) {
            fxTextArea.appendText(searchList[3] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*08.*")) {
            fxTextArea.appendText(searchList[3] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*09 19.*")) {
            fxTextArea.appendText(searchList[3] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*aug.*")) {
            fxTextArea.appendText(searchList[3] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[3] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*diego.*")) {
            fxTextArea.appendText(searchList[4] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*09.*")) {
            fxTextArea.appendText(searchList[4] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*09 15.*")) {
            fxTextArea.appendText(searchList[4] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*sep.*")) {
            fxTextArea.appendText(searchList[4] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[4] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*wash.*")) {
            fxTextArea.appendText(searchList[5] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*10.*")) {
            fxTextArea.appendText(searchList[5] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*10 02.*")) {
            fxTextArea.appendText(searchList[5] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*oct.*")) {
            fxTextArea.appendText(searchList[5] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[5] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*mia.*")) {
            fxTextArea.appendText(searchList[6] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*11.*")) {
            fxTextArea.appendText(searchList[6] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*11 30.*")) {
            fxTextArea.appendText(searchList[6] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*nov.*")) {
            fxTextArea.appendText(searchList[6] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[6] + "\n");
            matchCount++;
        }// End if

        if (searchString.matches(".*york.*")) {
            fxTextArea.appendText(searchList[7] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*12.*")) {
            fxTextArea.appendText(searchList[7] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*12 18.*")) {
            fxTextArea.appendText(searchList[7] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*dec.*")) {
            fxTextArea.appendText(searchList[7] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*2018.*")) {
            fxTextArea.appendText(searchList[7] + "\n");
            matchCount++;
        }// End if

        if (matchCount == 0) {
            fxTextArea.appendText(matchCount + " matches found");
            return -1;
        }// End if
        else if (matchCount == 1) {
            fxTextArea.appendText("\n" + matchCount + " match found");
            return 0;
        }// End else if
        else {
            fxTextArea.appendText("\n" + matchCount + " matches found");
        }

        return 0;
    }// End method

    @FXML
    private void bookAFlightButtonClicked(ActionEvent event) throws Exception {
        Parent bookingSceneParent = FXMLLoader.load(getClass().getResource("../views/seats.fxml"));
        Scene bookingScene = new Scene(bookingSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(bookingScene);

        window.show();
    }// End method

    @FXML
    private void logoutLinkClicked(ActionEvent event) throws Exception {
        Parent loginSceneParent = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
        Scene loginScene = new Scene(loginSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }// End method

    public void initUserData(String firstName) {

        fxGreetingLabel.setText(firstName);

    }// End method
}// End class

