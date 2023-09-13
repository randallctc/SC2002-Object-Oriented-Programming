public class Cylinder extends Shapes {
    public double radius;
    public double height;
    public Cylinder(double r, double h){
        this.radius = r;
        this.height = h;
    }
    public double baseArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double upperArea(){
        return 2 * Math.PI * this.height * this.radius;
    }
    public double area(){
        return this.upperArea() + 2 * this.baseArea();
    }
}
