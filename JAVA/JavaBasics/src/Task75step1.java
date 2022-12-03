import java.util.Arrays;
import java.util.List;

public class Task75step1 {
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
        List<String> testruns = Arrays.asList("00171", "0018X", "00190", "00111", "00101", "0007X");
        // String testrun = testruns.get(0); //testrun = 00171
        int passCount = 0;
        int skipCount = 0;
        int failedCount = 0;
        for (String testrun : testruns) {
            String executionResult = testrun.substring(4); //00171 -ből csak az utolsó értéket kivágni
            switch (executionResult) {
                case "1":
                    passCount++;  //ua: passCount=passCount+1 ill passCount+=1
                    break;
                case "X":
                    skipCount++;
                    break;
                case "0":
                    failedCount++;
                    break;
                default:
                    System.out.println("Incorrect execution result");
            }
        }
        System.out.println("Total test case number: " + testruns.size());
        System.out.println("Count of passed: " + passCount);
        System.out.println("Count of failed: " + skipCount);
        System.out.println("Count of skipped: " + failedCount);

        // version 1
        //double passRatio = (double) passCount / testruns.size();
        //System.out.println(passRatio * 100 + " %");

        // version 2
        System.out.println("Pass ratio: " + passCount * 100 / testruns.size() + "%");
        System.out.println("Failed ratio: " + failedCount * 100 / testruns.size() + "%");
        System.out.println("Skipped ratio: " + skipCount * 100 / testruns.size() + "%");

    }
}
