package enums;

import java.util.Scanner;

public class Task109 {
    /**
     * Készítsetek programot, mely a beírt, magyar nyelvű hónapról eldönti,
     * hogy az melyik évszakban van. Készítsétek el a Month enumot,
     * melyben a hónapok magyar nyelvű megfelelői vannak.
     * <p>
     * A program vizsgálja meg switch-case segítségével a konzolról beírt értéket és
     * írja ki, hogy az tavasz, nyár, ősz vagy téli évszakba tartozik.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj egy hónapot és eldöntöm róla, mely évszakba tartozik: ");
        String userInput = scanner.nextLine();

        // ver 1
        /*
        Months userMonth;
        if (userInput.equals(Months.JANUÁR))
            userMonth = Months.JANUÁR;
        else if (userInput.equals(Months.FEBRUÁR))
            userMonth = Months.FEBRUÁR;
        else if (userInput.equals(Months.MÁRCIUS))
            userMonth = Months.MÁRCIUS;
        // ...

        // ver 1b
        switch (userInput) {
            case "JANUÁR":
                userMonth = Months.JANUÁR;
            case "FEBRUÁR":
                userMonth = Months.FEBRUÁR;
            case "MÁRCIUS":
                userMonth = Months.MÁRCIUS;
        }
        */

        //ver 2
        try {
            Months userMonth = Months.valueOf(userInput.toUpperCase());
            String season = null;
            switch (userMonth) {
                case DECEMBER, JANUÁR, FEBRUÁR:
                    season = "Tél";
                    break;
                case MÁRCIUS, ÁPRILIS, MÁJUS:
                    season = "Tavasz";
                    break;
                case JÚNIUS, JÚLIUS, AUGUSZTUS:
                    season = "Nyár";
                    break;
                case SZEPTEMBER, OKTÓBER, NOVEMBER:
                    season = "Ősz";
                    break;
            }

            System.out.println(userMonth + " egy " + season + "i hónap");
        } catch (IllegalArgumentException e) {
            System.out.println("Nem létező hónapot adtál meg! Az alábbiak közül válassz:");
            for (Months month : Months.values()) {
                System.out.print(month + ", ");
            }
        }
    }
}
