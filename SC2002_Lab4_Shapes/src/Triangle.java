public class Triangle extends Shapes{
    public double height;
    public double length;
    public double depth;
    public Triangle(double h, double l, double w){
        this.height = h;
        this.length = l;
        this.depth = w;
    }
    public double area(){
        return this.height * this. length * 0.5;
    }
    public double baseArea(){
        return this.height * this. length * 0.5;
    }
    public double volume(){
        return (1/3)*this.height*this.length*this.depth;
    }
}
