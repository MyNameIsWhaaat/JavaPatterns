package memento;

public class Memento {
    private final String text;

    public Memento(String text){
        this.text = text;
    }

    public String getString(){
        return text;
    }
}
