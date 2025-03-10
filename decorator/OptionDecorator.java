package decorator;

public class OptionDecorator implements Coffee{
    private final Coffee coffee;
    private final String label;
    private final double price;

    public OptionDecorator(Coffee coffee, String label, double price){
        this.coffee = coffee;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return this.price + coffee.getPrice();
    }

    @Override
    public String getLabel(){
        return coffee.getLabel() + ", " + this.label;
    }
}
