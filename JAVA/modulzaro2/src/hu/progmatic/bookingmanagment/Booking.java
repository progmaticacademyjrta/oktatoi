package hu.progmatic.bookingmanagment;

public class Booking {

    int roomPrice;
    int person;
    int days;
    int bookingName;
    int breakfastPrice = 4500;

    public Booking(int roomPrice, int person, int days, int bookingName) {
        this.roomPrice = roomPrice;
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
    }

    public int getTotalCost() {
        return roomPrice * days + (person * breakfastPrice * days);
    }
}
