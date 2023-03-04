import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FoodManager {

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("You must give one file with the food amounts.");
        }
        String actualFoodSetFile = args[0];

        try {
            List<String> lines = Files.readAllLines(Paths.get(actualFoodSetFile));
            lines = lines.subList(1, lines.size());
            for (String line : lines) {
                String[] values = line.split(",");
                String foodName = values[0].trim();
                int amount = Integer.valueOf(values[1].trim());
                int requiredAmount = Integer.valueOf(values[2].trim());

                if (amount <= requiredAmount * 0.5) {
                    int amountToBuy = requiredAmount - amount;
                    System.out.println("Buy " + amountToBuy + " " + foodName);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
