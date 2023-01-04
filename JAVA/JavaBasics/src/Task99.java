import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task99 {
    /**
     * Érkezés munkába. Az egyik nagyvállalat, aki feljegyzi, hogy a dolgozói mikorra járnak be dolgozni
     * és hogy mikor távoznak szeretne egy elemzést készíteni.
     * Az elemzéshez összegyűjtötték a fejlesztők reggeli érkezésére vonatkozó adatokat egy listába.
     * A feladatunk, hogy írjunk egy programot, ami kiszámítja, hogy
     * a fejlesztők hány százaléka ment be az adott napon a 7-8, 8-9, 9-10, 10-11 időszakban.
     */
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "07:38", "07:53", "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:19", "07:54", "07:36", "08:39", "07:22", "08:58", "07:23",
                "07:40", "07:22", "07:06", "07:56", "07:26", "08:09", "07:30",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:14", "08:40", "07:50", "07:06", "07:39", "08:16", "07:26",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "07:13", "07:07", "08:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41",
                "08:15", "07:20", "07:29", "08:39", "07:58", "07:17", "07:18"
        );

        List<LocalTime> localTimeLogs = new ArrayList<>();
        for (String log : logs) {
            // String log = "07:38";
            localTimeLogs.add(LocalTime.parse(log));
        }

        System.out.println(localTimeLogs);
        int after7 = 0;
        int after8 = 0;
        int after9 = 0;
        int after10 = 0;
        for (LocalTime logTime : localTimeLogs) {
            // LocalTime logTime = 07:38
            if (logTime.getHour() == 7)
                after7++;
            else if (logTime.getHour() == 8)
                after8++;
            else if (logTime.getHour() == 9)
                after9++;
            else if (logTime.getHour() == 10)
                after10++;
            // System.out.println(logTime.getHour());
        }

        System.out.println("Count of entry for 7: " + after7);
        System.out.println("Count of entry for 8: " + after8);
        System.out.println("Count of entry for 9: " + after9);
        System.out.println("Count of entry for 10: " + after10);

        // System.out.println("Percentage of entry for 7: " + 100 * after7 / localTimeLogs.size() ); // működik, de csak egész százalékot ad vissza
        System.out.println("Percentage of entry for 7: " + (double) after7 / localTimeLogs.size() * 100 + "%");
        System.out.println("Percentage of entry for 8: " + (double) after8 / localTimeLogs.size() * 100 + "%");
        System.out.println("Percentage of entry for 9: " + (double) after9 / localTimeLogs.size() * 100 + "%");
        System.out.println("Percentage of entry for 10: " + (double) after10 / localTimeLogs.size() * 100 + "%");
    }
}
