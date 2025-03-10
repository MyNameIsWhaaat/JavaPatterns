package decorator;

public class SugarDecorator extends OptionDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee, "Sugar", 20);
    }
}