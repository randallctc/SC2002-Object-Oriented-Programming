public class Rectangle extends Shapes{
    public double height;
    public double length;
    public double depth;
    public Rectangle(double h, double l, double w){
        this.height = h;
        this.length = l;
        this.depth = w;
    }
    public double area(){
        return this.height * this. length;
    }
    public double baseArea(){
        return this.height * this. length;
    }
    public double volume(){
        return this.height*this.length*this.depth;
    }
}
