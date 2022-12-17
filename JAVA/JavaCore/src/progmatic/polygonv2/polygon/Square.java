package progmatic.polygonv2.polygon;

public class Square implements PolygonInterface {
    private int result;

    public Square(int side1) {
        result = getArea(side1, 0);
    }

    public int getResult() {
        return result;
    }

    @Override
    public int getArea(int side1, int side2) {
        return side1 * side1;
    }
}
