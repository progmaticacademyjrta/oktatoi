import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10);  // 0 lehet, de 10 már nem, a felső határt nem sorsolja ki sose

        System.out.println(randomNumber); // kiír egy véletlenszerű szamot 0,1,2,3,4,5,6,7,8,9 közül
    }
}
