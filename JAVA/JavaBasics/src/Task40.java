import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        /*
        Írjatok vendéglista programot, amit a felhasználó tud feltölteni.
        Házibulit szervezünk és tudjuk, hogy 11-en férnek el a lakásban.
        Azonban fontos, hogy egy vendéget csak egyszer adhasson hozzá a felhasználó.
         */
        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            System.out.println("Add your guest name and press ENTER. You have " + guestList.size() + " guest added already");
            String userInput = scanner.nextLine();
            if (guestList.contains(userInput)) {            //eredmeny logikai true vagy false lesz
                System.out.println("Give me another one");
                i--;
            } else {
                guestList.add(userInput);
            }
        }

        System.out.println("List saved: ");
        for (String guest : guestList) {
            System.out.print(guest + " ");
        }

    }
}
