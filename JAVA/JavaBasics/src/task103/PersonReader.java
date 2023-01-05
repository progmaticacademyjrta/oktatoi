package task103;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonReader {
    public static void main(String[] args) {
//    Person p = new Person("first", "last", "place",
//        LocalDate.now(), Arrays.asList("c", "a"), true, 189);
//    System.out.println(p);
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = scanner.nextLine();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Place of birth: ");
        String placeOfBirth = scanner.nextLine();

        System.out.println("Time of birth(YYYY-MM-DD): ");
        LocalDate timeOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.println("Favorite movies(separated by: ','): ");
        String moviesInput = scanner.nextLine();
        List<String> movies = Arrays.asList(moviesInput.split(","));

        System.out.println("Is Happy(Y/N): ");
        String happyInput = scanner.nextLine();
        boolean happy;
        happy = happyInput.equalsIgnoreCase("y");

        System.out.println("Height: ");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println("Weight(Optional): ");
        int weight;
        try {
            weight = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            weight = 0;
        }

        System.out.println("Number Of Yearly BlackOut(Optional): ");
        String blackOutInput = scanner.nextLine();
        int numberOfYearlyBlackOut;
        if (!blackOutInput.equals("")) {
            numberOfYearlyBlackOut = Integer.parseInt(blackOutInput);
        } else {
            numberOfYearlyBlackOut = 0;
        }

        Person personFromInput = new Person(firstName, lastName, placeOfBirth,
                timeOfBirth, movies, happy, height);

        if (weight != 0) {
            personFromInput.setWeight(weight);
        }

        if (numberOfYearlyBlackOut != 0) {
            personFromInput.setNumberOfYearlyBlackOut(numberOfYearlyBlackOut);
        }

        System.out.println(personFromInput);
    }
}
