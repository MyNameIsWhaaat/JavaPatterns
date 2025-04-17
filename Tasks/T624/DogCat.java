package Tasks.T624;

import Tasks.T623.Cat;
import Tasks.T623.Meower;

public class DogCat extends Dog implements Meower{
    Cat cat;

    public DogCat(String name) {
        super(name);
    }
    
    public void bark(){
        super.bark();
    }

    @Override
    public void meow() {
        cat.meow();
    }
}
