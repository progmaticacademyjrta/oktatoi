package progmatic.auto;

public class AutoMain {
    public static void main(String[] args) {
        Auto toyotaYaris = new Auto("Toyota", "Yaris", 2020, 5, "kolbászzsírmetál");
        Auto alfagt = new Auto("Alfa Romeo", "GT", 2006, 3, "fekete");
        Auto scania = new Auto("Scania", "R500 super", 2021, 2, "tűzpiros");

        System.out.println(toyotaYaris);
        System.out.println(toyotaYaris.getModel());
        toyotaYaris.setModel("Corolla");
        System.out.println(toyotaYaris.getModel());
        System.out.println(alfagt);
        System.out.println(scania);
    }
}
