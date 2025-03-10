import adapter.*;
import builder.*;
import chain.*;
import command.*;
import decorator.*;
import fabric.*;
import observer.*;
import singleton.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
     
        MyLogger lg = MyLogger.getLogger();
        MyLogger lg2 = MyLogger.getLogger();
        
        lg.log("1msg");
        lg2.log("2msg");

        System.out.println(lg == lg2);

        Transport bike = TransportFactory.createTransport(TransportType.BIKE);
        bike.use();

        Transport car = TransportFactory.createTransport(TransportType.CAR);
        car.use();

        Transport motorcycle = TransportFactory.createTransport(TransportType.MOTORCYCLE);
        motorcycle.use();

        Machine machine = new Machine.Builder("Toyota", "Camry", 2022) 
            .build();

        System.out.println(machine);

        StockMarket stockMarket = new StockMarket();
        Investor investor = new Investor();
        NewsAgency newsAgency = new NewsAgency();
 

        stockMarket.addObserver(investor);
        stockMarket.addObserver(newsAgency);
        stockMarket.setExchangeRate(3f);

        TypeC adapter = new MicroUSBToTypeCAdapter(new MicroUSBCharger());
        adapter.connectWithTypeCCable();

        Coffee coffee = new SimpleCoffee("Latte", 100);
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        
        System.out.println(coffee.getLabel() + " = " + coffee.getPrice() + "$");

        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        cart.checkout(500);
        cart.setPaymentStrategy(new CryptoPayment("dssdfdsfsdf"));
        cart.checkout(100);

        RemoteControl control = new RemoteControl();
        Light l = new Light();

        control.setCommand(new LightOnCommand(l));
        control.pressButton();

        control.setCommand(new LightOffCommand(l));
        control.pressButton();

        control.pressUndo();

        AbstractHandler operator = new Operator();
        AbstractHandler manager = new Manager();
        AbstractHandler director = new Director();

        operator.setNext(manager);
        manager.setNext(director);

        operator.handleRequest(RequestLevel.HIGH);

    }
}
