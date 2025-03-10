package fabric;

public class Car implements Transport{
    @Override
    public void use(){
        System.out.println("its Car");
    }
}