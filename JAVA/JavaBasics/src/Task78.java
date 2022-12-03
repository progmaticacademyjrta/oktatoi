import java.util.Scanner;

public class Task78 {
    /**
     * Írjatok egy metódust a paraméterként kapott szövegről,
     * illetve a másik paraméterként kapott kifejezésről eldönti,
     * hogy azzal a kifejezéssel kezdődik-e az adott szöveg vagy sem.
     * <p>
     * Amennyiben igen, térjen vissza true-val, egyébként false-al.
     * <p>
     * a) hogy ki tudjuk próbálni a metódust, konzolról olvassunk be két értéket a main metódusban és hívjuk meg a készített metódust velük.
     * b) parancssori argumentumként olvassunk be két értéket a main metódusban és hívjuk meg a készített metódust velük.
     * c) a metódus távolítsa el a felesleges szóközöket a String-ek elejéről és végéről
     * d) amennyiben van a program indításakor parancssori argumentum beállítva akkor használja azokat
     *    ha viszont nincs, akkor olvassa be az adatokat a konzolról
     */
    public static void main(String[] args) {
        String string;
        String text;

        if(args.length != 0) {   // ua.: mint az if(args.lenth > 0)
            string = args[0];   //parancssori arg b) megoldás
            text = args[1];    //parancssori arg b) megoldás
        }else {
            string = readStringFromConsole();
            text = readStringFromConsole();
        }

        System.out.println("Result: "+isStringStartsWithText(string,text));
    }

    public static String readStringFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a text:");
        return scanner.nextLine();
    }

    public static boolean isStringStartsWithText(String string, String text) {
        string = string.trim();
        text = text.trim();
        boolean result;
        if (string.startsWith(text))
            result = true;
        else
            result = false;
        return result;
    }

    public static boolean isStringStartsWithTextv2(String string, String text) {
        if (string.trim().startsWith(text.trim()))
            return true;
        else
            return false;
    }

    public static boolean isStringStartsWithTextv3(String string, String text) {
        return string.trim().startsWith(text.trim());
    }
}
