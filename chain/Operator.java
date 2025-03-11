package chain;

public class Operator extends AbstractHandler{
    @Override
    protected boolean canHandle(RequestLevel requestLevel){
        return requestLevel == RequestLevel.LOW;
    }
    
    @Override
    protected void process(RequestLevel requestLevel){
        System.out.println("Оператор сделал запрос " + requestLevel + " уровня");
    }
}
