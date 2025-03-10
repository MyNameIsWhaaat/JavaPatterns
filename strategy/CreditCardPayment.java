package strategy;

public class CreditCardPayment implements PaymentStrategy{
    private final String number;

    public CreditCardPayment(String number){
        this.number = number;
    }

    @Override
    public void pay(int amount){
        System.out.println("Pay " + amount + " card " + this.number);
    }

}