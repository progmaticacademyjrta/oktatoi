package progmatic.polygonv2.polygon;

public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        int area = rectangle.getResult();
        System.out.println("Rectangle's area: " + area);

        Square square = new Square(3);
        area = square.getResult();
        System.out.println("Square's area: " + area);
    }
}
