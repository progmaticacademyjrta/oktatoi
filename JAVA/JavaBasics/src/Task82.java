import java.util.Arrays;
import java.util.List;

public class Task82 {
    /**
     * Írjatok családbarát metódust, amely egy,
     * a metódusban előre létrehozott listában tárolt szavazat megkeres egyesével
     * a paraméterként kapott szövegben.
     * <p>
     * a) Amennyiben megtalálja, cserélje ezeket “*” karakterekre.
     * b) A csillagozott rész legyen pont annyi karakter, amennyi az eredeti szó volt
     */
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kaki", "fütyi");
        //String wrongWord = "kaki";
        String text = "Elmentem abba a kaki boltba de találkoztam azzal a fütyi bácsival.";

        String resultText = "";
        for (String word : words) {
            text = text.replaceAll(word, "*");
            // resultText = text..replaceAll(  word, "*") esetén:
            // resultText = "Elmentem abba a * boltba de találkoztam azzal a mégcsúnyábbkaki bácsival.";
            // resultText = "Elmentem abba a kaki boltba de találkoztam azzal a * bácsival.";
        }
        System.out.println(text);
    }
}
