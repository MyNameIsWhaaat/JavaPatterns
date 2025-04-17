package Tasks.T621;

public class IntNum implements GetNumber{
    int num;

    public IntNum(int num){
        this.num = num;
    }

    @Override
    public int get() {
        return num;
    }
    
}
