package composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComponent implements FileSystemComponent{
    private List<FileSystemComponent> fileSystemComponents = new ArrayList<>();
    private String name;

    public FolderComponent(String name){
        this.name = name;
    }

    public void add(FileSystemComponent fileSystemComponent){
        fileSystemComponents.add(fileSystemComponent);
    }

    public String getName(){
        return this.name;
    }

    public void removeFile(FileSystemComponent fileSystemComponent){
        fileSystemComponents.remove(fileSystemComponent);
    }

    @Override
    public void show(String indent){
        System.out.println(indent + "📁 " + name);
        for (FileSystemComponent component : fileSystemComponents) {
            component.show(indent + "   ");
        }
    }
}
