public class Task66Function {

    public static int findElementInArray(String[] array, String elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elementToFind)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] cars = {"Ford", "Suzuki", "Citroen", "Nissan"};
        String myFavoriteCar = "Nissan";

        int favIndex = findElementInArray(cars, myFavoriteCar);
        if (favIndex == -1) {
            System.out.println("The array does not contain the element...");
        } else {
            System.out.println(cars[favIndex] + " is my favorite");
        }
    }
}
