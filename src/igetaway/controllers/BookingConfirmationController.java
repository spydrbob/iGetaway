/**
 * BookingConfirmationController.java
 * Author: Mike Davis
 * Last Revision: 6/06/2018
 * This logic supports the booking confirmation UI message
 */
package igetaway.controllers;

import igetaway.models.FlightSeat;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BookingConfirmationController {
    
    // Variables
    @FXML
    private Label fxBookingInfoLabel, fxSeatsLabel, fxTotalPriceLabel;
    String userFirstName;      
       
     // This method controls the loading of the main UI after booking
    @FXML
    private void bookingConfirmButtonClicked(ActionEvent event) throws Exception {
        // FXML Loader that accesses the mainUI.fxml file
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../views/mainUI.fxml"));
                Parent mainUISceneParent = loader.load();
                Scene mainUIScene = new Scene(mainUISceneParent);

                // Access MainUIController and call initUserData method
                MainUIController m_Controller = loader.getController();
                m_Controller.initUserData(userFirstName);

                // Stage Information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(mainUIScene);
                window.centerOnScreen();
                window.show();
    }// End method
    
    // This method sets the booking information
     public void initBookingData (String bookingInfo, ArrayList<FlightSeat> seats, 
           String totalPrice) {
        
        fxBookingInfoLabel.setText(bookingInfo);
        fxTotalPriceLabel.setText("$" + totalPrice);
        
        // Check for null values and exclude
        
        // TODO
         
         // Converting the ArrayList to strings
         String seatList = seats.toString().concat(" ");
         fxSeatsLabel.setText(seatList);
   }// End method
   
    // This method is used to persistent the user's first name
   public void initUserData(String firstName) {
       this.userFirstName =  firstName;
   }// End method
    
}// End class
