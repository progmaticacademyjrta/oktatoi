public class Task9ab {
    public static void main(String[] args) {
        // Solution a)
        int number = 0;
        while (number <= 20) {
            System.out.print(number * number + " ");
            number++;
        }
        System.out.println();

        // Solution b)
        for (int numberFor = 0; numberFor <= 20; numberFor++) {
            System.out.print(numberFor * numberFor + " ");
        }
    }
}
