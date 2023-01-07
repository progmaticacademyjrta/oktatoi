package enums;

import java.util.Scanner;

public class Task109alternative {
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
        try {
            Months userMonth = Months.valueOf(userInput.toUpperCase());
            Seasons season = null;
            switch (userMonth) {
                case DECEMBER, JANUÁR, FEBRUÁR:
                    season = Seasons.TÉL;
                    break;
                case MÁRCIUS, ÁPRILIS, MÁJUS:
                    season = Seasons.TAVASZ;
                    break;
                case JÚNIUS, JÚLIUS, AUGUSZTUS:
                    season = Seasons.NYÁR;
                    break;
                case SZEPTEMBER, OKTÓBER, NOVEMBER:
                    season = Seasons.ŐSZ;
                    break;
            }

            System.out.println(userMonth + " egy " + season + "-i hónap");
        } catch (IllegalArgumentException e) {
            System.out.println("Nem létező hónapot adtál meg! Az alábbiak közül válassz:");
            for (Months month : Months.values()) {
                System.out.print(month + ", ");
            }
        }
    }
}
