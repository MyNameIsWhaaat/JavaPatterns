package Tasks.T621;

public class StringAdapter implements GetNumber{
    private final String str;

    public StringAdapter(String str){
        this.str = str;
    }

    @Override
    public int get() {
        return str.length();
    }
    
}
