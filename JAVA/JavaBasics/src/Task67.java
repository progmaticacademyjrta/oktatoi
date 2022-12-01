import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task67 {

    // Generate random resultSize amount of numbers from 1-maxValue
    public static Set<Integer> randomNumbers(int maxValue, int resultSize) {
        Set<Integer> result = new HashSet();
        Random random = new Random();

        while (result.size() != resultSize) {
            result.add(random.nextInt(maxValue) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> hatosLottoSzamok;
        Set<Integer> euroJackpoSzamok;

        hatosLottoSzamok = randomNumbers(90, 5);
        System.out.println("Hatos lotto szamok: " + hatosLottoSzamok);

        euroJackpoSzamok = randomNumbers(50, 5);
        Set<Integer> euroPart2 = randomNumbers(12, 2);

//    A ket intervallumban kapott random szamok kulon sorsolasnak
//    szamitanak, ezert egybe rakni nem erdemes
//    for (Integer current: euroPart2) {
//      euroJackpoSzamok.add(current);
//    }

//    Kollekcio hozzaadasa sethez - bonusz
//    euroJackpoSzamok.addAll(randomNumbers(12, 2));

        System.out.println("EuroJackpot 1-50: " + euroJackpoSzamok);
        System.out.println("EuroJackpot 1-12: " + euroPart2);

    }
}
