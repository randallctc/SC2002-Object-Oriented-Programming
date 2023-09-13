public class Cuboid extends Shapes {
    public double length;
    public double height;
    public Cuboid(double h, double l){
        this.length = l;
        this.height = h;
    }
    public double baseArea(){
        return Math.pow(this.length, 2);
    }
    public double upperArea(){
        return 4 * this.length * this.height;
    }
    public double area(){
        return this.upperArea() + 2 * this.baseArea();
    }
}