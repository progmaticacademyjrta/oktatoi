package enums;

public class Task107alternative {
    /**
     * Készítsetek egy OrderStatus nevű enumot, mely
     * ACCEPTED, PAYED, TRANSIT, DELIVERED értékeket tartalmaz.
     * A program indítása után kiírja, hogy “Your order is currently … “
     * A … helyén pedig legyen a fenti enumok értéke, például
     * “Your order is currently ACCEPTED and waiting for the payment.”
     * Az pedig, hogy a fenti értékek közül melyiket írja ki a program
     * véletlenszerűen dőljön el.
     * Egy random generált 1-4 közötti szám döntse el a státuszt.
     * Pl.: 1 esetén ACCEPTED
     */
    public static void main(String[] args) {
        int rndNumber = UtilMethods.getARandomNumber(100, true);
        String prefix = "Your order is currently ";
        System.out.printf(prefix + getOrderStatus(rndNumber));
    }

    public static OrderStatus getOrderStatus(int rndNumber) {
        OrderStatus result = null;
        if (rndNumber == 1) {
            result = OrderStatus.ACCEPTED;
        } else if (rndNumber == 2) {
            result = OrderStatus.PAYED;
        } else if (rndNumber == 3) {
            result = OrderStatus.TRANSIT;
        } else if (rndNumber == 4) {
            result = OrderStatus.DELIVERED;
        }

        return result;
    }
}
