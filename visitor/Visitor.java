package visitor;

public interface Visitor {
    public void doing(Circle circle);
    public void doing(Square square);
    public void doing(Rectangle rectangle);
}
