package progmatic.polygonv2.polygon;

public class Rectangle implements PolygonInterface {
    private int result;

    public Rectangle(int side1, int side2) {
        result = getArea(side1, side2);
    }

    public int getResult() {
        return result;
    }

    @Override
    public int getArea(int side1, int side2) {
        return side1 * side2;
    }
}
