public class Arrays {
    public static void main(String[] args) {
        // létrehozás méret és értékadás nélkül
        int[] numbersEmpty;

        // létrehozás értékadással
        int[] numbersWithValues = {1, 34, 2, 21};
        double[] numbersWithValues2 = {1.7, 34, 7, 21};
        String[] namesWithValues = {"Zsolt", "Csaba"};
        char[] charWithValues = {'h', 'a'};
        boolean[] booleanWithValues = {true, true, false, true};

        // kiolvasás - a 0. indexű, azaz első elem a tömbben
        System.out.println("First element of array: " + numbersWithValues[0]);
        // length attributum megmondja milyen hosszú az adott tömb
        System.out.println("Length of array: " + numbersWithValues.length);

        // létrehozás értékadás nélkül, csak a méret megadásával
        double[] numberWithoutValues2 = new double[2];
        String[] numberWithoutValues3 = new String[5];

        // érték beállítása a 0. indexen, azaz az első elemnek
        numberWithoutValues3[0] = "Kiskacsa";

        // for ciklus használata a tomb bejarasara és értékeinek beallitasara
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // for ciklus használata a tomb bejarasara és értékeinek kiírására
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array element: " + numbers[i]);
        }

        // v2 array értékei visszafele
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Array element: " + numbers[i]);
        }

        // legutolsó eleme a tömbnek
        System.out.println("Array element: " + numbers[numbers.length]);


        // for vs foreach
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //for
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Count is: " + numbers2[i]);
        }

        //foreach
        for (int item : numbers2) {
            System.out.println("Count is: " + item);
        }
    }
}

