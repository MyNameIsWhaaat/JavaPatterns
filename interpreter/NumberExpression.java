package interpreter;

public class NumberExpression implements Expression{
    private final int a;

    public NumberExpression(int a){
        this.a = a;
    }

    @Override
    public int interpret() {
        return a;
    }
}
