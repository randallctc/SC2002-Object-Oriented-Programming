public class Sphere extends Shapes{
    public double radius;
    public Sphere(double r){
        this.radius = r;
    }
    public double area(){
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    public double baseArea(){
        return 0;
    }
}
