import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task51 {
    public static void main(String[] args) {
        /**
         * Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni,
         * hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt
         * el kell intézni vagy el kell tenni, hogy minden meglegyen, rendben legyen.
         * Ha ‘X’-et ír tevékenység helyett, akkor fejezze be az elemek hozzáadását.
         */
        Set<String> checklist = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // for ciklussal - x-et nem adja hozzá a HashSet-hez
        for (; !userInput.equals("x"); ) {
            System.out.println("Add your item (for cycle): ");
            userInput = scanner.nextLine();
            if (!userInput.equals("x"))
                checklist.add(userInput);
        }

        // while - x-et nem adja hozzá a HashSet-hez
        userInput = "";
        boolean isInputActivity = true;
        while (isInputActivity) {
            System.out.println("Add your item (while cycle): ");
            userInput = scanner.nextLine();
            if (userInput.equals("x"))
                isInputActivity = false;
            else
                checklist.add(userInput);
        }

        System.out.println(checklist);

        // ua. while ciklussal (itt még x-et is hozzáadja a HashSet-hez)
        /*
        userInput = "";
        while (!userInput.equals("x")) {
            System.out.println("Add your item (while cycle): ");
            userInput = scanner.nextLine();
            checklist.add(userInput);
        }
        */

        // ua. do-while (itt még x-et is hozzáadja a HashSet-hez)
        /*
        do {
            System.out.println("Add your item (do-while cycle): ");
            userInput = scanner.nextLine();
            checklist.add(userInput);
        } while (!userInput.equals("x"));
        */
    }
}
