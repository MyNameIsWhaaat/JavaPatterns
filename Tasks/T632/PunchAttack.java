package Tasks.T632;

public class PunchAttack implements Attack{
    private final Karateka karateka;

    public PunchAttack(Karateka karateka){
        this.karateka = karateka;
    }

    @Override
    public void execute() {
       karateka.punch();
    }
}
