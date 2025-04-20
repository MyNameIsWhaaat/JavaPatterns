package Tasks.T632;

public class Karateka {
    private final String name;

    public Karateka(String name){
        this.name = name;
    }

    public void kick(){
        System.out.println(name + ": бац!");
    }

    public void punch(){
        System.out.println(name + ": кия!");
    }

    public void jumpKick(){
        System.out.println(name + ": вжух!");
    }
}
