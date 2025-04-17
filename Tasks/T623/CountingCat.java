package Tasks.T623;

public class CountingCat implements Meower{
    public final Meower meower;
    private int count = 0;

    public CountingCat(Meower meower){
        this.meower = meower;
    }

    @Override
    public void meow() {
        meower.meow();
        count++;
    }

    public int getCountOfMeows(){
        return count;
    }
    
}
