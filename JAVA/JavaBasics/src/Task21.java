import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // FELADAT - ismételje az utasításokat addig a program,
        // amíg nem lesz szerkeszthető a háromszög

        boolean rerun=true;
        // CIKLUS ELEJE
        while (rerun) {    // rerun==true
            System.out.println("aoldal:");
            int aoldal = scanner.nextInt();
            System.out.println("boldal:");
            int boldal = scanner.nextInt();
            System.out.println("coldal:");
            int coldal = scanner.nextInt();

            if ((aoldal + boldal) > coldal &&
                    (aoldal + coldal) > boldal &&
                    (boldal + coldal) > aoldal) {
                System.out.println("Triangle");
            } else {
                System.out.println("Not a triangle");
            }
        }
        // CIKLUS VEGE
    }
}
