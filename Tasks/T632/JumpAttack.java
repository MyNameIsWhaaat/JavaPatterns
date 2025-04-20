package Tasks.T632;

public class JumpAttack implements Attack{
    private final Karateka karateka;

    public JumpAttack(Karateka karateka){
        this.karateka = karateka;
    }

    @Override
    public void execute() {
       karateka.jumpKick();
    }
    
}
