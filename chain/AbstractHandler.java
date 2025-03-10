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
                System.out.println(getClass().getSimpleName() + " peredaet zapros dalshe...");
                nextHandler.handleRequest(level);
            }else{
                System.out.println("Etot daun ne umeet etu huinu delat");
            }
        }
    }

    protected abstract boolean canHandle(RequestLevel level);

    protected abstract void process(RequestLevel level);
}
