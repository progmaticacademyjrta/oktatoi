package enums;

import java.util.Random;

public class Task107 {
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
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(4) + 1;

        String prefix = "Your order is currently ";
        if (rndNumber == 1) {
            System.out.println(prefix + OrderStatus.ACCEPTED + " and waiting for the payment.");
        } else if (rndNumber == 2) {
            System.out.println(prefix + OrderStatus.PAYED + " and waiting for delivery partner.");
        } else if (rndNumber == 3) {
            System.out.println(prefix + OrderStatus.TRANSIT + " and waiting to deliver it to you.");
        } else if (rndNumber == 4) {
            System.out.println(prefix + OrderStatus.DELIVERED + " enjoy!");
        }
    }
}
