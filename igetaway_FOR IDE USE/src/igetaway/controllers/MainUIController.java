/**
 * MainUIController.java
 * Author: Chris Speidel
 * Last Revision: 6/06/2018
 * This logic supports user login functionality
 */
package igetaway.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainUIController {

    @FXML
    private TextField fxMainSearchField;
    @FXML
    private Label fxGreetingLabel;
    @FXML
    private ComboBox fxFlightCombo;
    ObservableList<String> flightOptions = FXCollections.observableArrayList();
   
    private String[] searchList = new String[]{
            "Flight No: HW001   06/18/2018 Destination: Hawaii   Departing: Hong Kong",
            "Flight No: HW002   06/19/2018 Destination: Hawaii   Departing: Seoul",
            "Flight No: HW003   06/20/2018 Destination: Hawaii   Departing: San Francisco",
            "Flight No: HW004   06/21/2018 Destination: Hawaii   Departing: Sydney",
            "Flight No: TX001   06/18/2018 Destination: Dallas   Departing: Baltimore",
            "Flight No: TX002   06/19/2018 Destination: Dallas   Departing: Pittsburgh",
            "Flight No: TX003   06/20/2018 Destination: Dallas   Departing: Oakland",
            "Flight No: TX004   06/21/2018 Destination: Dallas   Departing: Detroit",
            "Flight No: CH001   06/18/2018 Destination: Chicago   Departing: Fresno",
            "Flight No: CH002   06/19/2018 Destination: Chicago   Departing: Tampa",
            "Flight No: CH003   06/20/2018 Destination: Chicago   Departing: Denver",
            "Flight No: CH004   06/21/2018 Destination: Chicago   Departing: Sydney",
            "Flight No: BO001   06/18/2018 Destination: Boston   Departing: Baltimore",
            "Flight No: BO002   06/19/2018 Destination: Boston   Departing: Pittsburgh",
            "Flight No: BO003   06/20/2018 Destination: Boston   Departing: Denver",
            "Flight No: BO004   06/21/2018 Destination: Boston   Departing: Detroit",
            "Flight No: SD001   06/18/2018 Destination: San Diego   Departing: Fresno",
            "Flight No: SD002   06/19/2018 Destination: San Diego   Departing: Tampa",
            "Flight No: SD003   06/20/2018 Destination: San Diego   Departing: Denver",
            "Flight No: SD004   06/21/2018 Destination: San Diego   Departing: Sydney",
            "Flight No: SE001   06/18/2018 Destination: Seattle   Departing: Baltimore",
            "Flight No: SE002   06/19/2018 Destination: Seattle   Departing: Pittsburgh",
            "Flight No: SE003   06/20/2018 Destination: Seattle   Departing: Denver",
            "Flight No: SE004   06/21/2018 Destination: Seattle   Departing: Detroit",
            "Flight No: MI001   06/18/2018 Destination: Miami   Departing: Fresno",
            "Flight No: MI002   06/19/2018 Destination: Miami   Departing: Tampa",
            "Flight No: MI003   06/20/2018 Destination: Miami   Departing: Denver",
            "Flight No: MI004   06/21/2018 Destination: Miami   Departing: Sydney",
            "Flight No: NY001   06/18/2018 Destination: New York   Departing: Baltimore",
            "Flight No: NY002   06/19/2018 Destination: New York   Departing: Pittsburgh",
            "Flight No: NY003   06/20/2018 Destination: New York   Departing: Denver",
            "Flight No: NY004   06/21/2018 Destination: New York   Departing: Detroit"};

    @FXML
    private int searchButtonClicked(ActionEvent event) throws IOException {
        flightOptions.clear();

        String searchString = fxMainSearchField.getText();

        if (searchString.equals("")) {
            String noParam = "No search criteria entered";
            flightOptions.add(noParam);
            fxFlightCombo.setItems(flightOptions);
            return -1;
        }// End if
        if (searchString.matches(".*awaii.*")) {
            flightOptions.add(searchList[0]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*awaii.*")) {
            flightOptions.add(searchList[1]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*awaii.*")) {
            flightOptions.add(searchList[2]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*awaii.*")) {
            flightOptions.add(searchList[3]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*exas.*")) {
            flightOptions.add(searchList[4]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*exas.*")) {
            flightOptions.add(searchList[5]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*exas.*")) {
            flightOptions.add(searchList[6]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*exas.*")) {
            flightOptions.add(searchList[7]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*hicago.*")) {
            flightOptions.add(searchList[8]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*hicago.*")) {
            flightOptions.add(searchList[9]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*hicago.*")) {
            flightOptions.add(searchList[10]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*hicago.*")) {
            flightOptions.add(searchList[11]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*oston.*")) {
            flightOptions.add(searchList[12]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*oston.*")) {
            flightOptions.add(searchList[13]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*oston.*")) {
            flightOptions.add(searchList[14]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*oston.*")) {
            flightOptions.add(searchList[15]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iego.*")) {
            flightOptions.add(searchList[16]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iego.*")) {
            flightOptions.add(searchList[17]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iego.*")) {
            flightOptions.add(searchList[18]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iego.*")) {
            flightOptions.add(searchList[19]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*eattle.*")) {
            flightOptions.add(searchList[20]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*eattle.*")) {
            flightOptions.add(searchList[21]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*eattle.*")) {
            flightOptions.add(searchList[22]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*eattle.*")) {
            flightOptions.add(searchList[23]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iami.*")) {
            flightOptions.add(searchList[24]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iami.*")) {
            flightOptions.add(searchList[25]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iami.*")) {
            flightOptions.add(searchList[26]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*iami.*")) {
            flightOptions.add(searchList[27]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*ork.*")) {
            flightOptions.add(searchList[28]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*ork.*")) {
            flightOptions.add(searchList[29]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*ork.*")) {
            flightOptions.add(searchList[30]);
            fxFlightCombo.setItems(flightOptions);

        }// End if
        if (searchString.matches(".*ork.*")) {
            flightOptions.add(searchList[31]);
            fxFlightCombo.setItems(flightOptions);

        }// End if

        return 0;
    }// End method

    @FXML
    private void bookAFlightButtonClicked(ActionEvent event) throws Exception {
        String flightInfo = (String) fxFlightCombo.getValue();
        String userFirstName = (String) fxGreetingLabel.getText();
        
        // FXML Loader that accesses the bookingConfirmation.fxml file
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../views/seats.fxml"));
        Parent seatsSceneParent = loader.load();
        Scene seatsScene = new Scene(seatsSceneParent);

        // Access SeatController and call its methods
        SeatController s_Controller = loader.getController();
        s_Controller.initFlightData(flightInfo);
        s_Controller.initUserData(userFirstName);
        s_Controller.resetTotal();
        
        // Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(seatsScene);
        window.centerOnScreen();
        window.show();
    }// End method

    @FXML
    private void logoutLinkClicked(ActionEvent event) throws Exception {
        Parent loginSceneParent = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
        Scene loginScene = new Scene(loginSceneParent);

        //Stage Information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.centerOnScreen();
        window.show();
    }// End method

    public void initUserData(String firstName) {
        fxGreetingLabel.setText(firstName);
    }// End method
}// End class

