package Tasks.T625;

public class Triangle implements Figure, Shiftable{
    private Point p;
    private Point p2;
    private Point p3;

    public Triangle(Point p, Point p2, Point p3){
        this.p = p;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int area() {
        int x1 = p.getX(), y1 = p.getY();
        int x2 = p.getX(), y2 = p.getY();
        int x3 = p.getX(), y3 = p.getY();

        return (int) (0.5 * Math.abs(
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        ));
    }


    public String toString(){
        return "Треугольник в точках " + p.toString() + p2.toString() + p3.toString();
    }

    @Override
    public void shift(int step, Axis point) {
        this.p.shift(step, point);
        this.p2.shift(step, point);
        this.p3.shift(step, point);
    }
}
