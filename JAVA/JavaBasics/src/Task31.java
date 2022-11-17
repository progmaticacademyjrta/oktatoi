import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[5];

        // alternative way
        /*
        randomNumbers[0]=random.nextInt(90)+1;
        randomNumbers[1]=random.nextInt(90)+1;
        randomNumbers[2]=random.nextInt(90)+1;
        randomNumbers[3]=random.nextInt(90)+1;
        randomNumbers[4]=random.nextInt(90)+1;
        */
        // Értékbeállítás
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(90) + 1;
        }

        // Értékkiírás
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
