public class Task84 {
    public static void main(String[] args) {
        printArgConsole(args);
    }

    public static void printArgConsole(String[] args){
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("There is no program arguments.");
        }
    }
}
