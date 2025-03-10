package strategy;

public class ShoppingCart{
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void checkout(int amount){
        if(strategy == null){
            System.out.println("PaymentStrategy cannot be null");
        }
        strategy.pay(amount);
    }
}