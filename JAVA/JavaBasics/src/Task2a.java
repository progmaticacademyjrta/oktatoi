public class Task2a {
    public static void main(String[] args) {
        System.out.println("The numbers in the args are: ");
        System.out.println(args[0] + " and " + args[1]);

        String aFromArgs = args[0];
        String bFromArgs = args[1];

        int a = Integer.parseInt(aFromArgs);
        int b = Integer.parseInt(bFromArgs);
        int result = a % b;

        System.out.println(result);
    }
}
