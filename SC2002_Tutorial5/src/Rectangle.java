public class Rectangle extends Polygon{
    public Rectangle(String name, float width, float height){
        super(name, width, height);
        polytype = KindofPolygon.POLY_RECT;
    }
    public float calArea(){ 
        return (float)height * width; 
    }
}
