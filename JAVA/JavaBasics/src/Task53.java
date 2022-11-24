import java.util.HashMap;
import java.util.Map;

public class Task53 {
    public static void main(String[] args) {
        /**
         * Készítsünk egy Map-et kedvenc gyümölcsökkel.
         * Adjunk hozzá a listához legalább 7 gyümölcsöt és egy értéket,
         * hogy mennyire szeretjük. Ez az érték 1-3 között lehet,
         * mely esetén a 3 amit jobban szeretünk.
         *
         * Foreach ciklus segítségével írassuk ki az elemeit a képernyőre egymás alá.
         */
        HashMap<String, Integer> fruitsMap = new HashMap<>();

        fruitsMap.put("melon",2);
        fruitsMap.put("apple",1);
        fruitsMap.put("banana",2);
        fruitsMap.put("mango",1);
        fruitsMap.put("raspberry",3);
        fruitsMap.put("orange",2);
        fruitsMap.put("strawberry",3);
        fruitsMap.put("melon",3);  // felülírja a 2-es értéket 3-asra

        System.out.println(fruitsMap);

        for (Map.Entry mapElement : fruitsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
    }
}
