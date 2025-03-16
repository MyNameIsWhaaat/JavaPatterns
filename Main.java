import adapter.*;
import builder.*;
import chain.*;
import command.*;
import decorator.*;
import fabric.*;
import observer.*;
import singleton.*;
import state.ATM;
import strategy.*;
import mediator.*;
import memento.*;
import iterator.*;

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

        ChatMediator chat = new ChatMediator();
        User alice = new User("Alice", chat);
        User bob = new User("Bob", chat);

        alice.sendMessage("Привет, Вова");
        bob.sendMessage("Привет!");

        //State//
        ATM atm = new ATM();
        
        atm.insertCard();
        atm.enterPin(4321);
        atm.insertCard();
        atm.enterPin(1234);
        atm.requestCash(15000);
        atm.requestCash(5000);
        atm.ejectCard();
        atm.requestCash(1000);
        
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Привет, мир!!");
        history.save(editor);

        editor.write("Привет, не мир!!");
        history.save(editor);
        
        history.undo(editor);
        history.redo(editor);

        PlayList playlist = new PlayList();
        playlist.addSong("Imagine - John Lennon");
        playlist.addSong("Bohemian Rhapsody - Queen");
        playlist.addSong("Пошлая молли - Люимая песня твоей сестры");

        Iterator<String> iterator = playlist.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Сейчас играет: " + iterator.next());
        }
    }
}
