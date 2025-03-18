package bridge;

public abstract class BridgeShape {
    protected final Renderer renderer;

    public BridgeShape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
