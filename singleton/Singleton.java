package singleton; 

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // какая-то логика
    public void doSomething() {
        System.out.println("Singleton works!");
    }
}