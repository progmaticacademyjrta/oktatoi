public class Task35 {
    public static void main(String[] args) {
        /*
        Készítsetek egy ageInput nevű arrayst, amiben a következő számok találhatóak:
        5, -3, 0, 21, 55, 18, 32, 255, 42.
        Írjatok egy for ciklust, amely bejárja ezt a tömböt
        és valid age esetén kiírja azt a képernyőre, de csak az életszerű, valós age-eket.
         */
        int[] ageInput = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        for (int i = 0; i < ageInput.length; i++) {
            if (0 <= ageInput[i] && ageInput[i] <= 120) {
                System.out.println(ageInput[i]);
            }
        }
    }
}
