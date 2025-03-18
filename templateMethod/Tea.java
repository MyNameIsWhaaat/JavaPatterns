package templateMethod;

public class Tea extends Beverage{

    @Override
    public void brew() {
        System.out.println("Завариваем пакетик");
    }

    @Override
    public void addCondiments() {
        System.out.println("Добавляем лимон");
    }
    
}
