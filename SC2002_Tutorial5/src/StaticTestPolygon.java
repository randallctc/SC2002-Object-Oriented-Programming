public class StaticTestPolygon {
    public static void printArea(Rectangle rect){
        System.out.println("Area of Rectangle: " + rect.calArea());
    }
    public static void printArea(Triangle tri){
        System.out.println("Area of Triangle: " + tri.calArea());
    }
    public static void main(String args[]){
        Rectangle rect = new Rectangle("rect", 10, 10);
        Triangle tri = new Triangle("tri", 10, 10);
        printArea(tri);
        printArea(rect);
    }
}
