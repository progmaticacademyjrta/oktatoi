import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task101 {
    /**
     * Készítsetek egy alkalmazást, amely a konzolról bekért dátumot leellenőrzi
     * és ha érvényes, valid dátum akkor írj ki hogy “Valid datetime.”,
     * egyébként pedig hogy “Invalid datetime.”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a datetime and press an ENTER: ");
        String inputdate = scanner.nextLine();

        try {
            LocalDateTime date = LocalDateTime.parse(inputdate);
            System.out.println("Hurray valid datetime!");
        } catch (DateTimeParseException dateTimeParseException) {
            System.out.println("Invalid datetime! :-/");
        }
    }
}
