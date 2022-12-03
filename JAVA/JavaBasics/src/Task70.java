import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task70 {
    /**
     * Adott egy neveket tartalmazó lista.
     * Készítsünk egy programot, ami készít egy újabb listát a meglévő nevekből
     * nagybetűre módosítva azok minden betűjét.
     * Miután elkészítettük az új listát írjuk ki annak tartalmát.
     * Nem szükséges for ciklust használnunk a végeredmény kiíratásához,
     * elég ha a listát odaadjuk a System.out.println() metódusnak.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zsolt", "Viktor", "Jimmy", "Ronaldo");
        List<String> namesWithUpperCase = new ArrayList<>();

        for (String name :names) {
            namesWithUpperCase.add(name.toUpperCase());
        }

        System.out.println(names);
        System.out.println(namesWithUpperCase);
    }
}
