import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task91 {
    /**
     * Készítsetek egy élelmiszerkészlet alkalmazást. Tegyünk fel, hogy van egy fájl,
     * ami tartalmazza, hogy éppen milyen típusú élelmiszerből mennyi van otthon
     * és hogy mennyi az ajánlott mennyiség.
     * <p>
     * A fájl hasonlóan néz ki a ehhez (actual-food-set.csv):
     * Name,Amount, Required Amount
     * Coffee, 17, 25
     * Milk, 0, 3
     * Cola, 1, 2
     * Orange, 4, 5
     * Oat flakes, 2, 4
     * <p>
     * A feladat, hogy készítsünk egy programot, ami értesít minket arról,
     * hogyha valamelyik komponensből 50%, vagy annál kevesebb van, és szól,
     * hogy vegyünk belőle annyit amennyi hiányzik az ajánlott mennyiség eléréséhez.
     */
    public static void main(String[] args) {
        String filename = args[0];
        System.out.println("Filename: "+ filename);

        List<String> foodStateList = getFoodStateList(filename);

        foodStateList.remove(0);  // a csv fájl első sorát, fejlécet távolítja el
        for (String foodState : foodStateList) {
            // foodState = "Coffee, 17, 25" //egy listaelem az egy sor a fájlban
            // System.out.println(foodState);
            // foodState = "Coffee,17,25" // kell eredmény legyen mint String, mert a szóközöket ki kell venni
            // String newFoodState = foodState.replaceAll(" ","");
            // System.out.println(newFoodState);
            // System.out.println(foodState.replaceAll(" ",""));
            // String[] rowArray = newFoodState.split(",");
            String[] rowArray = foodState.split(",");
            String name = rowArray[0].trim();
            int amount = Integer.parseInt(rowArray[1].trim());
            int reqAmount = Integer.parseInt(rowArray[2].trim());

            if (amount <= reqAmount / 2)
                System.out.println("Your " + name + " amount less or equal than a required 50%. Please buy: " + (reqAmount - amount));
            // System.out.println(rowArray[2]);
            //break;
        }

    }

    public static List<String> getFoodStateList(String fileName) {
        List<String> foodStateList = new ArrayList<>();

        try {
            foodStateList = Files.readAllLines(Path.of(fileName ));
            //System.out.println("File contains: " + foodStateList);
            //System.out.println(foodStateList.get(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodStateList;
    }
}
