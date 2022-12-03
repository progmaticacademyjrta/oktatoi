import java.util.Scanner;

public class Task76 {
    /**
     * Készítsünk egy konzolról beolvasó metódust,
     * amely a beírt szöveget Stringként beolvassa és eltávolítja a felesleges szóközöket
     * belőle, majd visszaadja azt.
     * <p>
     * Építsünk bele olyan logikák, hogy ha 0 hosszú a bevitt kifejezés,
     * akkor írjon ki a konzolra hibaüzenetet.
     */
    public static void main(String[] args) {
        String result = getTrimmedTextFromConsole();
        System.out.println(result);
    }

    /**
     * Remove spaces from the beginning and the end of the console input
     * @return trimmed console input String
     */
    public static String getTrimmedTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String result = "";
        if (userInput.length() == 0) {
            System.out.println("Wrong input data! ");
        } else {
            result = userInput.trim();
        }
        return result;
    }
}
