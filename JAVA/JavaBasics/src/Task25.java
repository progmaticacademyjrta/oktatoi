import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        System.out.println("Which day is today? 1-7");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();

        // Szelekciók VAGY feltételekkel
        /*
        if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 7) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else if (dayOfWeek == 4 || dayOfWeek == 5 || dayOfWeek == 6) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else {
            System.out.println("Rerun and give number 1-7, please");
        }
        */

        // TASK - rewrite the expression above with the usage of switch-case
        switch (dayOfWeek) {
            case 1, 2, 3, 7:
                System.out.println("Ez nem a Te napod, majd talán holnap");
                break;
            case 4, 5, 6:
                System.out.println("Italos nap van, ide a citromos sört de gyorsan");
                break;
            default:
                System.out.println("Rerun and give number 1-7, please");
        }
    }
}
