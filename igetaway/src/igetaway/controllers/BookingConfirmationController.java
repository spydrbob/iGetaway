/**
 * BookingConfirmationController.java
 * Author:
 * Last Revision: 6/04/2018
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
    private Label fxBookingNumLabel, fxFlightNumLabel, fxFlightDateLabel, 
            fxDepartureLocLabel, fxArrivalLocLabel, fxSeatsLabel, fxTotalPriceLabel;
            
    
     // This method controls 
    @FXML
    private void bookingConfirmButtonClicked(ActionEvent event) throws Exception {
        Parent mainUISceneParent = FXMLLoader.load(getClass().getResource("../views/mainUI.fxml"));
        Scene mainUIScene = new Scene(mainUISceneParent);

        //Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainUIScene);
        window.show();
    }// End method
    
     public void initBookingData (String bookingNum, String flightNum, String date,
           String departureLoc, String arrivalLoc, ArrayList<FlightSeat> seats, 
           String totalPrice) {
     
         fxBookingNumLabel.setText(bookingNum);
         fxFlightNumLabel.setText(flightNum);
         fxFlightDateLabel.setText(date);
         fxDepartureLocLabel.setText(departureLoc);
         fxArrivalLocLabel.setText(arrivalLoc);
         fxTotalPriceLabel.setText("$" + totalPrice);
         
         // Converting the ArrayList to strings
         String seatList = seats.toString().concat(" ");
         fxSeatsLabel.setText(seatList);
   }// End method
    
}// End class
