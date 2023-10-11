public class DynamicTestPolygon {
    public static void printArea(Polygon poly){
        System.out.println("Area of " + poly.name + " : " + poly.calArea());
    }
    public static void main(String args[]){
        Polygon rect = new Rectangle("rect", 10, 10);
        Polygon tri = new Triangle("tri", 10, 10);
        printArea(tri);
        printArea(rect);
    }
}
