package templateMethod;

public class Coffeee extends Beverage{

    @Override
    public void brew() {
        System.out.println("Насыпаем кофе в чашку");
    }

    @Override
    public void addCondiments() {
        System.out.println("Добавляем молоко и сахар");
    }
    
}
