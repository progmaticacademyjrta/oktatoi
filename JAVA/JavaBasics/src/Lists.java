import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Listák létrehozása
        List<String> randomNames = new ArrayList<>();
        List<Integer> randomNums = new ArrayList<>();
        List<Double> randomDoubleNums = new ArrayList<>();
        List<Boolean> randomBooleans = new ArrayList<>();

        // Listák feltöltése elemekkel
        randomNames.add("Viktor");
        randomNames.add("Elek");
        randomNums.add(5);
        randomDoubleNums.add(2.1);
        randomBooleans.add(false);

        // A lista egy elemének kiírása
        System.out.println(randomNames.get(0));
        System.out.println(randomNames.get(1));

        // Egész lista tartalmának kiírása
        System.out.println(randomNames);
    }
}
