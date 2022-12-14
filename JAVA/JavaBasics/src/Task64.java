import java.util.Scanner;

public class Task64 {
    /**
     * Dolgozzátok át a számológép programot úgy,
     * hogy tartalmazzon külön metódust az adatokbekérésre a felhasználótól
     * ( getNumberFromUser() ),
     * valamint egyet az operátor beolvasásra (getOperatorFromUser() ).
     * <p>
     * Ezt követően egy külön metódust amely elvégzi a műveletet és
     * visszaadja az eredményt ( getCalculationResult(operator, number1,number2) ),
     * <p>
     * Végül egy metódust ami kiírja az eredményt a konzolra (showResultToTheUser(result) )
     */
    public static void main(String[] args) {
        String op = getOperatorFromUser();
        int num1 = getNumberFromUser();
        int num2 = getNumberFromUser();
        int result = getCalculationResult(op, num1, num2);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(int result) {
        System.out.println("Result: " + result);
    }

    public static int getCalculationResult(String operator, int number1, int number2) {
        int calculationResult = 0;
        if (operator.equals("*")) {
            calculationResult = number1 * number2;
        } else if (operator.equals("/")) {
            calculationResult = number1 / number2;
        } else if (operator.equals("-")) {
            calculationResult = number1 - number2; // itt szükség van a zárójelre a műveleti sorrend miatt
        } else if (operator.equals("+")) {
            calculationResult = number1 + number2;
        } else if (operator.equals("pumped")) {
            calculationResult = number1 * number1 * number1 * number2 * number2 * number2;
        } else {
            System.out.println("Unsupported operator. Please re-run!");
        }
        return calculationResult;
    }


    public static String getOperatorFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the operator first? (+ - * / pumped)");
        String operator = scan.nextLine();
        return operator;
    }

    public static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scan.nextInt();
        return number;
    }
}
