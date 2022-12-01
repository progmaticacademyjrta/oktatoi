import java.util.Scanner;

public class Task68 {

    public static int[] getEggPricesFromUser(int numberOfInputs) {
        int[] result = new int[numberOfInputs];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfInputs; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int getNumberOfInputs() {
        System.out.println("Hany tojas arat akarsz megadni?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numberOfEggPrices = getNumberOfInputs();
        System.out.println("Add meg a tojas arakat!");
        int[] eggPrices = getEggPricesFromUser(numberOfEggPrices);
        System.out.println("Average egg price: " + getAverage(eggPrices) + "Ft");
    }
}
