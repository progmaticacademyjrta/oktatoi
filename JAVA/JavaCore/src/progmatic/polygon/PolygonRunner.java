package progmatic.polygon;

public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area = rectangle.getArea(3, 4);
        System.out.println("Rectangle's area: " + area);
    }
}
