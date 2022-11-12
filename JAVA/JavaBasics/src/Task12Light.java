public class Task12Light {
    public static void main(String[] args) {
        // Összesen 8 üvegünk van
        System.out.println("Van 5 darab zöld üveg, darabja 10 Ft");
        System.out.println("Van 3 darab fekete üveg, darabja 30 Ft");

        // Kiszámolni, mennyi pénzt kapunk érte
        int result;
        int zoldUvegOsszeg = 0;
        int feketeUvegOsszeg = 0;

        for (int cycle = 0; cycle <= 4; cycle++) {
            zoldUvegOsszeg = zoldUvegOsszeg + 10;  //zoldUvegOsszeg += 10;
        }

        result = zoldUvegOsszeg;
        for (int cycle = 0; cycle <= 2; cycle++) {
            feketeUvegOsszeg = feketeUvegOsszeg + 30;   //feketeUvegOsszeg += 30
        }
        result = result + feketeUvegOsszeg;
        System.out.println("Result: " + result + " Ft");

    }
}
