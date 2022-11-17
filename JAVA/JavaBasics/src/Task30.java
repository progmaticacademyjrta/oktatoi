public class Task30 {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        /*  Alternative creation
        String[] weekdays2 = new String[7];
        weekdays2[0] = "Monday";
        weekdays2[1] = "Tuesday";
        weekdays2[2] = "Wednesday";
        weekdays2[3] = "Thursday";
        weekdays2[4] = "Friday";
        weekdays2[5] = "Saturday";
        weekdays2[6] = "Sunday";
         */

        System.out.println(weekdays.length);

        for (int valtozo = 0; valtozo < weekdays.length; valtozo++) {
            System.out.println(weekdays[valtozo]);
        }

        System.out.println("My favorite day is: " + weekdays[4]);

    }
}
