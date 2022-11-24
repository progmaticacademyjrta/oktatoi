import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Task52 {
    public static void main(String[] args) {
        /**
         * Írjatok egy tippelő játék programot.
         * Töltsünk fel egy Set-et 3 darab random számmal.
         * A számok 0 és 10 között lehetnek (0-val, de 10-el nem).
         * A felhasználótól kérjünk be számokat hasonlóan 0 és 10 között és
         * vizsgáljuk meg benne van-e a Set-ben. Amennyiben igen, vegyük ki belőle.
         * Ha kiürült a Set, mert kivettünk belőle minden elemet, akkor vége a játéknak.
         *
         * a) Számoljuk, hogy hányszor kellett tippelnie a felhasználónak,
         * majd írjuk ki: “Gratulálunk, X kör kellett a sikerhez”.
         *
         * b) Ha eltalált egy számot a felhasználó a játék során,
         * akkor írja ki a program, hogy “Talált, még X szám, amit meg kell keresned”.
         */
        Set<Integer> computerNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int round = 0;

        while (computerNumbers.size() != 3) {
            int number = random.nextInt(10);
            System.out.println(number);
            computerNumbers.add(number);
        }

        int userInput = 0;
        while (!computerNumbers.isEmpty()) {
            userInput = scanner.nextInt();
            round++;
            if (computerNumbers.contains(userInput)) {
                computerNumbers.remove(userInput);
                System.out.println("Talált, még " + computerNumbers.size() + " szám, amit meg kell keresned");
            }
        }
        System.out.println("Gratulálunk, " + round + " kör kellett a sikerhez");
        System.out.println(computerNumbers);
    }
}
