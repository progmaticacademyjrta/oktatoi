public class Task30WithArgs {
    public static void main(String[] args) {
        //String[] weekdays = {args[0], args[1], args[2], args[3], args[4], args[5], args[6]};

        String[] weekdays = new String[7];
        // Write all of the argument to the console
        for (int i = 0; i < args.length; i++) {
            weekdays[i] = args[i];
        }

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
