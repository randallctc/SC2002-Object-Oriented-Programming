public class Cone extends Shapes {
    public double radius;
    public double height;
    public Cone(double r, double h){
        this.radius = r;
        this.height = h;
    }
    public double baseArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double upperArea(){
        return Math.sqrt(Math.pow(this.radius, 2) + Math.pow(this.height, 2)) * Math.PI * this.radius;
    }
    public double area(){
        return this.upperArea() + this.baseArea();
    }
}
