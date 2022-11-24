import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        System.out.println("----------  Capital cities example START ----------");
        HashMap<String, String> capitalCities = new HashMap<>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("Countries with their capital cities: " + capitalCities);

        for (String capital : capitalCities.keySet()) {
            if (capitalCities.get(capital).equals("London")) {
                System.out.println("Benne van London!");
            }
        }
        System.out.println("----------  Capital cities example END ----------");

        System.out.println("----------  Salary story example START ----------");
        // Salary store example
        Map<String, Integer> salaryStore = new HashMap<>();
        List<String> salarywith600k = new ArrayList<>();

        salaryStore.put("Viktor", 600000);
        salaryStore.put("Emánuel", 600000);
        salaryStore.put("Zsolt", 200000);
        salaryStore.put("Győző", 900000);
        salaryStore.put("Győző", 950000);

        System.out.println("Salary store:" + salaryStore);
        System.out.println("Győző's salary: " + salaryStore.get("Győző")); // visszaadja a kulcshoz tartozó értéket

        for (Map.Entry mapElement : salaryStore.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            if (mapElement.getValue().equals(600000))  // melyek azok az elemek amiknek az értéke 600000
                salarywith600k.add(mapElement.getKey() + " user");  //elmentem egy külön erre a célra létrehozott listába ezeket a kulcsokat
        }
        System.out.println("Users with 600k salary: " + salarywith600k); // kiírom a külön lementett kulcsokat tartalmazó listát
        System.out.println("----------  Salary story example END ----------");
    }
}
