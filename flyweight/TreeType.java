package flyweight;

public class TreeType {
    private String name;
    public String getName() {
        return name;
    }

    private String color;
    public String getColor() {
        return color;
    }

    private String texture;
    public String getTexture() {
        return texture;
    }

    private TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    static TreeType createTreeType(String name, String color, String texture){
        return new TreeType(name, color, texture);
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + texture;
    }
}
