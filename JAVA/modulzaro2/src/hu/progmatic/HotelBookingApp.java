package hu.progmatic;

import hu.progmatic.bookingmanagment.BookingService;

import java.util.ArrayList;

public class HotelBookingApp {

    public static void main(String[] args) {
	// write your code here
        BookingService service = new BookingService();
        ArrayList<String> dd =new ArrayList<>();
        dd.add(Util.getUserInput());
        service.newBooking(newBooking);

    }
}
