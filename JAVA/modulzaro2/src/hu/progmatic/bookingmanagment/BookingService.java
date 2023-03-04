package hu.progmatic.bookingmanagment;

import hu.progmatic.rooms.KingRoom;

import java.util.ArrayList;

public class BookingService implements BookingInterface {

    @Override
    public void newBooking(ArrayList<String> userData) {
        String elsoertek = userData.get(0);

        int roomPrice;
        KingRoom king = new KingRoom();
        roomPrice = king.calculateRoomPrice();
        System.out.println(roomPrice);

        Booking b = new Booking(roomPrice, 2, 2, 222);
        System.out.println("Gratulaa" + b.getTotalCost());
    }

}
