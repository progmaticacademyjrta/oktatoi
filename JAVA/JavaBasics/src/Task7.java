import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Which day is today? 1-7");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();

        // Szelekciók 1-1 feltétellel
        if (dayOfWeek == 1) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else if (dayOfWeek == 2) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else if (dayOfWeek == 3) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else if (dayOfWeek == 4) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else if (dayOfWeek == 5) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else if (dayOfWeek == 6) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else if (dayOfWeek == 7) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else {
            System.out.println("Rerun and give number 1-7, please");
        }

        // Szelekciók VAGY feltételekkel
        if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 7) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        } else if (dayOfWeek == 4 || dayOfWeek == 5 || dayOfWeek == 6) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else {
            System.out.println("Rerun and give number 1-7, please");
        }
    }
}
