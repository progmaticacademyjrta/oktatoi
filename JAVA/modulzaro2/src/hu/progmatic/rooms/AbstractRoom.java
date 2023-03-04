package hu.progmatic.rooms;

import java.time.LocalDate;
import java.time.Month;

import static java.time.Month.JANUARY;

public abstract class AbstractRoom {
    protected boolean isExtraBedNeeded;
    protected int extraBedPrice = 3000;
    private int seasonBasedPrice;

    abstract int calculateRoomPrice();

    public int getSeasonBasedDefaultPrice() {
        LocalDate now = LocalDate.now();
        Month userMonth = now.getMonth();
        if(userMonth.equals(JANUARY))

        switch (userMonth) {
            case DECEMBER, JANUARY, FEBRUARY:
                seasonBasedPrice = 11000;
                break;
        }
        return seasonBasedPrice;
    }
}
