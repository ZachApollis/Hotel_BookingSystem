
import java.time.LocalDate;//allows for the use of LocalDate arrival and departure//
import java.util.Scanner;// allows for the use of the Scanner class//

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bertrambock
 */
public class BookingUI {

    public static void main(String[] args) {//main method//

        Scanner sc = new Scanner(System.in);
        BookingManager manager = new BookingManager();

        int choice;

        do {
            System.out.println("\n--- BOOKING SYSTEM ---");
            System.out.println("1. Add Booking");
            System.out.println("2. View Bookings");
            System.out.println("3. Delete Booking");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Booking ID: ");
                    String id = sc.nextLine();

                    System.out.print("Arrival date (YYYY-MM-DD): ");
                    LocalDate arr = LocalDate.parse(sc.nextLine());

                    System.out.print("Departure date (YYYY-MM-DD): ");
                    LocalDate dep = LocalDate.parse(sc.nextLine());

                    System.out.print("Number of people: ");
                    int people = sc.nextInt();

                    Booking b = new Booking(id, arr, dep, people);
                    manager.addBooking(b);

                    System.out.println("Booking added.");
                    break;

                case 2:
                    System.out.println(manager.viewbookings());
                    break;

                case 3:
                    System.out.print("Enter Booking ID to delete: ");
                    String delID = sc.nextLine();

                    if (manager.deleteBookings(delID)) {
                        System.out.println("Booking deleted.");
                    } else {
                        System.out.println("Booking not found.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
