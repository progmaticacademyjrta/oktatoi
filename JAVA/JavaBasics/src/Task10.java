public class Task10 {
    public static void main(String[] args) {
        System.out.println("0*1*2*3*4*5*6*7*8*9*10=?");

        int result = 0;
        for (int number = 0; number <= 10; number++) {
            result = result * number;     // result *= number
        }
        System.out.println("Result: " + result);

        int num = 0;
        result = 0;
        while (num <= 10) {
            result = result * num;     // result *= num
            num++;
        }
        System.out.println("Result: " + result);
    }
}
