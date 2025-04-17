package Tasks.T624;

public class Dog {
    private final String name;

    public Dog(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Хав-хав");
    }

    public String toString(){
        return "Сабака по имени " + this.name;
    }
}
