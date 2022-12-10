import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task94 {
    /**
     A task64 megoldása alapján bővítsétek ki a számológép működését,
     hogy amit a felhasználó számol és annak eredménye kerüljön
     elmentésre egy naplófájlként. (calculator.log) néven
     */
    public static void main(String[] args) {
        String op = getOperatorFromUser();
        int num1 = getNumberFromUser();
        int num2 = getNumberFromUser();
        int result = getCalculationResult(op, num1, num2);
        showResultToTheUser(result);
        // RESULT kiírása fájlba!
        writeCalculationLog(String.valueOf(result));  // Stringgé alakítja az int-et
    }

    public static void writeCalculationLog(String log){
        try {
            Files.writeString(Path.of("src/resources/calculator.log"),"The calculated result was: "+log);
        } catch (IOException e) {
            System.out.println("Couldn't save the log file.");
        }
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
