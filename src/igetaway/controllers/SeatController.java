/**
 * SeatController.java
 * Author: Mike Davis
 * Last Revision: 5/23/2018
 * This logic supports seat booking functionality
 */

package igetaway.controllers;

import igetaway.models.FlightSeat;
import java.util.ArrayList;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;


public class SeatController {

    // Variables
    private FlightSeat flightSeat;
    private int seatCount = 0;

    @FXML
    private Label fxTotalPriceLabel;
    @FXML
    private Label fxErrorLabel;
    @FXML
    private TextArea fxBookingSummary;
    @FXML
    private static int seatPrice = 299;
    @FXML
    private static int totalPrice;
    @FXML
    Button fxBackToMainUIButton;
    @FXML
    ToggleButton fxSeatA1, fxSeatB1, fxSeatC1, fxSeatD1, fxSeatE1, fxSeatF1,
            fxSeatA2, fxSeatB2, fxSeatC2, fxSeatD2, fxSeatE2, fxSeatF2,
            fxSeatA3, fxSeatB3, fxSeatC3, fxSeatD3, fxSeatE3, fxSeatF3,
            fxSeatA4, fxSeatB4, fxSeatC4, fxSeatD4, fxSeatE4, fxSeatF4,
            fxSeatA5, fxSeatB5, fxSeatC5, fxSeatD5, fxSeatE5, fxSeatF5,
            fxSeatA6, fxSeatB6, fxSeatC6, fxSeatD6, fxSeatE6, fxSeatF6,
            fxSeatA7, fxSeatB7, fxSeatC7, fxSeatD7, fxSeatE7, fxSeatF7,
            fxSeatA8, fxSeatB8, fxSeatC8, fxSeatD8, fxSeatE8, fxSeatF8;
    
    private ArrayList<FlightSeat> seatInventory = new ArrayList<>();
    private Random randNum;

    // METHODS FOR ROW 1
    @FXML
    private void seatA1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
       
        if (fxSeatA1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatA1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    @FXML
    private void seatB1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatB1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    @FXML
    private void seatC1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    @FXML
    private void seatD1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    @FXML
    private void seatE1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    @FXML
    private void seatF1booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F1");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatF1.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F1");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if

    }// End method

    // METHODS FOR ROW 2
    @FXML
    private void seatA2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatD2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF2booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F2");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatF2.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F2");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 3
    @FXML
    private void seatA3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatA3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatB3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;

        }// End if


        else if (!fxSeatC3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF3booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F3");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF3.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F3");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 4
    @FXML
    private void seatA4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF4booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F4");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF4.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F4");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 5
    @FXML
    private void seatA5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF5booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F5");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF5.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F5");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 6
    @FXML
    private void seatA6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF6booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F6");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF6.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F6");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 7
    @FXML
    private void seatA7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatD7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF7booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F7");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF7.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F7");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // METHODS FOR ROW 8
    @FXML
    private void seatA8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatA8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatA8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("A8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatB8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatB8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatB8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("B8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatC8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatC8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatC8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("C8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatD8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatD8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
            seatCount--;
        }// End if


        else if (!fxSeatD8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("D8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatE8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatE8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatE8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("E8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    @FXML
    private void seatF8booked(ActionEvent event) {
        flightSeat = new FlightSeat();
        if (fxSeatF8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F8");
            totalPrice += seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.bookSeat();
            seatInventory.add(flightSeat);
            fxBookingSummary.appendText("Seat: " + flightSeat.getID() + " booked:       $" + seatPrice + "\n");
            seatCount++;
        }// End if


        else if (!fxSeatF8.isSelected() && !flightSeat.isSeatBooked()) {
            flightSeat.setID("F8");
            totalPrice -= seatPrice;
            String tempTotal;
            tempTotal = String.valueOf(totalPrice);
            fxTotalPriceLabel.setText(tempTotal);
            flightSeat.releaseSeat();
            seatInventory.remove(flightSeat);
            fxBookingSummary.appendText("\nSeat " + flightSeat.getID() + " was released.\n\n");
            flightSeat = null;
            seatCount--;
        }// End else if
    }// End method

    // This method goes back to the main UI
    @FXML
    private void backToMainUIButtonClicked(ActionEvent event) throws  Exception {
        Parent mainUISceneParent = FXMLLoader.load(getClass().getResource("../views/mainUI.fxml"));
        Scene mainUIScene = new Scene(mainUISceneParent);

        //Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainUIScene);
        window.show();
    }// End method
    
    // This method handles confirmation for seat booking
    @FXML
    private int seatSubmitButtonClicked(ActionEvent event) throws  Exception {
        if(seatCount < 1) {
            fxErrorLabel.setText("You must select at least one seat to continue");
            
            return -1;
        }// End if
        else if(seatCount > 10) {
            fxErrorLabel.setText("You have exceeded the 10 seat limit.  Please"
                    + " decrease your seat number or call our customer service "
                    + "line at 1-800-GETAWAY for further assistance");
            
            return -1;
        }// End else if
        randNum = new Random();
        int bookingSeed1 = randNum.nextInt(1000);
        String strBookingSeed1 = Integer.toString(bookingSeed1);
        String bookingCode = "GWY";
        int bookingSeed2 = randNum.nextInt(1000);
        String strBookingSeed2 = Integer.toString(bookingSeed2);
        
        String bookingNum = strBookingSeed1 + bookingCode + strBookingSeed2;
             
        //DUMMY VALUES FOR TESTING
        String flightNum = "101";
        String departureLoc = "Houston, TX.";
        String arrivalLoc = "Oahu, HI";
        String date = "06/12/2018";
        String strTotalPrice = Integer.toString(totalPrice);
        
        // FXML Loader that accesses the bookingConfirmation.fxml file
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../views/bookingConfirmation.fxml"));
        Parent bookingConfirmationSceneParent = loader.load();
        Scene bookingConfirmationScene = new Scene(bookingConfirmationSceneParent);

        // Access BookingConfirmationController and call initBookingData method
        BookingConfirmationController bc_Controller = loader.getController();
        bc_Controller.initBookingData(bookingNum, flightNum, date, departureLoc, 
                arrivalLoc, seatInventory, strTotalPrice);
        
        // Stage Information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bookingConfirmationScene);
        window.show();
        
        return 0;
    }// End method
 
}// End class
