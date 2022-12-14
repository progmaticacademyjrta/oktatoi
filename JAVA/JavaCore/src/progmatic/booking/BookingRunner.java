package progmatic.booking;

import java.util.Scanner;

public class BookingRunner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
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

        Booking kerry = new Booking(name, checkin, checkout, guests);
        if (phone != 0)
            kerry.setPhoneNumber(phone);

        System.out.println(kerry);

    }
}
