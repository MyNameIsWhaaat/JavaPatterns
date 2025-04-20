package Tasks.T6311;

public class Student extends Human{
    private final String name;
    private final String stId;

    public Student(String name, String stId){
        this.name = name;
        this.stId = stId;
    }

    @Override
    public boolean isAllowed() {
        return (name != null && !name.isEmpty()) && (stId != null && !stId.isEmpty());
    }
 
}
