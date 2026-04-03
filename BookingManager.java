/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bertrambock
 */
public class BookingManager {

    private Booking[] bArr = new Booking[30];//booking array of 30 objects//
    private int size = 0;//int size of 0 objects//

    public void addBooking(Booking booking) {
        // Adds the given booking to the next available position in the array and increases the size counter
        if (size < bArr.length) {
            bArr[size] = booking;
            size++;
        }

    }

    public String viewbookings() {
        if (size == 0) {
            return "no bookings availible";

        }
        String temp = " ";
        for (int i = 0; i < size; i++) {
            temp = bArr[i] + "\n";
        }
        return temp;
    }

    public boolean deleteBookings(String bookingID) {
        //deletes booking by ID//

        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (bArr[i].getBookingID().equalsIgnoreCase(bookingID)) {
                pos = i;
            }
            break;
        }
        if (pos == -1) {
            return false;//not found//   
        }
        //shift array left//
        for (int i = pos; i < size - 1; i++) {
            bArr[i] = bArr[i + 1];

        }
        size--;
        return true;//found//
    }
}
