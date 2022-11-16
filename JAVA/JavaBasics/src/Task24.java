import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a brand: ");
        String brand = scanner.nextLine();

        switch (brand) {
            case "Dreher":
                System.out.println("Annyi a világ, amennyit beletöltesz");
                break;
            case "Halls":
                System.out.println("Az orrodat is tisztítja");
                break;
            case "Gösser":
                System.out.println("Gut Besser Gösser");
                break;
            case "Dunkin Donuts":
                System.out.println("America runs on dunkin");
                break;
            case "Nespresso":
                System.out.println("What else");
                break;
            case "Opel":
                System.out.println("Sosem kop el");
                break;
            case "L'oreal":
                System.out.println("Mert megérdemlem");
                break;
            case "Disneyland":
                System.out.println("The happiest place on Earth");
                break;
            default:
                System.out.println("Not existing brand. Try a new one!");
        }
    }
}
