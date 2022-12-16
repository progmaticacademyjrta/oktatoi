package progmatic.bookingv2;

import progmatic.booking.Booking;

import java.util.*;

public class BookingRunner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Lista adatszerkezet
        List<Booking> bookings = new ArrayList<>();
        // booking objektum es Integer azonosito a foglalashoz
        Map<Integer,Booking> bookingMap = new HashMap<>();
        Set<Booking> bookingSet = new HashSet<>();
        Booking[] bookingArray = new Booking[2];

        int bookingCount = 2;
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
            bookings.add(booking);
            bookingMap.put(i,booking);
            bookingSet.add(booking);
            bookingArray[i] = booking;
            if (phone != 0)
                booking.setPhoneNumber(phone);

            System.out.println(booking);
        }

        System.out.println("----------Lista------------");
        for(int i = 0; i < bookings.size(); i++){
            System.out.println(bookings.get(i));
        }
        System.out.println("----------Map------------");
        System.out.println(bookingMap.get(0));
        System.out.println(bookingMap.get(1));

        System.out.println("----------Set------------");
        for(Booking b : bookingSet){
            System.out.println(b);
        }
        System.out.println("----------Array------------");
        System.out.println(bookingArray[0]);
        System.out.println(bookingArray[1]);
        System.out.println("----------Equals?------------");

        // csak megneztuk, hogy azonos attributum ertekekkel rendelkezo objektumok egyenloek-e...
        // nem :)
        System.out.println(bookingArray[0] == bookingArray[1]);

    }
}
