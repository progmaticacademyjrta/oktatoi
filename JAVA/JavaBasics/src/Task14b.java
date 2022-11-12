import java.util.Random;

public class Task14b {
    public static void main(String[] args) {
        // EUROJACKPOT 5 db szám 1-50 között és 2 db 1-12 között
        // a két csoport között lehet átfedés

        Random randomGenerator = new Random();
        // Az első mező számai
        int number1 = randomGenerator.nextInt(50) + 1;
        int number2 = 0, number3 = 0, number4 = 0, number5 = 0;

        while (number2 == number1 || number3 == number1 || number3 == number2 || number4 == number1 || number4 == number2 || number4 == number3 || number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number2 = randomGenerator.nextInt(50) + 1;
            number3 = randomGenerator.nextInt(50) + 1;
            number4 = randomGenerator.nextInt(50) + 1;
            number5 = randomGenerator.nextInt(50) + 1;
        }

        // A második mező számai
        int number6 = randomGenerator.nextInt(12) + 1;
        int number7 = randomGenerator.nextInt(12) + 1;
        while (number6 == number7) {
            number7 = randomGenerator.nextInt(12) + 1;
        }

        System.out.println("Az első mező lehetséges számai: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
        System.out.println("A második mező lehetséges számai: " + number6 + " " + number7);

    }
}
