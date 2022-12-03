import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task73step3 {
    /**
     * Készítsetek egy alkalmazást, amely egy bevásárló lista.
     * Az elemeket be tudja olvasni az alábbi formában:
     * tétel-db vagyis, kenyér-2 vagy sör-6.
     * <p>
     * Az így beolvasott elemeket feldarabolja a - jel mentén és elmenti egy shoppingList nevű Map-be.
     * Az első fele, a kötőjel előtti rész legyen a kulcs, a második rész pedig a darabszám.
     * System.out.println()-el írjátok ki a képernyőre a map tartalmát.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Add items and values in the item-value format and press ENTER)" +
                " If you type X then execution ends");

        // Map<String, Integer> shoppingList = new HashMap();
        // shoppingList = getShoppingListAsMap();
        // System.out.println(shoppingList);
        System.out.println(getShoppingListAsMap());
    }

    public static Map<String, Integer> getShoppingListAsMap(){
        Map<String, Integer> shoppingList = new HashMap();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("your item: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("X")) {
                String[] userInputAsArray = userInput.split("-");
                String item = userInputAsArray[0];       //userInput - előtti része
                String value = userInputAsArray[1];     //userInput - utáni része Stringként
                int valueInt = Integer.parseInt(value); //userInput - utáni része int-ként
                shoppingList.put(item, valueInt);
            }
        } while (!userInput.equalsIgnoreCase("X"));
        return shoppingList;
    }
}
