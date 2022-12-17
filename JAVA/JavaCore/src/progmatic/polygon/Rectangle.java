package progmatic.polygon;

public class Rectangle implements PolygonInterface{

    public Rectangle(){

    }

    @Override
    public int getArea(int side1, int side2) {
        return side1*side2;
    }
}
