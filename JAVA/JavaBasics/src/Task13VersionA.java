import java.util.Random;

public class Task13VersionA {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int number1 = randomGenerator.nextInt(90) + 1;
        int number2 = randomGenerator.nextInt(90) + 1;
        int number3 = randomGenerator.nextInt(90) + 1;
        int number4 = randomGenerator.nextInt(90) + 1;
        int number5 = randomGenerator.nextInt(90) + 1;
        // ezen a ponton number1 pipa

        while (number2 == number1) {
            number2 = randomGenerator.nextInt(90) + 1;
        }
        // ezen a ponton number2 is pipa

        while (number3 == number1 || number3 == number2) {
            number3 = randomGenerator.nextInt(90) + 1;
        }
        // ezen a ponton number3 is pipa

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = randomGenerator.nextInt(90) + 1;
        }
        // ezen a ponton number4 is pipa

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = randomGenerator.nextInt(90) + 1;
        }
        // ezen a ponton number5 is pipa
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
    }
}
