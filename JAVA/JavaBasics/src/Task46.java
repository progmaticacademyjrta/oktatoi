import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task46 {
    public static void main(String[] args) {
        /*
        Készítsetek programot, amely kiírja azokat a számokat,
        amiket a legutolsó 300 lottó ötöslottó nyerőszámok (1-90)  között nem szerepel.
        A számokat nyugodtan tegyük egy listába a programunkban
        a List<Integer> winnerNumbers = Arrays.asList(31, 87, 6, 47, ...); módon.

        Az eredményt is mentsünk le egy notWinnerNumbers listába
        és írjuk ki a tartalmát a képernyőre
         */

        List<Integer> winnerNumbers = Arrays.asList(31, 87, 6, 47, 38, 44, 79, 16, 87, 76, 17, 13, 73, 13, 90, 77, 1, 25, 31, 61, 55, 13, 67, 88, 36, 59, 56, 67, 46, 34, 68, 90, 18, 28, 3, 55, 31, 45, 85, 43, 11, 9, 59, 78, 66, 71, 50, 18, 37, 50, 76, 22, 26, 33, 32, 52, 28, 45, 80, 64, 17, 57, 81, 67, 51, 21, 9, 5, 57, 15, 37, 69, 60, 59, 85, 18, 4, 62, 14, 46, 85, 42, 4, 87, 37, 90, 37, 5, 53, 74, 60, 70, 25, 77, 30, 21, 53, 6, 10, 25, 89, 10, 18, 78, 57, 18, 87, 66, 35, 38, 82, 54, 4, 46, 41, 4, 77, 74, 11, 50, 4, 85, 57, 71, 47, 68, 76, 23, 26, 10, 70, 15, 14, 34, 35, 59, 37, 63, 49, 26, 47, 22, 90, 19, 3, 90, 2, 63, 69, 81, 13, 29, 61, 82, 54, 69, 5, 7, 6, 36, 5, 50, 88, 42, 65, 22, 33, 74, 11, 9, 71, 14, 67, 56, 52, 80, 81, 66, 30, 48, 7, 49, 4, 13, 54, 42, 46, 61, 71, 35, 17, 56, 83, 76, 15, 48, 84, 74, 89, 33, 17, 28, 34, 36, 58, 81, 28, 23, 1, 87, 84, 5, 65, 61, 66, 5, 76, 54, 77, 52, 60, 56, 65, 90, 21, 10, 82, 56, 85, 85, 77, 88, 67, 83, 52, 8, 3, 2, 38, 78, 19, 24, 34, 6, 83, 37, 57, 50, 85, 74, 82, 24, 31, 4, 43, 70, 78, 3, 18, 30, 23, 18, 46, 10, 85, 56, 8, 68, 79, 46, 59, 4, 34, 30, 40, 5, 48, 74, 35, 69, 19, 7, 89, 35, 66, 79, 77);
        List<Integer> notWinnerNumbers = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
            // HA i benne van a winnerNumbers AKKOR i-t hozzáadom a notWinnerNumbers
        }

        System.out.println(notWinnerNumbers);
    }
}
