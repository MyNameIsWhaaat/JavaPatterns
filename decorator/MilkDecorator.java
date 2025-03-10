package decorator;

public class MilkDecorator extends OptionDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee, "Milk", 50);
    }
}