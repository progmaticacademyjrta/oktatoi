import java.util.InputMismatchException;
import java.util.Scanner;

public class Task85b {
    /**
     * Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot a konzolról,
     * a nextInt() metódus segítségével.
     * Próbáljátok ki milyen exception érkezik, ha futtatáskor szám helyett valami szöveget írtuk.
     * <p>
     * Ha megvan az exception neve,
     * <p>
     * a) akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt
     * az exceptiont és kiírjátok a konzolra az alábbi üzenetet:
     * "You added a string, only number please!"
     * <p>
     * b) Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és
     * a hívás helyén a main-ben kapjátok el
     * <p>
     * c)(extra) mindaddig kérjen be a felhasználótól adatot, amíg számot nem ad
     */
    public static void main(String[] args) {
        int result = 0;
        boolean requestInput = true;
        while (requestInput) {
            try {
                result = getNumberFromConsole();
                requestInput = false;
            } catch (InputMismatchException exception) {
                requestInput = true;
                System.out.println("You added a string, only number please!");
            }
        }
        if (result != 0)
            System.out.println(result);
    }

    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
}
