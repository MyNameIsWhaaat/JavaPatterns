package abstractFabric;

public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void createUI() {
        button.paint();
        checkbox.paint();
    }
}
