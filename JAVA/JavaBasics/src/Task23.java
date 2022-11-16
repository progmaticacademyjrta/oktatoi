import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        System.out.println("Szia! Kapni fogsz egy szerencsesütit:");

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);

        switch (randomNumber) {
            case 0:
                System.out.println("Minden nap új nap.");
                break;
            case 1:
                System.out.println("Aki korán kel, aranyat lel");
                break;
            case 2:
                System.out.println("Jobb ma két sör, mint holnap egy");
                break;
            case 3:
                System.out.println("A kemény munka mindig kifizetődik");
                break;
            case 4:
                System.out.println("Az élet egy játék, de játszani tudni kell");
                break;
            default:
                System.out.println("Nem lehetséges opció, mert minden lehetséges szam fentebb kezelve van.");
        }
    }
}
