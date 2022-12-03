import java.util.Arrays;
import java.util.List;

public class Task75step0 {
    /**
     * Készítsetek teszteset futási összesítő alkalmazást.
     * A futási eredmények az alábbi formában tároljuk le egy ArrayList-ben
     * vagy konzolról beolvasva kapjuk.
     * <p>
     * Minden teszteset futás kezdődik egy 4 számjegyű számmal,
     * majd egy 1-es ha PASS, X ha SKIP, valamint 0 ha FAILED.
     * Egy példa adat tehát: 00171
     * <p>
     * A feladat, hogy számoljuk össze
     * a) Összesen hány teszteset került futtatásra?
     * b) Mennyi volt PASS? SKIP? FAILED?
     * c) Jelenítsük meg az adatokat százalékos formában is
     */
    public static void main(String[] args) {
        List<String> testruns = Arrays.asList("00171", "0018X");
        String testrun = testruns.get(0); //testrun = 00171
        int passCount = 0;
        int skipCount = 0;
        int failedCount = 0;
        String executionResult = "1"; //00171 -ből csak az utolsó értéket kivágni
        switch (executionResult) {
            case "1":
            case "X":
            case "0":
            default:
        }

    }
}
