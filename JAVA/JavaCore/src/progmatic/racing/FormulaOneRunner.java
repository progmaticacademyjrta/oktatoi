package progmatic.racing;

public class FormulaOneRunner {
    public static void main(String[] args) {
        MercedesPilotOne hamilton = new MercedesPilotOne("Hamilton","brit","Mercedes");
        hamilton.acceleration(2.6);
        System.out.println(hamilton.getCarManufacturer());
        System.out.println(hamilton.getNationality());
        System.out.println(hamilton.getRacerName());
        System.out.println(hamilton);
    }
}
