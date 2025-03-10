package decorator;

public class SimpleCoffee implements Coffee{
    private final String label;
    private final double price;

    public SimpleCoffee(String label, double price){
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public String getLabel(){
        return this.label;
    }
}