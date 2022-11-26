public class Task3a {
    public static void main(String[] args) {
        System.out.println("The numbers in the args are: ");
        System.out.println(args[0] + " and " + args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int result = (a * 3) * b; /// “a” és “b” szorzata, miután megszoroztuk az “a”-t 3
        System.out.println("The result is: " + result);
    }
}
