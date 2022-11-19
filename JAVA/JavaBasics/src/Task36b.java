import java.util.Scanner;

public class Task36b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add how many egg price do you want to store: ");
        int eggCount = scanner.nextInt();

        int[] eggPrices = new int[eggCount];
        double eggPricesSum = 0;

        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("Add a price for an egg: ");
            eggPrices[i] = scanner.nextInt();
        }

        for (int i = 0; i < eggPrices.length; i++) {
            eggPricesSum = eggPricesSum + eggPrices[i];    // ua. mint eggPricesSum +=  eggPrices[i]
        }

        double result = eggPricesSum / eggPrices.length;
        System.out.println("Average price of an egg: " + result);
    }
}
