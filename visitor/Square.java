package visitor;

public class Square implements Shape{
    private int a;

    public int getA() {
        return a;
    }

    public Square(int a){
        this.a = a;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doing(this);
    }
    
}
