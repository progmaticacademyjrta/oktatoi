public class Task66Improved {
    public static void main(String[] args) {
        String[] carsArray = {"Kia", "Ferrari", "Bmw", "Alfa Romeo", "Mercedes"};
        String myFavoriteCar = "Alfa Romeo";

        if (searchForItemInArray(carsArray, myFavoriteCar)) {
            System.out.println("HURRAY");
        }
    }

    public static boolean searchForItemInArray(String[] array, String searchItem) {
        boolean isInArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchItem)) {
                System.out.println(array[i] + " is in the array.");
                isInArray = true;
                break;   // opcionális optimalizálásként, ne fusson tovább a ciklus ha megtalálta a kedvencet
            }
            System.out.println("Check: " + i);
        }
        return isInArray;
    }
}
