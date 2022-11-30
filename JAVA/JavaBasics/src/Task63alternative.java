import java.util.Scanner;

public class Task63alternative {

    public static void main(String[] args) {
        int aoldal = getTriangleDataFromConsole();
        int boldal = getTriangleDataFromConsole();
        int coldal = getTriangleDataFromConsole();
        boolean result = isTriangeValid(aoldal, boldal, coldal);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {                  // result==true
            System.out.println("Triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static int getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("oldal:");
        int oldal = scanner.nextInt();
        return oldal;
    }

    public static boolean isTriangeValid(int a, int b, int c) {
        boolean isValid;
        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }

}
