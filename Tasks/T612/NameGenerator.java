package Tasks.T612;

import java.util.HashMap;
import java.util.Map;

public class NameGenerator {
    private static final NameGenerator INSTANCE = new NameGenerator();

    private static final Map<String, Name> names = new HashMap<>();

    private NameGenerator() {
    }

    public static NameGenerator getInstance() {
        return INSTANCE;
    }

    public Name generate(String firstName, String middleName, String lastName) {
        String key = firstName + " " + middleName + " " + lastName;
        if ((firstName == null || firstName.isEmpty()) &&
            (middleName == null || middleName.isEmpty()) &&
            (lastName == null || lastName.isEmpty())) {
            throw new IllegalArgumentException("Хотя бы один элемент имени должен быть задан.");
        }
        if (names.containsKey(key)) {
            return names.get(key);
        }
        Name newName = Name.createName(firstName, middleName, lastName);
        names.put(key, newName);
        
        return newName;
    }
}
