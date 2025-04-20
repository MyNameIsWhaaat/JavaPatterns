package Tasks.T632;

public class KickAttack implements Attack{
    private final Karateka karateka;

    public KickAttack(Karateka karateka){
        this.karateka = karateka;
    }

    @Override
    public void execute() {
       karateka.kick();
    }
    
}