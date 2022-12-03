import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task71 {
    /**
     * Készítsetek egy alkalmazást ami mindaddig beolvas egy szöveget a konzolról,
     * amíg x-et nem kap. Minden értéket amit beolvasott mentsünk egy egy List-be,
     * de már csak a bevitt szöveg kisbetűs változatát!
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> valuesFromConsole = new ArrayList<>();
        System.out.println("Add values and press ENTER. If the value X then execution ends");
        String value;
        do {
            System.out.println("value: ");
            value = scanner.nextLine();
            valuesFromConsole.add(value);
        } while (!value.equals("X"));

        System.out.println(valuesFromConsole);
    }
}
