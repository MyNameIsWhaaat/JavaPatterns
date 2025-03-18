package bridge;

public class RasterRenderer implements Renderer{
    @Override
    public void render(BridgeCircle bridgeCircle) {
       System.out.println("Рисуем круг радиусом " + bridgeCircle.getR() + 
       " с использованием растрового рендеринга.");
    }

    @Override
    public void render(BridgeRectangle bridgeRectangle) {
        System.out.println("Рисуем прямоугольник " + bridgeRectangle.getA() + "x" + 
        bridgeRectangle.getB() + " с использованием растрового рендеринга.");
    }
}
