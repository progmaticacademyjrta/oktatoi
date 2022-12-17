package progmatic.donuts;

public class JamDonut extends ClassicDonut {

    private final String fruitPercentage;

    public JamDonut(String fruitPercentage, String shape, int size, String flavor, String ingredients, String decor) {
        super(shape, size, flavor, ingredients, decor);  //mindig a super utasítás az első utasítás a konstruktorban
        this.fruitPercentage = fruitPercentage;
    }

    public JamDonut(String fruitPercentage) {
        super("szögletes", 13, "jam", "egg", "sugar");
        this.fruitPercentage = fruitPercentage;
    }

    public void lekvartoltelekkeszites() {
        System.out.println("Creating jam filling....");
    }

    @Override
    public String toString() {
        return "JamDonut{" +
                "fruitPercentage='" + fruitPercentage + '\'' +
                //", " + super.toString() +
                ", " + super.getValues()+
                '}';
    }
}
