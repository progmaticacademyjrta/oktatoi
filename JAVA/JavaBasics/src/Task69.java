import java.util.ArrayList;
import java.util.List;

public class Task69 {
    public static void main(String[] args) {
        List<String> favoriteFruits = getFavoriteFruits();
        printListWithPrintln(favoriteFruits);
        printListWithForeach(favoriteFruits);
        printListWithFor(favoriteFruits);
        printListWithWhile(favoriteFruits);
        printListWithDoWhile(favoriteFruits);
    }

    public static List<String> getFavoriteFruits(){
        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Melon");
        favoriteFruits.add("Cherry");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Raspberry");
        return favoriteFruits;
    }

    public static void printListWithPrintln(List<String> favoriteFruits){
        System.out.println(favoriteFruits);
    }

    public static void printListWithForeach(List<String> favoriteFruits){
        System.out.println("With foreach:");
        for (String fruit : favoriteFruits) {
            System.out.println(fruit);
        }
    }

    public static void printListWithFor(List<String> favoriteFruits){
        System.out.println("With for:");
        for (int i = 0; i < favoriteFruits.size(); i++) {
            // tomb esetén favoriteFruits[i], List esetén favoriteFruits.get(i)
            System.out.println(favoriteFruits.get(i));
        }
    }

    public static void printListWithWhile(List<String> favoriteFruits){
        System.out.println("With while:");
        int i = 0;
        while (i < favoriteFruits.size()) {
            System.out.println(favoriteFruits.get(i));
            i++;
        }
    }

    public static void printListWithDoWhile(List<String> favoriteFruits){
        System.out.println("With do-while:");
        int i = 0;
        do {
            System.out.println(favoriteFruits.get(i));
            i++;
        } while (i < favoriteFruits.size());
    }
}
