package chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;
    
    public void setNext(AbstractHandler  handler){
        this.nextHandler = handler;
    }
    
    public void handleRequest(RequestLevel level){
        if(canHandle(level)){
            process(level);
        }else{
            if(nextHandler != null){
                System.out.println(getClass().getSimpleName() + " передает запрос дальше...");
                nextHandler.handleRequest(level);
            }else{
                System.out.println("error");
            }
        }
    }

    protected abstract boolean canHandle(RequestLevel level);

    protected abstract void process(RequestLevel level);
}
