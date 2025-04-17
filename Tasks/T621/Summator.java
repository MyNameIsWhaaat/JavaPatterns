package Tasks.T621;

public class Summator {
    public static int sum(GetNumber...getNumbers){
        int sum = 0;
        for(GetNumber n: getNumbers){
            sum += n.get();
        }
        return sum;
    }
}
