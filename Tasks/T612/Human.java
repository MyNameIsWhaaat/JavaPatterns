package Tasks.T612;

public class Human {
    private final Name name;
    private final int height;

    public Human(Name name, int height){
        this.name = name;
        this.height = height;
    }

    public String toString(){
        return  "Человек с именем " + this.name.toString() +  " и ростом " + this.height;
    }
}
