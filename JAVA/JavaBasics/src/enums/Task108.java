package enums;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task108 {
    /**
     * Készítsünk egy alkalmazást, mely az aktuális napról eldönti,
     * hogy az italos nap-e vagy sem. A napok vizsgálatához használjunk
     * switch-case-t.
     */
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DayOfWeek actualDay = now.getDayOfWeek();

       // if(actualDay.equals(DayOfWeek.FRIDAY))
        switch (actualDay){
            case MONDAY,TUESDAY, WEDNESDAY,SUNDAY:
                System.out.println(CanWeDrink.NO_LUCK + " :-(");
                break;
            default:
                System.out.println("Yeah " + CanWeDrink.DRINKDAY);
                break;
        }
    }

    enum CanWeDrink{
        NO_LUCK,DRINKDAY
    }
}
