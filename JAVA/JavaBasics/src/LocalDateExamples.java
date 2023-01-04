import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateExamples {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // az aktuális dátumot elmentem egy változóban
        System.out.println(now);

        LocalDate firstDayOfThisYear = now.withDayOfYear(104); // mely dátumra esik a ()-ben lévő indexű nap
        System.out.println(firstDayOfThisYear);

        DayOfWeek dayOfWeek = firstDayOfThisYear.getDayOfWeek(); //visszaadja, hogy az adott dátum a hét mely napjára esik
        System.out.println(dayOfWeek);

        LocalDate deliveryDate = now.plusDays(3);
        System.out.println("Megrendelésed " + deliveryDate + ".-e előtt kiszállítjuk, ami " + deliveryDate.getDayOfWeek() + ".");

        int number = Integer.parseInt("21");
        LocalDate date = LocalDate.parse("1992-05-22");
        System.out.println("1992-05-22 was " + date.getDayOfWeek());
        LocalDate date2 = LocalDate.of(1996, 5, 15);
        System.out.println("1996-05-15 was " + date2.getDayOfWeek());

    }
}
