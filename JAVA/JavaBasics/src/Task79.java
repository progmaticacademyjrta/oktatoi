import java.util.Scanner;

public class Task79 {
    /**
     * Tételezzük fel, hogy valamit választania kell a felhasználónak a,b,c. lehetőség közül.
     * Készítsünk olyan metódus, amely ezt a konzolról beolvasott értéket feldolgozza és
     * csak az első karaktert adja vissza, mint felhasználói választás.
     * <p>
     * Elkerülve, hogy a felhasználó pontot, zárójelet, szóközt vagy bármi mást ír véletlenül az opciója után.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Selected user option: " + getUserOptionFromConsole());
    }

    public static String getUserOptionFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an option (a,b,c):");
        String userInput = scanner.nextLine();
        //String userOption = String.valueOf(userInput.charAt(0));
        String userOption = userInput.substring(0,1);
        if (!userOption.equals("a") && !userOption.equals("b") && !userOption.equals("c"))
            return "-";
        else
           return userOption;

        /*  ugyanaz az eredmeny mint a fentinél
        if (userOption.equals("a") || userOption.equals("b") || userOption.equals("c"))
            return userOption;
        else
            return "-";
       */
    }
}
