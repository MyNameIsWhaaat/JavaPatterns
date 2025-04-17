package Tasks.T625;

public class Rectangle implements Figure, Shiftable{
    private Point p;
    private int a;
    private int b;

    public Rectangle(Point p, int a, int b){
        this.a = a;
        this.b = b;
        this.p = p;
    }

    public Rectangle(int x, int y, int a, int b){
        this.p = new Point(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        return a * b;
    }


    public String toString(){
        return "Квадрат в точке " + p.toString() + " со стороной " + a;
    }

    @Override
    public void shift(int step, Axis point) {
        this.p.shift(step, point);
    }

}
