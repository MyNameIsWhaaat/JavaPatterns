package interpreter;

public class MultiplyExpression implements Expression{
    private final Expression expression1;
    private final Expression expression2;

    public MultiplyExpression(Expression expression1, Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() * expression2.interpret();
    }
    
}
