package progmatic.booking;

import java.util.Scanner;

public class BookingRunner extends Object{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int bookingCount = Integer.parseInt(args[0]);
        for (int i = 0; i < bookingCount; i++) {

            System.out.println("Name:");
            String name = scn.nextLine();
            System.out.println("Phone number:");
            int phone;
            try {
                phone = Integer.parseInt(scn.nextLine());
            } catch (NumberFormatException ex) {
                phone = 0;
            }
            System.out.println("Check in date:");
            String checkin = scn.nextLine();
            System.out.println("Check out date:");
            String checkout = scn.nextLine();
            System.out.println("Number of guests:");
            int guests = Integer.parseInt(scn.nextLine());

            Booking booking = new Booking(name, checkin, checkout, guests);
            if (phone != 0)
                booking.setPhoneNumber(phone);

            System.out.println(booking);
        }
    }
}
