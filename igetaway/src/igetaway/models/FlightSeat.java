/**
 * FlightSeat.java
 * Author:
 * Last Revision: 5/24/2018
 * This logic serves as a data object for flight seats
 */

package igetaway.models;

public class FlightSeat {

    // Variables
    private String ID;
    private Boolean isBooked = false;



    // Constructors
    public FlightSeat(){

    }// End constructor


    // Get and Set methods
    public String getID() {

        return ID;
    }// End method

    public void setID(String ID) {

        this.ID = ID;
    }// End method

    public boolean isSeatBooked() {

        return isBooked;
    }// End method

    public void bookSeat() {

        isBooked = true;
    }// End method

    public void releaseSeat(){

        isBooked = false;
    }// End method

    @Override
    public String toString() {
        return ID;
    }// End method
    
    

}// End class

