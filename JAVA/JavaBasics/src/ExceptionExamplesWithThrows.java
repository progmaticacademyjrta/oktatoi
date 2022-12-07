import java.util.Scanner;

public class ExceptionExamplesWithThrows {
    public static void main(String[] args) {
        try {
            getUserInput();
        } catch (NumberFormatException ex) {
            System.out.println("Hey, you added text instead of number.");
        }
        System.out.println("Thanks for using our service!");
    }

    public static int getUserInput() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }
}
