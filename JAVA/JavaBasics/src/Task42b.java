import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task42b {
    public static void main(String[] args) {
        /*
         Írjatok programot, amely a megadott testhőmérsékleti adatokból, amit a felhasználó rögzített,

         b) hányszor volt lázas a bevitt adatok alapján a delikvens

         Az adatokat az utolsó 3 nap, napi 3 (reggeli, napközbeni és esti) adataival kell mindig rögzíteni,
         tehát mindig fix 9 testhőmérsékleti adatot.
         */
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("How many data would you like to add: ");
        int tempCount = scanner.nextInt();

        System.out.println("Add the body temperature for the last days and for each days: ");
        scanner = new Scanner(System.in);
        List<Double> temperatureList = new ArrayList<>();

        double sumTemperature = 0;
        int countFever = 0;

        // data feed
        for (int i = 0; i < tempCount; i++) {
            System.out.println("Add a temperature: ");
            double tempInput = scanner.nextDouble();
            if (temperatureList.contains(tempInput)) {
                System.out.println("Ez az adat szerepel már, biztos hozzá akarod adni megint? (Y/N)");
                String decision = scanner2.nextLine();
                if (decision.equals("Y"))
                    temperatureList.add(tempInput);
                else
                    i--;
            } else {
                temperatureList.add(tempInput);
            }
        }

        // calculation
        for (double temp : temperatureList) {
            sumTemperature += temp;
            if (38 < temp) {
                countFever++;
            }
        }

        System.out.println(temperatureList);
        System.out.println("Average temperature: " + sumTemperature / temperatureList.size());
        System.out.println("Count of fever occasions: " + countFever);
    }
}
