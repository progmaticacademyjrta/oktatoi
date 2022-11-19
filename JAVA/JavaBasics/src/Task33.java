public class Task33 {
    public static void main(String[] args) {
        String[] carsArray = {"Kia", "Ferrari", "Bmw", "Alfa Romeo", "Mercedes"};
        String myFavoriteCar = "Alfa Romeo";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + "a kedvenc autómárkám.");
                break;   // opcionális optimalizálásként, ne fusson tovább a ciklus ha megtalálta a kedvencet
            }
            System.out.println("Check: " + i);
        }
    }
}
