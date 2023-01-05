import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentMilisExamples {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis(); //UTC aktuális idő (GMT+0)
        System.out.println(milliseconds);

        LocalDateTime date =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(milliseconds), ZoneId.systemDefault());
        System.out.println(date);
    }
}
