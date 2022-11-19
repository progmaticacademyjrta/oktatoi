public class Task34 {
    public static void main(String[] args) {
        /*
        Írjunk egy programot, amely egy array-ben elmenti a számokat 1-21-ig
        majd kiírja őket visszafele egymás után szóközzel elválasztva.
         */
        int[] numbers = new int[21];
        int numbersIndex = 0;

        for (int i = 1; i <= 21; i++) {
            numbers[numbersIndex] = i;
            numbersIndex++;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
