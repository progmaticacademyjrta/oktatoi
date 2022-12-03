import java.util.Scanner;

public class Task80 {
    /**
     * Írjatok egy metódust, amely képes megkeresni a paraméterként kapott szöveg elejéről,
     * a szintén paraméterként kapott darabszámig kivágni a karaktereket.
     *
     * Az eredményStringet adja vissza a metódus.
     * Parancssori argumentumként feldolgozott értékekkel, futassátok meg a metódust a main-ből.
     * @param args
     */
    public static void main(String[] args) {
        String result = getSubStringofString(args[0], Integer.parseInt(args[1]));
        System.out.println(result);
    }

    public static String getSubStringofString(String text, int count){
        String result = null;
        // hellóbelló és 2 esetén ---- he
        result = text.substring(0,count) ;
        return result;
    }
}
