public class Task66 {
    public static void main(String[] args) {
        String[] carsArray = {"Kia", "Ferrari", "Bmw", "Alfa Romeo", "Mercedes"};
        String myFavoriteCar = "Alfa Romeo";

        searchForItemInArray(carsArray, myFavoriteCar);
    }

    public static boolean searchForItemInArray(String[] carsArray, String myFavoriteCar) {
        boolean isInArray = false;
        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + " is in the array.");
                isInArray = true;
                break;   // opcionális optimalizálásként, ne fusson tovább a ciklus ha megtalálta a kedvencet
            }
            System.out.println("Check: " + i);
        }
        return isInArray;
    }
}
