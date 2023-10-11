public class Triangle extends Polygon {
    public Triangle(String name, float width, float height){
        super(name, width, height);
        polytype = KindofPolygon.POLY_TRIANG;
    }
    public float calArea(){ 
        return (float)0.5 * height * width; 
    }
}
