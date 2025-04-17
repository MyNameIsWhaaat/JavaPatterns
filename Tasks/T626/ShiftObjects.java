package Tasks.T626;

import java.util.ArrayList;
import Tasks.T625.*;

public class ShiftObjects implements Shiftable{
    private ArrayList<Shiftable> objects = new ArrayList<>();

    public ShiftObjects(){}

    public void add(Shiftable shiftable){
        objects.add(shiftable);
    }

    public void remove(Shiftable shiftable){
        objects.remove(shiftable);
    }

    @Override
    public void shift(int step, Axis point){
        for (Shiftable obj : objects){
            obj.shift(step, point);
        }
    }

    @Override
    public String toString() {
        return "Группа (" + objects.size() + " объектов)";
    }

    public void show(String indent) {
        for (Shiftable obj : objects) {
            if (obj instanceof ShiftObjects) {
                System.out.println(indent + obj);
                ((ShiftObjects) obj).show(indent + "  ");
            } else {
                System.out.println(indent + obj);
            }
        }
    }
}
