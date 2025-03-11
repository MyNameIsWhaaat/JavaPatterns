package fabric;

public class TransportFactory{
    
    public static Transport createTransport(TransportType type){
        Transport transport = null;

        switch (type){
            case BIKE: transport = new Bike(); break;
            case CAR: transport = new Car(); break;
            case MOTORCYCLE: transport = new Motorcycle(); break;
            default: throw new IllegalArgumentException("Неизвестный тип транспорта: " + type);
        }
        
        return transport;
    }
}