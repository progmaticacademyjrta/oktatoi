import java.util.Scanner;

public class Task74step1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Add the id with count: (7 length)");
            input = scanner.nextLine(); // pl.: "1376367"
            if (!input.equalsIgnoreCase("X")) {
                String countAsString = String.valueOf(input.charAt(6));  // a charAt által visszaadott char típusú értéket átalakítom String-é
                int countAsInt = Integer.parseInt(countAsString);
                System.out.println(countAsInt);
            }
        } while (!input.equalsIgnoreCase("X"));
    }
}

