package hu.progmatic.rooms;

public class KingRoom extends AbstractRoom {
    private final int additionalRoomPrice = 5000;

    @Override
    public String toString() {
        return "KingRoom{" +
                "isExtraBedNeeded=" + isExtraBedNeeded +
                ", extraBedPrice=" + extraBedPrice +
                ", roomPrice=" + additionalRoomPrice +
                '}';
    }

    @Override
    public int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice() + additionalRoomPrice + extraBedPrice;
    }
}
