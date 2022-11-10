package hu.progmatic;

import java.util.Scanner;

public class Task2b {
    public static void main(String[] args) {
        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        String aFromUser = scanner.nextLine();

        System.out.println("Give me another number:");
        String bFromUser = scanner.nextLine();

        int a  = Integer.parseInt(aFromUser);
        int b  = Integer.parseInt(bFromUser);
        int result = a % b;

        System.out.println( result);
    }
}
