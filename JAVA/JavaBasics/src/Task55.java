import java.util.HashMap;
import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        /**
         * Írjatok egy bevásárló lista programot, amely nem csinál mást,
         * mint a felhasználótól beolvasott elemeket,
         * majd az elemhez tartozó darabszámot elmenti egy Map-be és
         * a végén ki is írja a felhasználó számára az elmentett elemeket.
         *
         * a) fix 7 elemű legyen a Map, pontosan 7 elemet lehessen hozzáadni
         *
         * b) oldjuk meg, hogy ha az elem már szerepel a Map-ben, akkor
         * írja ki a program, hogy “Az elem darabszáma frissítésre került”
         *
         * c) ne legyen limitálva, hogy mennyi elemet adhat a felhasználó.
         * Miután hozzáadott 3 elemet a felhasználó, kérdezze meg minden elem hozzáadása után,
         * hogy szeretne-e új elemet hozzáadni.
         * “Y” esetén újbóli beolvasás, “N” esetén a Map kiíratása következik
         */
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> shoppingList = new HashMap<>();

        for (int i = 0; i < 7; i++) {
            System.out.println("Please add the name of the item: ");
            String name = scanner.nextLine();
            System.out.println("Please add the count of the item: ");
            int itemCount = Integer.parseInt(scanner.nextLine());
            shoppingList.put(name, itemCount);
        }
        System.out.println(shoppingList);
    }
}
