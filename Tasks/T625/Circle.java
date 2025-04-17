package Tasks.T625;

public class Circle implements Figure, Shiftable{
    private Point p;
    private int r;

    public Circle(Point p, int r){
        this.p = p;
        this.r = r;
    }

    @Override
    public void shift(int step, Axis p){
        this.p.shift(step, p);
    }

    @Override
    public int area() {
        return (int) (Math.PI * r * r);
    }


    public String toString(){
        return "Круг в точке " + p.toString() + " с радиусом " + r;
    }
}
