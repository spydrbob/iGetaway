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

    private String[] searchList = new String[]{"HW001 - Hawaii: 06/18/2018", "HW002 - Hawaii: 06/19/2018",
            "HW003 - Hawaii: 06/20/2018", "HW004 - Hawaii: 06/21/2018", "TX001 - Texas: 06/18/2018", "TX002 - Texas: 06/19/2018",
            "TX003 - Texas: 06/20/2018", "TX004 - Texas: 06/21/2018", "CH001 - Chicago: 06/18/2018:", "CH002 - Chicago: 06/19/2018",
            "CH003 - Chicago: 06/20/2018", "CH004 - Chicago: 06/21/2018", "BO001 - Boston: 06/18/2018", "BO002 - Boston: 06/19/2018",
            "BO003 - Boston: 06/20/2018", "BO004 - Boston: 06/21/2018", "SD001 - San Diego: 06/18/2018", "SD002 - San Diego: 06/19/2018",
            "SD003 - San Diego: 06/20/2018", "SD004 - San Diego: 06/21/2018", "WA001 - Washington: 06/18/2018", "WA002 - Washington: 06/19/2018",
            "WA003 - Washington: 06/20/2018", "WA004 - Washington: 06/21/2018", "MI001 - Miami: 06/18/2018:", "MI002 - Miami: 06/19/2018",
            "MI003 - Miami: 06/20/2018", "MI004 - Miami: 06/21/2018", "NY001 - New York: 06/18/2018", "NY002 - New York: 06/19/2018",
            "NY003 - New York: 06/20/2018", "NY004 - New York: 06/21/2018"};

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

        if (searchString.matches(".*awaii.*")) {
            fxTextArea.appendText((searchList[0] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*awaii.*")) {
            fxTextArea.appendText((searchList[1] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*awaii.*")) {
            fxTextArea.appendText((searchList[2] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*awaii.*")) {
            fxTextArea.appendText((searchList[3] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*exas.*")) {
            fxTextArea.appendText((searchList[4] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*exas.*")) {
            fxTextArea.appendText((searchList[5] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*exas.*")) {
            fxTextArea.appendText((searchList[6] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*exas.*")) {
            fxTextArea.appendText((searchList[7] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*hicago.*")) {
            fxTextArea.appendText((searchList[8] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*hicago.*")) {
            fxTextArea.appendText((searchList[9] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*hicago.*")) {
            fxTextArea.appendText((searchList[10] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*hicago.*")) {
            fxTextArea.appendText((searchList[11] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*oston.*")) {
            fxTextArea.appendText((searchList[12] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*oston.*")) {
            fxTextArea.appendText((searchList[13] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*oston.*")) {
            fxTextArea.appendText((searchList[14] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*oston.*")) {
            fxTextArea.appendText((searchList[15] + "\n"));

            matchCount++;
        }// End if
        if (searchString.matches(".*iego.*")) {
            fxTextArea.appendText(searchList[16] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iego.*")) {
            fxTextArea.appendText(searchList[17] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iego.*")) {
            fxTextArea.appendText(searchList[18] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iego.*")) {
            fxTextArea.appendText(searchList[19] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ashington.*")) {
            fxTextArea.appendText(searchList[20] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ashington.*")) {
            fxTextArea.appendText(searchList[21] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ashington.*")) {
            fxTextArea.appendText(searchList[22] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ashington.*")) {
            fxTextArea.appendText(searchList[23] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iami.*")) {
            fxTextArea.appendText(searchList[24] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iami.*")) {
            fxTextArea.appendText(searchList[25] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iami.*")) {
            fxTextArea.appendText(searchList[26] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*iami.*")) {
            fxTextArea.appendText(searchList[27] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ork.*")) {
            fxTextArea.appendText(searchList[28] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ork.*")) {
            fxTextArea.appendText(searchList[29] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ork.*")) {
            fxTextArea.appendText(searchList[30] + "\n");
            matchCount++;
        }// End if
        if (searchString.matches(".*ork.*")) {
            fxTextArea.appendText(searchList[31] + "\n");
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

