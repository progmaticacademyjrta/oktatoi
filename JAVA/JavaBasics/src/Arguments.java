public class Arguments {
    public static void main(String[] args) {
        // Save the 1st element of the arguments into a variable
        String nameOfTheKing = args[0];
        // Save the 2st element of the arguments into a variable
        String nameOfTheMonkey = args[1];

        // Write all of the argument to the console
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Use the saved variable for a new println
        System.out.println("Hello " + nameOfTheKing);
    }
}
