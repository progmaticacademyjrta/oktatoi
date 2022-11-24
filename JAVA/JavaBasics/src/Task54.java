import java.util.HashMap;
import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        /**
         * Írjatok egy telefonkönyv programot,
         * amely a konzolról a felhasználó által megadott és beolvasott 5 darab név-hez
         * a hozzá tartozó telefonszámot lementi egy HashMap-ben.
         */

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        int counter = 0;

        do {
            System.out.println("Please add the name of the contact: ");
            String name = scanner.nextLine();
            System.out.println("Please add the number of the contact: ");
            String phoneNumber = scanner.nextLine();
            phonebook.put(name, phoneNumber);
            counter++;
        } while (counter < 5);

        System.out.println(phonebook);
    }
}
