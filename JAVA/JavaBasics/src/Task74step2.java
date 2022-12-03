import java.util.Scanner;

public class Task74step2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int result = 0;
        do {
            System.out.println("Add the id with count: (7 length)");
            input = scanner.nextLine(); // pl.: "1376367"
            if (!input.equalsIgnoreCase("X")) {     //az equalsIgnoreCase annyival tud többet mint a sima equals, hogy elfogadja ha valami csak kis és nagybetűben különbözik
                String countAsString = String.valueOf(input.charAt(6)); // a charAt által visszaadott char típusú értéket átalakítom String-é
                int countAsInt = Integer.parseInt(countAsString);
                if (countAsInt == 0) {
                    System.out.println("Count is 0!");
                } else {
                    result = result + countAsInt;      //ua.: result += countAsInt segítségébel összeadogatom a darabszámokat
                    System.out.println(countAsInt);
                }
            }
        } while (!input.equalsIgnoreCase("X"));

        System.out.println("Total count: " + result);
    }
}
