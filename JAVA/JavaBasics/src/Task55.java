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

        boolean wantNewItem = true;
        int sumOfItems = 0;

        while (wantNewItem) {
            System.out.println("Please add the name of the item: ");
            String name = scanner.nextLine();
            System.out.println("Please add the quantity of the item: ");
            int itemCount = Integer.parseInt(scanner.nextLine());
            if (shoppingList.containsKey(name)){
                System.out.println("Quantity of the item has been updated");
                sumOfItems -= shoppingList.get(name);
            }
            sumOfItems += itemCount;
            shoppingList.put(name, itemCount);
            if (3 <= shoppingList.size()) {
                System.out.println("Do you want to add a new item? Y/N");
                String decision = scanner.nextLine();
                if (!decision.equals("Y"))
                    wantNewItem = false;
            }
        }
        System.out.println(shoppingList);
        System.out.println("Count of product: " + shoppingList.size());
        System.out.println("Quantity of items: " + sumOfItems);

    }
}
