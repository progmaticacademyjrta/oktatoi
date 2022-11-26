import java.util.HashMap;
import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        /**
         * Készítsetek egy számla végösszeg kalkulátor programot,
         * amelybe be lehet rögzíteni az adott hónap különböző számláinak az összegét.
         * A program pedig összeadja őket és kiírja mennyit kell a családi kasszából fizetni összesen.
         * Magát, hogy milyen számla az amit be kell fizetni, az is kerüljön beolvasásra az összegekkel együtt
         * (de külön beolvasással - 3 darab -).
         *
         * a) Az elemek kerüljenek Mapben mentésre, majd összeadásra és kiíratása.
         * b) Amennyiben a felhasználó 0 ft-os számlát ír, úgy azt törölje ki a Map-ből a program
         */
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> billsMap = new HashMap<>();

        //int sumOfBills = 0;
        while (billsMap.size() < 3) {
            System.out.println("Please add the name of the bill: ");
            String billName = scanner.nextLine();
            System.out.println("Please add the value of the bill: ");
            int billValue = Integer.parseInt(scanner.nextLine());
            //sumOfBills += billValue;   // version 1
            billsMap.put(billName, billValue);
            // ??????
        }

        // version 2
        int sumOfBills = 0;
        for (String itemName : billsMap.keySet()) {
            sumOfBills += billsMap.get(itemName);
        }

        System.out.println(billsMap);
        System.out.println("Sum of the bills: " + sumOfBills);
    }
}
