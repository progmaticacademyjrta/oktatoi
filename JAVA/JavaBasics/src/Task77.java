import java.util.Scanner;

public class Task77 {
    /**
     * Készítsünk egy metódust, amely eldönti a konzolról beolvas egy szöveget,
     * majd a szintén beolvasott keresendő szövegről eldönti, hogy szerepel-e a szövegben.
     * <p>
     * Amennyiben igen, térjen vissza true-val,
     * egyébként false-al.
     */
    public static void main(String[] args) {
        System.out.println(isTextExist());
    }

    public static boolean isTextExist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        String string = scanner.nextLine();

        System.out.println("Add the text: ");
        String text = scanner.nextLine();

        if (string.contains(text)) {
            return true;
        } else {
            return false;
        }
    }
}
