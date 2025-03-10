package singleton;

public class MyLogger{
    private static MyLogger lg;

    private MyLogger(){
    }

    public static MyLogger getLogger(){
        if(lg == null){
            lg = new MyLogger();
        }
        return lg;
    }

    public void log(String message){
        System.out.println(message);
    }

}