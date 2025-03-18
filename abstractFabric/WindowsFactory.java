package abstractFabric;

public class WindowsFactory implements GUIFactory{
    
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
    
}
