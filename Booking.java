
import java.time.LocalDate;//allows for the use of LocalDate arrival and departure//
import java.time.Period;// allows for the user to find a period difference between 2 times//

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bertrambock
 */
public class Booking {
// all field are made private so they cnnot be accessed outside the main method//
    private String bookingID;//stores all bookings that will be made//
    private LocalDate arrivalDate, departureDate;//stores the arrival dates and the departure dates for calculation//
    private int numPeople;//tracks the number of people staying in a room//
    private static int _CONSFEE_ = 100;//the constant conservation fee added to the base price per night//

    public Booking(String INbookingID, LocalDate INarrivalDate, LocalDate INdepartureDate, int INnumPeople) {
        //A booking constructor that creates a new booking object with all the required details//
        bookingID = INbookingID;
        arrivalDate = INarrivalDate;
        departureDate = INdepartureDate;
        numPeople = INnumPeople;
    }

    public String getBookingID() {
        // getter method that returns the booking ID of each booking//
        return bookingID;
    }

    public LocalDate getArrivalDate() {
        //getter method the returns the arrival date of eac h booking//
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        //getter method that returns the departure date of each booking/
        return departureDate;
    }

    public int numNights() {
        //calculates the number of nights between the arrival date and the departure date//
        Period diff = Period.between(arrivalDate, departureDate);
        return diff.getDays();

    }

    public int Cost() {
       //calculates the total cost of the booking 
       //the base price per night = R500 + the conservation fee per night = R100//
        return numPeople * numNights() * (500 + _CONSFEE_);

    }

    public void setBookingID(String bookingID) {
        //setter method that updates the booking ID//
        this.bookingID = bookingID;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        //setter method that updates the arrival date//
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        //setter method that updates the departure date//
        this.departureDate = departureDate;
    }

    public void setNumPeople(int numPeople) {
        //setter method that updates the number of people//
        this.numPeople = numPeople;
    }

    @Override
    public String toString() {
        //ToString method//
        //returns a formatted string representing all booking details//
        

        return "----- Booking Details -----\n" + "Booking ID   : " + bookingID + "\n" + "Arrival Date : " + arrivalDate + "\n" + "Departure Date: " + departureDate + "\n" + "People       : " + numPeople + "\n" + "Nights       : " + numNights() + "\n" + "Total Cost   : R" + Cost() + "\n" + "----------------------------";
    }
}

