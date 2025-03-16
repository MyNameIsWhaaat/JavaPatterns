package prototype;

import java.util.Arrays;

public class CharacterPrototype implements Prototype{
    private String name;
    private String personClass;
    private String[] skills;

    public CharacterPrototype(String name, String personClass, String[] skills){
        this.name = name;
        this.personClass = personClass;
        this.skills = skills;
    }

    @Override
    public CharacterPrototype clone(){
        return new CharacterPrototype(this.name, this.personClass, this.skills.clone());
    }

    @Override
    public String toString() {
            return "Персонаж: " + name + 
           ", Класс: " + personClass + 
           ", Навыки: " + Arrays.toString(skills);
    }

    public String[] getSkills() {
        return skills;
    }
    
}
