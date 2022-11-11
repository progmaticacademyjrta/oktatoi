import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Szia! Kapni fogsz egy szerencsesütit:");

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);

        if (randomNumber == 0) {
            System.out.println("Minden nap új nap.");
        } else if (randomNumber == 1) {
            System.out.println("Aki korán kel, aranyat lel");
        } else if (randomNumber == 2) {
            System.out.println("Jobb ma két sör, mint holnap egy");
        } else if (randomNumber == 3) {
            System.out.println("A kemény munka mindig kifizetődik");
        } else if (randomNumber == 4) {
            System.out.println("Az élet egy játék, de játszani tudni kell");
        } else {
            System.out.println("Nem lehetséges opció, mert minden lehetséges szam fentebb kezelve van.");
        }
    }
}
