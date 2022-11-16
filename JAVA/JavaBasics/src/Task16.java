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

        if (userHand.equals(computerHand)) {
            System.out.println("Draw");
        } else if (userHand.equals("Rock") && computerHand.equals("Scissors")) {
            System.out.println("You win");
        } else if (userHand.equals("Paper") && computerHand.equals("Rock")) {
            System.out.println("You win");
        } else if (userHand.equals("Scissors") && computerHand.equals("Paper")) {
            System.out.println("You win");
        } else {
            System.out.println("Computer win");
        }
    }
}
