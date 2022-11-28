import java.util.Random;

public class Methods {

    public static void main(String[] args) {
        int[] numbersWithValues = {1, 34, 2, 21};
        double atlagResult = atlag(4,2);

        vonal();
        vonal();
        System.out.println(atlagResult);
        vonal();
        printAge(20);
        vonal();
        int number = getRandomNumber();
        System.out.println(number);
        vonal();
        kiir(numbersWithValues);
        vonal();
        System.out.println("end");
        vonal();
        vonal();
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printAge(int age) {
        System.out.println(age*2 + " éves vagy.");
    }

    public static void kiir( int[] tomb ){
        for( int i = 0; i < tomb.length; i++ )
        {
            System.out.println(tomb[i]+" ");
        }
        System.out.println();
    }

    public static double atlag( int szam1, int szam2 ){
        double atl = (szam1+szam2 )/2.0;
        return atl;
    }

    public static void vonal() {
        System.out.println("----------");
    }

    public static int getRandomNumber(){
        Random randomGenerator = new Random();
        int number1 = randomGenerator.nextInt(100);
        return number1;
    }


}
