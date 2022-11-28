public class Task61 {
    /**
     * Készítsünk egy metódust, amely kapott szám esetén eldönti,
     * hogy az 18-nál nagyobb-e. Ha igen, kiírja hogy
     * “Elmúltál 18, jogosult vagy a belépésre!”,
     * egyébként pedig írja ki, hogy
     * “Nem vagy még 18, sicc innen!”
     */
    public static void main(String[] args) {
        decideAndPrintAdult(18);
        decideAndPrintAdult(20);
    }

    public static void decideAndPrintAdult(int age){
        if(18 < age){
            System.out.println("Elmúltál 18, jogosult vagy a belépésre!");
        }else{
            System.out.println("Nem vagy még 18, sicc innen!");
        }
    }
}
