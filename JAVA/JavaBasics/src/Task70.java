import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task70 {
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
