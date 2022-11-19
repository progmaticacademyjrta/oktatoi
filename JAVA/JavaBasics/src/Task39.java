import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favoriteMovies = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Add your favorite movie and press ENTER");
            String userInput = scanner.nextLine();
            if (favoriteMovies.contains(userInput)) {            //eredmeny logikai true vagy false lesz
                System.out.println("Give me another one");
                i--;
            } else {
                favoriteMovies.add(userInput);
            }
        }

        System.out.println("List saved: ");
        for (String movie : favoriteMovies) {
            System.out.print(movie + ", ");
        }

    }
}
