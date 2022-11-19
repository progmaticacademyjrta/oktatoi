import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        /*
         Írjatok programot, amely a megadott testhőmérsékleti adatokból, amit a felhasználó rögzített,

         a) listában tárolást követően kiszámolja mennyi volt az átlagos testhő
         b) hányszor volt lázas a bevitt adatok alapján a delikvens

         Az adatokat az utolsó 3 nap, napi 3 (reggeli, napközbeni és esti) adataival kell mindig rögzíteni,
         tehát mindig fix 9 testhőmérsékleti adatot.
         */
        System.out.println("Add the body temperature for the last 3 days and 3 for each days (last 9 in overall): ");
        Scanner scanner = new Scanner(System.in);

        List<Double> temperatureList = new ArrayList<>();

        double sumTemperature = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Add a temperature: ");
            double tempInput = scanner.nextDouble();
            temperatureList.add(tempInput);
            sumTemperature += tempInput;
        }
        System.out.println(temperatureList);
        System.out.println("Average temperature: " + sumTemperature / temperatureList.size());
    }
}
