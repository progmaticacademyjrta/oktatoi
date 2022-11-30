import java.util.Scanner;

public class Task63Alternativev2 {

    public static void main(String[] args) {
        int[] sidesArrays = getTriangleDataFromConsole();
        boolean result = isTriangeValid(sidesArrays);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {                  // result==true
            System.out.println("Triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static int[] getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        int aoldal = scanner.nextInt();
        System.out.println("boldal:");
        int boldal = scanner.nextInt();
        System.out.println("coldal:");
        int coldal = scanner.nextInt();
        int[] sidesArrays = {aoldal, boldal, coldal};

        return sidesArrays;
    }

    public static boolean isTriangeValid(int[] array) {
        int a = array[0];
        int b = array[1];
        int c = array[2];
        boolean isValid;
        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }

}
