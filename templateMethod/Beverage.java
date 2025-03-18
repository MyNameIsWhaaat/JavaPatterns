package templateMethod;

public abstract class Beverage {
    public void boilWater(){
        System.out.println("Наливаем воду");
    }

    public void pourIntoCup(){
        System.out.println("Наливаем в чашку");
    }

    public abstract void brew();
    public abstract void addCondiments();

    public final void prepareBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

}
