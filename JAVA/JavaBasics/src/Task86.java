import java.util.Scanner;

public class Task86 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            System.out.println("10. intexen levo karakter: " + input.charAt(10));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Tul rovid volt a megadott string...");
        }
    }
}
