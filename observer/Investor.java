package observer;

public class Investor implements Observer{
    private float exchangeRate;

    public float getExchangeRate(){
        return exchangeRate;
    }

    @Override
    public void update(float exchangeRate){
        this.exchangeRate = exchangeRate;
        System.err.println("Investor: exchangeRate is change " + exchangeRate);
    }
}