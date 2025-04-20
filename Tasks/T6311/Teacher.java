package Tasks.T6311;

public class Teacher extends Human{
    private final String name;
    private final String tcId;
    private final String position;

    public Teacher(String name, String tcId, String position){
        this.name = name;
        this.tcId = tcId;
        this.position = position;
    }

    @Override
    public boolean isAllowed() {
        return (name != null && !name.isEmpty()) && (tcId != null && !tcId.isEmpty()) && (position != null && !position.isEmpty());
    }
}
