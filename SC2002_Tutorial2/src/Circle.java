public class Circle{
    private double radius;
    private static final double PI = 3.14159;
    public Circle(double rad){
        this.radius = rad;
    }
    public void setRadius(double rad){
        this.radius = rad;
    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return Math.pow(this.radius, 2) * PI;
    }
    public double circumference(){
        return this.radius*2*PI;
    }
    public void printArea(){
        System.out.println("Area of circie is: " + this.area());
    }
     public void printCircumference(){
        System.out.println("Circumference of circie is: " + this.circumference());
    }
}
