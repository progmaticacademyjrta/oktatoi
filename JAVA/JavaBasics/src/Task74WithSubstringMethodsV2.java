import java.util.Scanner;

public class Task74WithSubstringMethodsV2 {
    public static void main(String[] args) {
        int result = getTotalCount();
        System.out.println("Total count: " + result);
    }

    public static int getTotalCount() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int result = 0;
        do {
            System.out.println("Add the id with count: (7 length)");
            input = scanner.nextLine(); // pl.: "1376367"
            if (!input.equalsIgnoreCase("X")) {
                int calcCount = getCalculatedCount(input);
                result += calcCount;   // ua.: result = result + calcCount
            }
        } while (!input.equalsIgnoreCase("X"));
        return result;
    }

    public static int getCalculatedCount(String input) {
        String countAsString = input.substring(6);  // az előzőleg látott charAt csak addig jó, amíg a darabszámom 0-9 közötti, míg ez a megoldás akkor is működik ha az nagyobb
        int countAsInt = Integer.parseInt(countAsString);
        if (countAsInt == 0) {
            System.out.println("Count is 0!");
        }
        return countAsInt;
    }
}
