package proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String url;

    public ProxyImage(String url){
        this.url = url;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = RealImage.create(url);
        }
        realImage.display();
    }
    
}
