import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // a) solution with while
        int age = 0;
        while (age <= 0) {
            System.out.println("Add your age: ");
            age = scan.nextInt();
        }
        System.out.println("Age " + age + " saved with while only.");

        // b) solution with do - while
        age = 0;
        do {
            System.out.println("Add your age: ");
            age = scan.nextInt();
        } while (age <= 0);
        System.out.println("Age " + age + " saved with do-while.");
    }
}
