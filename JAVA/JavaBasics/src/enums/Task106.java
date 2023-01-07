package enums;

import java.util.Scanner;

public class Task106 {
    public static void main(String[] args) {
        int boundaryValue = Integer.parseInt(args[0]);
        System.out.println("Please add your points: ");
        Scanner scanner = new Scanner(System.in);
        int userPoints = scanner.nextInt();

        System.out.print("Your result: ");
        if (userPoints >= boundaryValue)
            System.out.println(Evaluation.PASSED);
        else
            System.out.println(Evaluation.FAILED);
    }
}
