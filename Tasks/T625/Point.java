package Tasks.T625;

public class Point implements Shiftable{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point create(int x, int y){
        return new Point(x, y);
    }

    public static Point create(int x, int y, int z){
        return new Point3d(x, y, z);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public String toString(){
        return "{" + this.x + ";" + this.y + "}"; 
    }

    @Override
    public void shift(int step, Axis point) {
        switch (point) {
            case X:
                this.x += step;
                break;
            case Y:
                this.y += step;
                break;
            default:
                break;
        }
    }
}
