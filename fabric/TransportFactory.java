package fabric;

public class TransportFactory{
    
    public static Transport createTransport(TransportType type){
        Transport transport = null;

        switch (type){
            case BIKE -> transport = new Bike();
            case CAR -> transport = new Car();
            case MOTORCYCLE -> transport = new Motorcycle();
            default -> throw new IllegalArgumentException("Неизвестный тип транспорта: " + type);
        }

        System.out.println("Vsio pizdui nahui");
        return transport;
    }
}