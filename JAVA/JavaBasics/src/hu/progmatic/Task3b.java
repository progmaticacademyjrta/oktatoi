package hu.progmatic;

import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        a = a *3;

        System.out.println("Give me another number:");
        int b = scanner.nextInt();

        int result = (a * 3) * b; /// “a” és “b” szorzata, miután megszoroztuk az “a”-t 3
        System.out.println("The result is: " + result);
    }
}
