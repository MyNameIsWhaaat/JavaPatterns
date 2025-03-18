package visitor;

public class Rectangle implements Shape{
    private int a;
    public int getA() {
        return a;
    }

    private int b;

    public int getB() {
        return b;
    }

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doing(this);
    }
}
