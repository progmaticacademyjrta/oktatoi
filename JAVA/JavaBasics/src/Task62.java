import java.util.Scanner;

public class Task62 {
    /**
     * Készítsetek egy getValidAgeFromConsole() metódust,
     * amelyet a main metódusban meg tudunk hívni és
     * visszaad egy helyes age-et integer-t amit a felhasználó a console-be írt.
     * <p>
     * Akkor helyes egy age ha 0 és 140 között van. (0 lehet, 140 nem)
     * A metódus visszatérési értékét mentsük le egy age nevű változóba,
     * majd írassuk ki a képernyőre annak tartalmát.
     */
    public static void main(String[] args) {
        int age = getValidAgeFromConsole();
        System.out.println(age);
    }

    public static int getValidAgeFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add an age and I'll decide is valid or not. (if you see -1 then you added invalid age)");
        int ageFromUser = scan.nextInt();
        if (ageFromUser >= 0 && ageFromUser < 140) {
            return ageFromUser;
        }
        System.out.println("Age is not between 0 and 120");
        return -1;
    }
}
