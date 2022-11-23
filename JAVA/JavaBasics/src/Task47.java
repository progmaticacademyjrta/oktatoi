import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task47 {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>(
                Arrays.asList("Rumour", "Babel", "Babel", "Babel", "Babel", "Babel",
                        "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel",
                        "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel",
                        "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour",
                        "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour",
                        "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour"));

        int rumourVotes = 0;
        int babelVotes = 0;

        System.out.println("Counting votes...");
        for (int i = 0; i < places.size(); i++) {
            String currentPlace = places.get(i);
            if (currentPlace.equals("Rumour")) {
                rumourVotes++;
            } else if (currentPlace.equals("Babel")) {
                babelVotes++;
            }
        }

        if (rumourVotes > babelVotes) {
            System.out.println("Rumour Won!");
        } else if (babelVotes > rumourVotes) {
            System.out.println("Babel Won!");
        } else {
            System.out.println("Draw!");
        }
        System.out.println("Babel votes: " + babelVotes);
        System.out.println("Rumour votes: " + rumourVotes);
    }
}
