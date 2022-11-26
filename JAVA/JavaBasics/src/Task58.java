import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task58 {
    public static void main(String[] args) {
        /**
         * Készítsetek programot, ami összeszámolja a dolgozói szavazatokat amely a karácsonyi party
         * helyszínével kapcsolatos. Szerencsére egy gyakornok összegyűjtötte a szavazatokat egy Listába.
         *
         * a) Írjuk ki a képernyőre a szavazás eredményét az alábbi példának megfelelően:
         *    “Borkonyha - 11 szavazat”
         *
         * b) Hány Michelin csillagos étterem van? Hány szavazat érkezett?
         *
         * c) Tételezzük fel, hogy az Essencia jelezte, hogy nem tudják fogadni a céget.
         *    Távolítsuk el őket az eredmény Map-ből
         */

        List<String> restaurantVotesList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");
        HashMap<String, Integer> restaurantVoteResultsMap = new HashMap<>();

        for (String restaurant : restaurantVotesList) {
            if (restaurantVoteResultsMap.containsKey(restaurant)) {
                int originalVote = restaurantVoteResultsMap.get(restaurant);
                restaurantVoteResultsMap.put(restaurant, originalVote + 1);
            } else {
                restaurantVoteResultsMap.put(restaurant, 1);
            }
        }

        // task a - foreach for println
        for (Map.Entry mapElement : restaurantVoteResultsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }

    }
}
