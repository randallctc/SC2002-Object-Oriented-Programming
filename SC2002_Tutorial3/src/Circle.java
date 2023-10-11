public class Circle extends Point {
    protected double radius;
    public Circle(){
        this.radius = 1;
    }
    public Circle(double rad){ 
        this.radius = 1;
    }
    public Circle(int x, int y, double rad){
        this.x = x;
        this.y = y;
        this.radius = rad;
    }
    public void setRadius(double rad){
        this.radius = rad;
    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public String toString(){
        return "Circle at point " + super.toString() + " with radius " + this.getRadius() + " and area " + this.area();
    }
}
