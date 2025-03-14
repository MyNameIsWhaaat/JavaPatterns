package memento;

public class TextEditor {  
    private String text = "";  
    
    public void write(String text){
        this.text = text;
        System.out.println("Ваш текст:" + text);
    }

    public Memento createMemento(){
        return new Memento(text);
    }

    public void restoreMemento(Memento memento){
        this.text = memento.getString();
        System.out.println("Откат к: " + text);
    }
}
