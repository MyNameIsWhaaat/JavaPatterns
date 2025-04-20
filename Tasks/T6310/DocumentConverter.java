package Tasks.T6310;

public class DocumentConverter {
    private final Open open;
    private final Save save;
    private final Transform transform;

    public DocumentConverter(Open open, Save save, Transform transform){
        this.transform = transform;
        this.open = open;
        this.save = save;
    }

    public void convert(String inpFile, String output){
        String rawData = open.open(inpFile);
        String tfData = transform.transform(rawData);
        save.save(tfData, output);
    }
}
