import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("Give me the value of your bills and I'll add them!");
        Scanner scanner = new Scanner(System.in);
        List<Integer> billsList = new ArrayList<>();

        System.out.println("Electricity: ");
        int userInput = scanner.nextInt();
        billsList.add(userInput);

        System.out.println("Gas: ");
        userInput = scanner.nextInt();
        billsList.add(userInput);

        System.out.println("Water: ");
        userInput = scanner.nextInt();
        billsList.add(userInput);

        System.out.println("Your bills: " + billsList);
        int total = 0;
        for (int bill : billsList) {
            total += bill;
        }

        /*
        for (int i = 0; i < billsList.size(); i++) {
            total += billsList.get(i);
        }
        */
        System.out.println("Your total is: " + total);
    }
}
