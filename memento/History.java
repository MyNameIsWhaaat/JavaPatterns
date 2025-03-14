package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    
    private final List<Memento> history = new ArrayList<>();
    private int currentIndex = -1;

    public void save(TextEditor textEditor){
        history.add(textEditor.createMemento());
        currentIndex+=1;
        System.out.println("Сохраненный текст: " + history.get(currentIndex).getString());
    }

    public void undo(TextEditor textEditor){
        if(currentIndex > 0){
            currentIndex-=1;
            textEditor.restoreMemento(history.get(currentIndex));
        }else{
            System.out.println("Сохранения не найдены");
        }
    }

    public void redo(TextEditor textEditor){
        if(currentIndex < history.size() - 1){
            currentIndex+=1;
            textEditor.restoreMemento(history.get(currentIndex));
        }else{
            System.out.println("Сохранения не найдены");
        }
    }
}
