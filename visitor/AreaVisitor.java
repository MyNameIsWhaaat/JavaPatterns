package visitor;

public class AreaVisitor implements Visitor{

    @Override
    public void doing(Square square) {
        double area = square.getA()* square.getA();
        System.out.println("Площадь квадрата равна: " + area);
    }
    
    @Override
    public void doing(Circle circle) {
        double area = circle.getR() * 3.14;
        System.out.println("Площадь круга равна: " + area);
    }

    @Override
    public void doing(Rectangle rectangle) {
        double area = rectangle.getA()* rectangle.getB();
        System.out.println("Площадь прямоугольника равна: " + area);
    }
}
