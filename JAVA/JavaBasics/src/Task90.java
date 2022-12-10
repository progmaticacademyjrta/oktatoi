import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task90 {
    /**
     * Készítsétek el a classic bevásárlólista alkalmazást egyszerűsített változatát,
     * amely beolvas a konzolról tételek és darabszámokat (pl.: “tej 3db”).
     * <p>
     * Ezen tételeket mentsük el egy String elemű listában.
     * <p>
     * Készítsünk egy metódust, amely a paraméterül kapott String-et kiírja egy shoppinglist.txt-be.
     * (Tehát a listát át kell alakítani, összefűzni egy hosszú Stringgé egy elválasztó karakter,
     * pl vessző használatával)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> shoppingList = new ArrayList<>();
        do {
            System.out.println("Shopping item: ");
            String item = scan.nextLine();
            shoppingList.add(item);
        } while (shoppingList.size() != 3);

        // 1) menjünk végig a listán és minden elem esetén menjtsük el / fűzzük hozzá azt egy String változóba
        String content = "";
        for (String shoppingItem : shoppingList) {
            //shoppingItem = "tej 3db";
            content += shoppingItem + System.lineSeparator();  // új sor karaktert fűz a Stringhez az előzetesen itt lévő ", " vesszős megoldás helyett
        }

        writeShoppingListToFile(content);
    }

    public static void writeShoppingListToFile(String item) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add the name of the file:");
        String fileName = scan.nextLine();

        System.out.println("I will save: " + System.lineSeparator() + item + "to the " + fileName + ".txt file.");
        // 2) fájlba írás elkészítése
        try {
            new File("src/resources/savedfiles").mkdirs(); // új mappa létrehozása a projectben amennyiben még nem létezik
            Files.writeString(Path.of("src/resources/savedfiles/" + fileName + ".txt"), item);
            System.out.println("File saved.");
        } catch (IOException e) {
            System.out.println("Couldn't save the following file: " + e.getMessage());
        }
    }

}
