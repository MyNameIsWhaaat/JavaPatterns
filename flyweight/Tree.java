package flyweight;

public class Tree {
    private int x;
    private int y;
    private final TreeType treeType;
    
    public Tree(int x, int y, TreeType treeType){
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    @Override
    public String toString() {
        return "[" + treeType + "]" +
                     " на " + "(" + x + ", " + y + ")";
    }
    
}