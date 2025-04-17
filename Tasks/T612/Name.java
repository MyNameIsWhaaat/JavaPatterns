package Tasks.T612;

public class Name {
    private final String lastName; 
    private final String firstName;
    private final String middleName;

    private Name(String firstName,String middleName,String lastName) {
        if((middleName == null || middleName == "") 
            && (firstName == null || firstName == "") 
            && (lastName == null || lastName == ""))
            throw new IllegalArgumentException();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static Name createName(String firstName,String middleName,String lastName){
        return new Name(firstName, middleName, lastName);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (lastName != null) result.append(lastName);
        if (firstName != null) {
            if (result.length() > 0) result.append(" ");
            result.append(firstName);
        }
        if (middleName != null) {
            if (result.length() > 0) result.append(" ");
            result.append(middleName);
        }
        return result.toString();
    }
    
}
