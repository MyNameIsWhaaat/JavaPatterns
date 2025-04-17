package Tasks.T615;

public class Temperature {
    String tempName;
    int minVal;
    int maxVal;

    private static final Temperature COLD = new Temperature("Холодно", -50, 10);
    private static final Temperature NORMAL = new Temperature("Нормально", 10, 25);
    private static final Temperature HOT = new Temperature("Нормально", 25, 60);


    private Temperature(String tempName, int minVal, int maxVal){
        this.tempName = tempName;
        this.minVal = minVal;
        this.maxVal = maxVal;
    }

    public static Temperature getCold(){
        return COLD;
    }

    public static Temperature getNormal(){
        return NORMAL;
    }

    public static Temperature getHot(){
        return HOT;
    }

    public String toString(){
        return tempName + "[ " + minVal + " - " + maxVal + " ]";
    }
}
