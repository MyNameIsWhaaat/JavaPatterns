package Tasks.T625;

public class Point3d extends Point{
    private int z;

    public Point3d(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }
    
    public String toString(){
        return "{" + getX() + ";" + getY() + ";" + this.z + "}"; 
    }

    @Override
    public void shift(int step, Axis point) {
        switch (point) {
            case X:
                super.shift(step, point);
                break;
            case Y:
                super.shift(step, point);
                break;
            case Z:
                this.z += step;
                break;
            default:
                break;
        }
    }
}
