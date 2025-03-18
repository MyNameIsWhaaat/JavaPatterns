package bridge;

public class BridgeCircle extends BridgeShape{
    private final double r;

    public double getR(){
        return this.r;
    }

    public BridgeCircle(Renderer render, int r){
        super(render);
        this.r = r;
    }

    @Override
    public void draw() {
        renderer.render(this);
    }   
}
