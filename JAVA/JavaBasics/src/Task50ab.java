import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task50ab {
    public static void main(String[] args) {
        System.out.println("Add meg a vendégek nevét");
        Set<String> guests = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfGuests;

        System.out.println("Add meg a vendégek számát");
        numberOfGuests = Integer.parseInt(scanner.nextLine());

        while (guests.size() < numberOfGuests) {
            System.out.println("Új vendég neve");
            String newGuest = scanner.nextLine();
            if (guests.contains(newGuest)) {
                System.out.println("Őt már meghívtad!");
            }
            guests.add(newGuest);

        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
