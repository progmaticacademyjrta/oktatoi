package progmatic.polygon;

public class Square implements PolygonInterface{

    public Square(){

    }

    @Override
    public int getArea(int side1, int side2) {
        return side1*side1;
    }
}
