import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st player name:");
        String player1 = scanner.nextLine();
        System.out.println("2st player name:");
        String player2 = scanner.nextLine();

        int player1Total = 0, player2Total = 0;
        Random randomGenerator = new Random();

        int round = 1;
        while (round <= 4) {
            int player1ActualNumber = randomGenerator.nextInt(6) + 1;
            int player2ActualNumber = randomGenerator.nextInt(6) + 1;
            if (round == 4) {
                player1Total = player1Total + player1ActualNumber * 2;
                player2Total = player2Total + player2ActualNumber * 2;
            } else {
                player1Total = player1Total + player1ActualNumber;
                player2Total = player2Total + player2ActualNumber;
            }
            round++;
        }

        if (player1Total > player2Total) {
            System.out.println(player1 + " won.");
        } else if (player2Total > player1Total) {
            System.out.println(player2 + " won.");
        } else {
            System.out.println("Draw.");
        }
    }
}
