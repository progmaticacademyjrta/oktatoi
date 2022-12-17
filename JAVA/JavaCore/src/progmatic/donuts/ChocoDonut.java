package progmatic.donuts;

public class ChocoDonut extends ClassicDonut {

    private boolean isCocoa;

    public ChocoDonut(boolean isCocoa, String shape, int size, String flavor, String ingredients, String decor) {
        super(shape, size, flavor, ingredients, decor);
        this.isCocoa = isCocoa;
    }

    public void setCocoa(boolean cocoa) {
        isCocoa = cocoa;
    }

    public void csokitoltelekkeszites() {
        System.out.println("Cocoa filling creating in progress");
    }

    @Override
    public String toString() {
        return "ChocoDonut{" +
                "isCocoa=" + isCocoa +
                ", shape=" + getShape() +
                ", size=" + getSize() +
                ", flavor=" + getFlavor() +
                ", ingredients=" + getIngredients() +
                ", decor=" + getDecor() +
                '}';
    }
}
