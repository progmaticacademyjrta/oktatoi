import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        /*
        Írjatok egy bevásárló lista programot. Amely nem csinál mást,
        mint a felhasználótól beolvasott elemeket elmenti egy List-be és a végén ki is írja
        a felhasználó számára az elmentett elemeket.

        a) a lista fix 7 elemű
        c) “Ez az elem már hozzáadásra került!” ha már benne van
         */

        List<String> itemList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 7 items to your lists: ");
        String userInput;

        for (int i = 0; i < 7; i++) {
            System.out.println("Your item:");
            userInput = scanner.nextLine();
            if (itemList.contains(userInput)) {
                System.out.println("This item already added!");
                i--;
            } else {
                itemList.add(userInput);
            }
        }

        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }
        //System.out.println("Your shopping list: " + itemList);
    }
}
