import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Hello give me 6 name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(6);
        if (randomNumber==0){
            System.out.println(name);
        }else if(randomNumber==1){
            System.out.println(name1);
        }else if(randomNumber==2){
            System.out.println(name2);
        }else if(randomNumber==3){
            System.out.println(name3);
        }else if(randomNumber==4){
            System.out.println(name4);
        }else{
            System.out.println(name5);
        }
    }
}
