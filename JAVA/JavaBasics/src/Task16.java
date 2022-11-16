import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Guess one! Rock / Paper / Scissors:");
        Scanner scanner = new Scanner(System.in);
        String userHand = scanner.nextLine();
        String computerHand;

        Random random = new Random();
        int computerGuess = random.nextInt(3);

        switch (computerGuess) {
            case 0:
                computerHand = "Rock";
                break;
            case 1:
                computerHand = "Paper";
                break;
            default:
                computerHand = "Scissors";
        }
        System.out.println("computerHand: " + computerHand);

        // WHO WIN?

    }
}
