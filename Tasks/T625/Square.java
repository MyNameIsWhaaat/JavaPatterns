package Tasks.T625;

public class Square implements Figure, Shiftable{
    private Point p;
    private int a;

    public Square(Point p, int a){
        this.a = a;
        this.p = p;
    }

    public Square(int x, int y, int a){
        this.p = new Point(x, y);
        this.a = a;
    }

    public String toString(){
        return "Квадрат в точке " + p.toString() + " со стороной " + a;
    }

    @Override
    public int area() {
       return a*a;
    }

    @Override
    public void shift(int step, Axis point) {
        this.p.shift(step, point);
    }
}
