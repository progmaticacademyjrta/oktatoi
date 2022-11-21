import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        List<String> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean wantMoreItem = true;

        System.out.println("Vacation is coming! Add you checklist items: ");
        do {
            System.out.println("Your item:");
            userInput = scanner.nextLine();

            if (userInput.equals("X")) {
                wantMoreItem = false;
            } else if (itemList.contains(userInput)) {
                System.out.println("This item already added!");
            } else {
                itemList.add(userInput);
            }
        } while (wantMoreItem);

        System.out.println(itemList);
    }
}
