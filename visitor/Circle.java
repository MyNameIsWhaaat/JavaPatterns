package visitor;

public class Circle implements Shape{
    private int r;

    public int getR() {
        return r;
    }

    public Circle(int r){
        this.r = r;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doing(this);
    }
}
