package hu.progmatic;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        System.out.println("Give me your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // a name változó értéke lesz amit beírtunk a console-ra

        System.out.println("Hello " + name + "! Good to see you!");
    }
}
