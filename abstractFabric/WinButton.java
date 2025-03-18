package abstractFabric;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Рисуем кнопку для винды");
    }
}
