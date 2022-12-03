import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task82 {
    /**
     * Írjatok családbarát metódust, amely egy,
     * a metódusban előre létrehozott listában tárolt szavazat megkeres egyesével
     * a paraméterként kapott szövegben.
     *
     * a) Amennyiben megtalálja, cserélje ezeket “*” karakterekre.
     * b) A csillagozott rész legyen pont annyi karakter, amennyi az eredeti szó volt
     */
    public static void main(String[] args) {
        List<String> words =  Arrays.asList("kaki", "mégcsúnyábbkaki");
        //String wrongWord = "kaki";
        String text = "Elmentem abba a kaki boltba de találkoztam azzal a kaki bácsival.";

        String resultText = text.replaceAll(wrongWord,"*");

        System.out.println(resultText);
    }
}
