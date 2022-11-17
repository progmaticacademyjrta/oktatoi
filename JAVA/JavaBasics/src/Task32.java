public class Task32 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[100];

        for (int i = 0; i < 100; i++) {
            evenNumbers[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(evenNumbers[i]);
        }
    }
}
