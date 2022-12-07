import java.util.Scanner;

public class ExceptionExamplesWithTryCatch {
    public static void main(String[] args) {
        int[] exampleArray = {21, 44, 33, 77};
        int indexFromUser = getUserInput();

        try {
            System.out.println(exampleArray[indexFromUser]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hey, there is no such an index in the array! Because: " + exception.getMessage());
        }
        System.out.println("Thanks for using our service!");
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        try {
            index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Hey, you added text instead of number.");
        }
        return index;
    }
}
