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

        System.out.println("Please add the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Please add the number of the contact: ");
        String phonenumber = scanner.nextLine();
        phonebook.put(name, phonenumber);

        System.out.println(phonebook);
    }
}
