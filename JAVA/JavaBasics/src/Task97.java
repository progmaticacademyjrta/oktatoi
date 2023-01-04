import java.time.LocalDate;

public class Task97 {
    public static void main(String[] args) {
        //2023. január 11
        LocalDate firstSaturday = LocalDate.of(2023, 1, 11);
        System.out.println(firstSaturday);

        int count = 1;
        LocalDate saturday = firstSaturday;
        while (count <= 12) {
            saturday = saturday.plusDays(7);
            System.out.println(saturday);   // alternative megoldás System.out.println(firstSaturday.plusDays(count*7));
            count++;
        }
    }
}
