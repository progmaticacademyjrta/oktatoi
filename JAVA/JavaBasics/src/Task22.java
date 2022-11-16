import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanRerun = new Scanner(System.in);
        String decision;
        //boolean rerun = false;

        do {
            System.out.println("Give the operator first? (+ - * / pumped)");
            String operator = scan.nextLine();
            System.out.println("First number: ");
            int number1 = Integer.parseInt(scan.nextLine());
            System.out.println("Second number: ");
            int number2 = Integer.parseInt(scan.nextLine());

            switch (operator) {
                case "*":
                    System.out.println("Result: " + number1 * number2);
                    break;
                case "/":
                    System.out.println("Result: " + number1 / number2);
                    break;
                case "-":
                    System.out.println("Result: " + (number1 - number2)); // itt szükség van a zárójelre a műveleti sorrend miatt
                    break;
                case "+":
                    System.out.println("Result: " + (number1 + number2));
                    break;
                case "pumped":
                    System.out.println("Result: " + number1 * number1 * number1 * number2 * number2 * number2);
                    break;
                default:
                    System.out.println("Unsupported operator. Please re-run!");
            }


            System.out.println("Do you want to re-run? (Y/N)");
            decision = scanRerun.nextLine();
            if (decision.equals("Y")) {
                System.out.println("Got it. Rerun...");
                //rerun=true;
            } else {
                System.out.println("Ok, thanks for using me.");
                //rerun=false;
            }
        } while (decision.equals("Y"));
    }
}
