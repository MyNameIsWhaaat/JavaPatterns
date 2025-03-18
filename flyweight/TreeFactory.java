package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();
    
    public static TreeType getTreeType(String name, String color, String texture){
        String key = name + " " + color + " " + texture;
        if (treeTypes.containsKey(key)) {
            return treeTypes.get(key);
        }
        TreeType newType = TreeType.createTreeType(name, color, texture);
        treeTypes.put(key, newType);
        return newType;
    }
}
