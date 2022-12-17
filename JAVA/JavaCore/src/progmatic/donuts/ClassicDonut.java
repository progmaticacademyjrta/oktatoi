package progmatic.donuts;

public class ClassicDonut {
    private final String shape;
    private final int size;
    private final String flavor;
    private final String ingredients;
    private final String decor;

    public ClassicDonut(String shape, int size, String flavor, String ingredients, String decor) {
        this.shape = shape;
        this.size = size;
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.decor = decor;
    }

    public void elfogy() {
        System.out.println("We are out of the donut.");
    }

    public void ízélmény() {
        System.out.println("This donut is superb.");
    }

    public void megkel() {
        System.out.println("The donut is getting bigger and bigger.");
    }

    public void táplál() {
        System.out.println("Calories are great!");
    }

    public void hízlal() {
        System.out.println("Eat more be bigger.");
    }

}
