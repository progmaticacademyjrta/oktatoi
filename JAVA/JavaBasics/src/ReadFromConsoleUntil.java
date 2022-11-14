import java.util.Scanner;

public class ReadFromConsoleUntil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Read from the console until 'x' character!");
        boolean allowInputFlag = true;

        while (allowInputFlag) {
            String userInput = scanner.nextLine();
            if (userInput.equals("x"))
                allowInputFlag = false;
        }
    }
}
