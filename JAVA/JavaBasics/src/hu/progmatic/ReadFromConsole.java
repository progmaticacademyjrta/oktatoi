package hu.progmatic;


import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        System.out.println("Give me your name");

        // Ez a sor egyszer kell ha beolvasni szeretnénk
        Scanner scanner = new Scanner(System.in);

        /*  az alábbi utasítasok közül válasszuk a nekünk megfelelőt,
            attól függően milyen értéket szeretnénk beolvasni
         */
        // beolvasás a console-ról String-ként
        String name = scanner.nextLine();
        // beolvasás a console-ról int-ként
        int number = scanner.nextInt();
        // beolvasás a console-ról boolean-ként
        boolean flag = scanner.nextBoolean();

        System.out.println("Hello " + name + "! Good to see you!");
        System.out.println("I also read " + number + " and " + flag + " from you!");
    }
}
