import java.util.Scanner;

public class Task63 {
    // osztály szintű változók
    static int aoldal = 0;   // static kulcsszó kell, hogy látszódjon az adott osztályban mindenhol
    static int boldal = 0;
    static int coldal = 0;

    public static void main(String[] args) {
        getTriangleDataFromConsole();
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

    public static void getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        aoldal = scanner.nextInt();
        System.out.println("boldal:");
        boldal = scanner.nextInt();
        System.out.println("coldal:");
        coldal = scanner.nextInt();
    }

    public static boolean isTriangeValid(int a, int b, int c) {
        boolean isValid;
        isValid = (aoldal + boldal) > coldal &&
                (aoldal + coldal) > boldal &&
                (boldal + coldal) > aoldal;
        return isValid;
    }

}
