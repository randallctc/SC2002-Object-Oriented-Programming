public class Cylinder extends Circle{
    protected double height;
    public Cylinder(){
        this.height = 1;
    }
    public Cylinder(double h){
        this.height = h;
    }
    public Cylinder(double rad, double h){
        this.radius = rad;
        this.height = h;
    }
    public Cylinder(double rad, double h, int x, int y){
        this.radius = rad;
        this.height = h;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public double getHeight(){
        return this.height;
    }
    public double area(){
        double topArea = 2 * super.area();
        double middleArea = 2 * this.radius * this.height;
        return topArea + middleArea;
    }
    public double volume(){
        return super.area() * this.height;
    }
    public String toString(){
        return "Cylinder of height " + this.height + ", radius " + this.radius + " at point " + "[" + this.getX() + ", " + this.getY() + "]";
    }
}
