public class Point {
    protected int x;
    protected int y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "[" + this.getX() + ", " + this.getY() + "]";
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
