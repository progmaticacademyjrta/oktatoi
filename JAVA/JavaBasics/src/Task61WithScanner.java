import java.util.Scanner;

public class Task61WithScanner {
    /**
     * Készítsünk egy metódust, amely kapott szám esetén eldönti,
     * hogy az 18-nál nagyobb-e. Ha igen, kiírja hogy
     * “Elmúltál 18, jogosult vagy a belépésre!”,
     * egyébként pedig írja ki, hogy
     * “Nem vagy még 18, sicc innen!”
     */
    public static void main(String[] args) {
        decideAndPrintAdult();
        decideAndPrintAdult();
    }

    public static void decideAndPrintAdult() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg a korodat: ");
        int age = scan.nextInt();
        if (18 < age) {
            System.out.println("Elmúltál 18, jogosult vagy a belépésre!");
        } else {
            System.out.println("Nem vagy még 18, sicc innen!");
        }
    }
}
