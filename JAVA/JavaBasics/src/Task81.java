import java.util.Scanner;

public class Task81 {
    /**
     * Írjunk programot, amely a beolvasott szövegben
     * lecseréli a “legrosszabb” szót, a “legjobb”-ra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the text: ");
        String text = scanner.nextLine();
        System.out.println("Add the text what you looking for: ");
        String oldvalue = scanner.nextLine();
        System.out.println("Add the new value for that: ");
        String newvalue = scanner.nextLine();

       // "Ez egy nagyon rossz nap ezen a rossz héten".replaceAll("rossz","jó");
        String result = text.replaceAll(oldvalue,newvalue);
        System.out.println(result);

        /*
         * "Ez egy teszt ".trim() esetén csak a szöveg végi szóköz kerül eltávolításra
         * "Ez egy teszt ".replaceAll(" ","") esetén csak a szöveg végi szóköz kerül eltávolításra
         */
    }
}
