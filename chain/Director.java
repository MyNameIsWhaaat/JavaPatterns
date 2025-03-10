package chain;

public class Director extends AbstractHandler{
    @Override
    protected boolean canHandle(RequestLevel requestLevel){
        return requestLevel == RequestLevel.HIGH;
    }
    
    @Override
    protected void process(RequestLevel requestLevel){
        System.out.println("Director ebanul zapross " + requestLevel + " urovnya");
    }
}