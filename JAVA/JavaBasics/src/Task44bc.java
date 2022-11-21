import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44bc {
    public static void main(String[] args) {
        /*
        Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni,
        hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt el kell intézni
        vagy el kell tenni, hogy minden meglegyen, rendben legyen.
        Ha ‘X’-et ír tevékenység  helyett, akkor fejezze be az elemek hozzáadását.

        b) amennyiben a felhasználó azt az elemet adja meg, ami már létezik a listában,
        úgy akkor azt törölje onnan. (jelezve, hogy az a feladat/tevékenység teljesült)

        c) amennyiben elfogyott minden elem a listáról, akkor írja ki a program, hogy
        “Minden megvan, indulhat a nyaralás!”
         */
        List<String> itemList = new ArrayList<>();
        List<String> itemArchivedList = new ArrayList<>();
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
                System.out.println("Item removed!");
                itemList.remove(userInput);
            } else {
                itemList.add(userInput);
                itemArchivedList.add(userInput);
            }

            if (itemList.isEmpty()) {   // megvizsgálja, hogy kiürült-e a lista. Logika true / false.
                System.out.println("You done. Let's go to the vacatiooooon!");
                wantMoreItem = false;
            }
        } while (wantMoreItem);

        System.out.println("Ongoing list:" + itemList);
        System.out.println("Archived list: " + itemArchivedList);
    }
}
