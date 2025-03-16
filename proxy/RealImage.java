package proxy;

public class RealImage implements Image{
    private String url;
    
    private RealImage(String url){
        this.url = url;
        load();
    }

    private void load(){
        System.out.println("Загрузка: " + url);
    }

    @Override
    public void display() {
        System.out.println("Отображение: " + url);
    }

    static RealImage create(String url){
        return new RealImage(url);
    }
}
