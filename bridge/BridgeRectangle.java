package bridge;

public class BridgeRectangle extends BridgeShape{
    private final double a;
    public double getA() {
        return a;
    }

    private final double b;
    public double getB() {
        return b;
    }

    public Renderer getRenderer() {
        return renderer;
    }

    public BridgeRectangle(Renderer renderer, double a, double b){
        super(renderer);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        renderer.render(this);
    } 
}
