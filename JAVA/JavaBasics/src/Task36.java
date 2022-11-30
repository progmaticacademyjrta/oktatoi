public class Task36 {
    public static void main(String[] args) {
        int[] eggPrices = {105, 90, 70, 89, 95};
        double eggPricesSum = 0;

        for (int i = 0; i < eggPrices.length; i++) {
            eggPricesSum = eggPricesSum + eggPrices[i];    // ua. mint eggPricesSum +=  eggPrices[i]
        }
        double result = eggPricesSum / eggPrices.length;

        System.out.println("Average price of an egg: " + result);
    }
}
