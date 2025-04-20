package Tasks.T631;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> marks;
    private final List<Memento> history = new ArrayList<>();
    private int currentIndex = -1;
    private final GradeRule rule;

    public Student(String name, GradeRule rule ,int... initialMarks){
        this.name = name;
        this.marks = new ArrayList<>();
        this.rule = rule != null ? rule : new GradeRule() {
            public boolean isValid(int mark){
                return true;
            }
        };

        for(int mark : initialMarks){
            if(this.rule.isValid(mark)){
                this.marks.add(mark);
            }else{
                System.out.println("Оценка: " + mark + " не соответствет правилу");
            }
        }

        save();
    }

    public Memento getMemento(){
        return new Memento(this.name, this.marks);
    }

    public void load(Memento m){
        this.name = m.getName();
        this.marks = m.getMarks();
        save();
    }

    boolean validationMark(int mark){
        if(rule.isValid(mark)){
            return true;
        }else{
            return false;
        }
    }

    public void setMark(int index, int mark){
        if(validationMark(mark) && marks.size() > 0){
            marks.set(index, mark);
        }else{
            System.out.println("пипец");
        }
        save();
    }

    public void addMark(int mark){
        if(validationMark(mark)){
            marks.add(mark);
        }else{
            System.out.println("пипец");
        }
        save();
    }

    public float getAverageRating(){
        float res = 0;
        if (marks.size() == 0) {
            return 0;
        }

        for(int i = 0; i < marks.size(); i++){
            res+= marks.get(i);
        }
        return res / marks.size();
    }

    private void save(){
        history.add(new Memento(this.name, this.marks));
        currentIndex+=1;
        System.out.println("Сохраненный студент: " + history.get(currentIndex).getName() + " " + history.get(currentIndex).getMarks().toString());
    }

    public void undo(){
        if(currentIndex > 0){
            currentIndex-=1;
            this.name = history.get(currentIndex).getName();
            this.marks = (ArrayList<Integer>) history.get(currentIndex).getMarks().clone();
        }else{
            System.out.println("Сохранения не найдены");
        }
    }

    public void redo(){
        if(currentIndex + 1 < history.size()){
            currentIndex+=1;
            this.name = history.get(currentIndex).getName();
            this.marks = (ArrayList<Integer>) history.get(currentIndex).getMarks().clone();
        }else{
            System.out.println("Сохранения не найдены");
        }
    }

    public boolean isExcellentStudent(){
        if (getAverageRating() == 5) {
            return true;
        }
        return false;
    }

    public void setMarks(ArrayList<Integer> marks){
        this.marks = marks;
        save();
    }

    public ArrayList<Integer> getMarks(){
        return marks;
    }

    public String toString(){
        return this.name + " :" + marks.toString();
    }
}
