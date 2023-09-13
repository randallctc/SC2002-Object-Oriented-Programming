public class Pyramid extends Shapes {
    public double length;
    public double height;
    public Pyramid(double h, double l){
        this.length = l;
        this.height = h;
    }
    public double baseArea(){
        return Math.pow(this.length, 2);
    }
    public double upperArea(){
        return 4 * (Math.sqrt(Math.pow((this.length/2), 2) + Math.pow(this.height, 2))) * this.length * 0.5;
    }
    public double area(){
        return this.upperArea() + this.baseArea();
    }
}
