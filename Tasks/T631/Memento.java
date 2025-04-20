package Tasks.T631;

import java.util.ArrayList;

public class Memento {
    private final String name;
    private final ArrayList<Integer> marks;

    public Memento(String name, ArrayList<Integer> marks){
        this.name = name;
        this.marks = new ArrayList<>(marks);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getMarks(){
        return new ArrayList<>(marks);
    }
}
