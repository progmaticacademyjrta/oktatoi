import java.time.LocalTime;

public class LocalTimeExamples {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime lunchStart = LocalTime.parse("12:00");
        System.out.println(lunchStart);
        LocalTime lunchEnd = LocalTime.of(13, 0);
        System.out.println(lunchEnd);

        if (!lunchStart.isAfter(now) && now.isBefore(lunchEnd)) {
            System.out.println("Lunch time");
        } else {
            System.out.println("It's not lunch time");
        }

    }
}
