package bridge;

public class VectorRenderer implements Renderer{
    @Override
    public void render(BridgeCircle bridgeCircle) {
       System.out.println("Рисуем круг радиусом " + bridgeCircle.getR() + " с использованием векторного рендеринга.");
    }

    @Override
    public void render(BridgeRectangle bridgeRectangle) {
        System.out.println("Рисуем прямоугольник " + bridgeRectangle.getA() + "x" + 
        bridgeRectangle.getB() + " с использованием векторного рендеринга.");
    }
}
