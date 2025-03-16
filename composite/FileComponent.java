package composite;

public class FileComponent implements FileSystemComponent{
    private String name;

    public FileComponent(String name){
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "📄 " + name);
    }
    
}
