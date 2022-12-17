package progmatic.donuts;

public class DonutsMain {
    public static void main(String[] args) {
        ClassicDonut classic = new ClassicDonut("kerek", 10, "csokis", "liszt", "porcukor");
        classic.elfogy();
        classic.ízélmény();
        System.out.println(classic);

        System.out.println("----------------****----------------");
        ChocoDonut chocoDonut = new ChocoDonut(true, "kerek", 14, "choco", "egg", "sugar");
        chocoDonut.elfogy();
        chocoDonut.ízélmény();
        chocoDonut.csokitoltelekkeszites();
        System.out.println(chocoDonut);

        System.out.println("----------------****----------------");
        JamDonut jamDonutv1 = new JamDonut("40%","szögletes",13,"jam","egg","sugar");
        JamDonut jamDonut = new JamDonut("40%");
        jamDonut.elfogy();
        jamDonut.ízélmény();
        jamDonut.lekvartoltelekkeszites();
        System.out.println(jamDonut);
    }
}
