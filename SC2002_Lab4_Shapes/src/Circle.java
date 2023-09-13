public class Circle extends Shapes{
    public double radius;
    public Circle(double r){
        this.radius = r;
    }
    public double area(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double baseArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double volume(){
        return Math.pow(this.radius, 3) * Math.PI * (4/3);
    }
}