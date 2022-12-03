import java.util.Scanner;

public class Task77v2 {
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

    /**
     * The method decide that the text is in the sting or not.
     * @return In case of yes, return true. In case of not, return false
     */
    public static boolean isTextExist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        String string = scanner.nextLine();

        System.out.println("Add the text: ");
        String text = scanner.nextLine();

        return string.contains(text); // lehet kiérdétekelndő kifejezés is nem csak változó vagy konkrét érték
    }
}
