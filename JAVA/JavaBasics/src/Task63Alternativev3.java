import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task63Alternativev3 {

    public static void main(String[] args) {
        List<Integer> sidesList = getTriangleDataFromConsole();
        boolean result = isTriangeValid(sidesList);
        showResultToTheUser(result);

        // a fenti 3 utasítás egyben
        // showResultToTheUser(isTriangeValid(getTriangleDataFromConsole()));
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {                  // result==true
            System.out.println("Triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static List<Integer> getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        int aoldal = scanner.nextInt();
        System.out.println("boldal:");
        int boldal = scanner.nextInt();
        System.out.println("coldal:");
        int coldal = scanner.nextInt();
        List<Integer> sidesList = Arrays.asList(aoldal,boldal,coldal);
        /*
        List<Integer> sidesList = new ArrayList<>();
        sidesList.add(aoldal);
        sidesList.add(boldal);
        sidesList.add(coldal);
        */
        return sidesList;
    }

    public static boolean isTriangeValid(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        boolean isValid;
        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }

}
