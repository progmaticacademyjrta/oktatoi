import java.util.HashMap;
import java.util.Scanner;
/*
  Házi feladat:
  Kassza terminál készítése.
  A terminálnak különböző termékek neveit lehet megadni(minimum 6) melyeknek saját áruk van.
  Ha a felhasználó nem létező terméket ad meg, figyelmeztesse erre.
  A terminál egy speciális input segítségével lezárja a vásárlást és kiírja a fizetendő összeget.
  Egy másik speciális inputra pedig lenullázza azt vásárlás közben.
  Az implementáció során használj switch-case utasítást és kommentben a kód elején jelöld meg mely extra feladatokat készítetted el, ha van ilyen

  A kassza írja ki az utasításkészletét az induláskor és ha lehet közben is tájékoztassa megfelelően a usert arról hogy mi történik :)

  Extra feladatok (nem muszáj sorban, lehet válogatni is):
  0) Lehessen megadni darabszámot a termék neve után (először megkérdezi a termék nevét, majd a mennyiséget külön olvassa be)
  1) Lehessen terméket 'szotornózni', azaz egy speciális inputra az ELŐZŐ termék árát vonja le a vásárlásból.
  2) A kassza folyamatosan üzemeljen, azaz ha egy vásárlás lezárult kérdezze meg akarunk-e újat indítani (jön-e következő vásárló, vagy zárjuk a kasszát)
  3) Kassza záráskor írja ki mennyi volt az össz bevétel
  4) Vásárlás közben ha megadtuk az összes terméket, megadhatjuk mennyi pénzt adott a vásárló és kiírjuk a visszajáró összegét
  5) switch-case helyett használj if, else if, else utasításokat és lehetőleg ügyelj rá hogy fölöslegesen ne ellenőrizz inputokat :)
*/

public class Homework {
    public static int handleUserChoice(String item, int price) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg darabszámot!");
        int numOfItems = Integer.parseInt(scanner.nextLine());
        int latestPrice = price * numOfItems;
        System.out.println(item + " hozzáadva: " + latestPrice);
        return latestPrice;
    }

    public static void main(String[] args) {
        boolean nextCustomer = true;
        HashMap<String, Integer> items = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        items.put("Kenyér", 450);
        items.put("Tej", 400);
        items.put("Vaj", 1200);
        items.put("Méz", 2000);
        items.put("Kifli", 60);

        System.out.println("Kenyér: " + items.get("Kenyér") + "Ft");
        System.out.println("Tej: " + items.get("Tej") + "Ft");
        System.out.println("Vaj: " + items.get("Vaj") + "Ft");
        System.out.println("Méz: " + items.get("Méz") + "Ft");
        System.out.println("Kifli: " + items.get("Kifli") + "Ft");
        System.out.println("X - ha be akarod fejezni a vásárlást");
        System.out.println("DEL - ha kosarat szeretnél nullázni");
        System.out.println("ST - ha az előző választásod törölni akarod");
        int income = 0;

        while (nextCustomer) {
            boolean shopping = true;
            int price = 0;
            int latestPrice = 0;
            while (shopping) {
                System.out.println("Add meg a termék nevét!");
                String userChoice = scanner.nextLine();
                switch (userChoice) {
                    case "Kenyér":
                        latestPrice = handleUserChoice("Kenyér", items.get(userChoice));
                        price += latestPrice;
                        break;
                    case "Tej":
                        latestPrice = handleUserChoice("Tej", items.get(userChoice));
                        price += latestPrice;
                        break;
                    case "Vaj":
                        latestPrice = handleUserChoice("Vaj", items.get(userChoice));
                        price += latestPrice;
                        break;
                    case "Méz":
                        latestPrice = handleUserChoice("Méz", items.get(userChoice));
                        price += latestPrice;
                        break;
                    case "Kifli":
                        latestPrice = handleUserChoice("Kifli", items.get(userChoice));
                        price += latestPrice;
                        break;
                    case "X":
                        shopping = false;
                        break;
                    case "DEL":
                        System.out.println("Kosarat kiürítettük!");
                        price = 0;
                        break;
                    case "ST":
                        System.out.println("Az előző árut sztornóztuk!");
                        price -= latestPrice;
                        break;
                    default:
                        System.out.println("Rossz terméket választottál!");
                }
            }

            int remainingPrice = price;
            System.out.println("Milyen címlettel fizetsz?");
            while (remainingPrice > 0) {
                System.out.println("Fizetendő összeg: " + remainingPrice + "Ft");
                int userPayment = Integer.parseInt(scanner.nextLine());
                remainingPrice -= userPayment;
            }

            System.out.println("Visszajáró: " + (-remainingPrice));

            System.out.println("Van következő vásárló?I/N");
            String nextCustomerQuestion = scanner.nextLine();
            income += price;
            if (nextCustomerQuestion.equalsIgnoreCase("I")) {
                nextCustomer = true;
            } else if (nextCustomerQuestion.equalsIgnoreCase("N")) {
                nextCustomer = false;
            }
        }
        System.out.println("Napi bevétel: " + income + "Ft");
    }
}
