import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44a {
    public static void main(String[] args) {
        /*
        Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni,
        hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt el kell intézni
        vagy el kell tenni, hogy minden meglegyen, rendben legyen.
        Ha ‘X’-et ír tevékenység  helyett, akkor fejezze be az elemek hozzáadását.

        a) ügyeljetek rá, hogy kétszer ne lehessen ugyanazt az elemet a listához adni.
        Ha mégis megpróbálja a felhasználó akkor kapjon hibaüzenetet.
         */
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
