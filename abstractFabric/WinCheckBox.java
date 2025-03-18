package abstractFabric;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Рисуем чекбокс для винды");
    }
}
