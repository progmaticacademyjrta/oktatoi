import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task88 {
    /**
     * Készítsetek programot, amely beolvas egy híres sportolóat tartalmazó fájl,
     * majd megvizsgálja, hogy a parancssori argumentumként megadott sportolót tartalmazza-e.
     * Ha igen, írja ki hogy “It’s in the file”,
     * egyébként pedig írja ki, hogy “No luck” a konzolra.
     */
    public static void main(String[] args) {

        List<String> sportNamesList = new ArrayList<>();
        try {
            sportNamesList = Files.readAllLines(Path.of("src/resources/sport-names.txt"));
        } catch (IOException e) {
            System.out.println("Could find the file! :-( ");
        }
        System.out.println("File data:" + sportNamesList);

        try {
            if (sportNamesList.contains(args[0]))
                System.out.println("It’s in the file");
            else
                System.out.println("No luck");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no program arguments added.");
        }
    }
}
