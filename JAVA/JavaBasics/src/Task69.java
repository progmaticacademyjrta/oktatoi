import java.util.ArrayList;
import java.util.List;

public class Task69 {
    public static void main(String[] args) {
        getFavoriteFruits();
        printListWithPrintln(favoriteFruits);
        printListWithForeach(favoriteFruits);
        printListWithFor(favoriteFruits);
        printListWithWhile(favoriteFruits);
        printListWithDoWhile(favoriteFruits);

        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Melon");
        favoriteFruits.add("Cherry");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Raspberry");

        System.out.println(favoriteFruits);

        System.out.println("With foreach:");
        for (String fruit : favoriteFruits) {
            System.out.println(fruit);
        }

        System.out.println("With for:");
        for (int i = 0; i < favoriteFruits.size(); i++) {
            // tomb esetén favoriteFruits[i], List esetén favoriteFruits.get(i)
            System.out.println(favoriteFruits.get(i));
        }

        System.out.println("With while:");
        int i = 0;
        while (i < favoriteFruits.size()) {
            System.out.println(favoriteFruits.get(i));
            i++;
        }

        System.out.println("With do-while:");
        i = 0;
        do {
            System.out.println(favoriteFruits.get(i));
            i++;
        } while (i < favoriteFruits.size());
    }
}
