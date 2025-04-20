package Tasks.T632;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private final List<Attack> attacks = new ArrayList<>();

    public void add(Attack attack){
        attacks.add(attack);
    }

    public void execute(){
        for(Attack attack : attacks){
            attack.execute();
        }
    }
}
