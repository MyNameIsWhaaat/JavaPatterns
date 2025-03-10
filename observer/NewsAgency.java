package observer;

public class NewsAgency implements Observer{
    private float exchangeRate;

    public float getExchangeRate(){
        return exchangeRate;
    }

    @Override
    public void update(float exchangeRate){
        this.exchangeRate = exchangeRate;
        System.err.println("NewsAgency: exchangeRate is change " + exchangeRate);
    }
}