package visitor;

public class DrawVisitor implements Visitor{
   
    @Override
    public void doing(Square square) {
        System.out.println("Рисуем квадрат с длинной стороны: " + square.getA());
    }
    
    @Override
    public void doing(Circle circle) {
        System.out.println("Рисуем круг с радиусом: " + circle.getR());
    }

    @Override
    public void doing(Rectangle rectangle) {
        System.out.println("Рисуем прямоугольник: " + rectangle.getA() + " на " + rectangle.getB());
    }
    
}
