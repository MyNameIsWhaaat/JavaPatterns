package chain;

public class Manager extends AbstractHandler{
    @Override
    protected boolean canHandle(RequestLevel requestLevel){
        return requestLevel == RequestLevel.MEDIUM;
    }
    
    @Override
    protected void process(RequestLevel requestLevel){
        System.out.println("Менеджер сделал запрос " + requestLevel + " уровня");
    }
}
