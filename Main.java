import abstractFabric.*;
import adapter.*;
import bridge.*;
import builder.*;
import chain.*;
import command.*;
import composite.*;
import decorator.*;
import fabric.*;
import facade.MediaFacade;
import flyweight.*;
import observer.*;
import prototype.*;
import proxy.*;
import singleton.*;
import state.ATM;
import strategy.*;
import templateMethod.*;
import visitor.*;
import mediator.*;
import memento.*;
import iterator.*;
import interpreter.*;

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

        Image image = new ProxyImage("Cat.jpg");

        image.display();
        image.display();

        FolderComponent root = new FolderComponent("Корень");
        FolderComponent subFolder = new FolderComponent("Документы");
        FolderComponent subFolder2 = new FolderComponent("Документы2");

        FileComponent file1 = new FileComponent("Тезис.docx");
        FileComponent file2 = new FileComponent("Фото.jpg");

        subFolder.add(file1);
        subFolder.add(subFolder2);
        root.add(subFolder);
        root.add(file2);

        root.show("");

        CharacterPrototype warrior = new CharacterPrototype("Рагнар", "Воин", new String[]{"Меч", "Щит"});
        CharacterPrototype clonedWarrior = warrior.clone();

        System.out.println(warrior);
        System.out.println(clonedWarrior);

        TreeFactory.getTreeType("Дуб", "Зелёный", "Текстура-дуба.png");
        TreeFactory.getTreeType("Сосна", "Тёмно-зелёный", "Текстура-сосны.png");

        Tree tree1 = new Tree(10, 20, TreeFactory.getTreeType("Дуб", "Зелёный", "Текстура-дуба.png"));
        Tree tree2 = new Tree(30, 50, TreeFactory.getTreeType("Дуб", "Зелёный", "Текстура-дуба.png"));

        System.out.println(tree1);
        System.out.println(tree2);

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor drawVisitor = new DrawVisitor();
        Visitor areaVisitor = new AreaVisitor();

        circle.accept(drawVisitor);
        circle.accept(areaVisitor);

        rectangle.accept(drawVisitor);
        rectangle.accept(areaVisitor);

        Beverage tea = new Tea();
        Beverage coffee2 = new Coffeee();

        tea.prepareBeverage();
        System.out.println("---");
        coffee2.prepareBeverage();

        Expression expr = new AddExpression(
            new NumberExpression(3),
            new MultiplyExpression(
            new NumberExpression(4),
            new NumberExpression(5)
            )
        );
        System.out.println(expr.interpret()); // 3 + (4 * 5) = 23

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        BridgeShape bridgeCircle = new BridgeCircle(vectorRenderer, 5);
        BridgeShape bridgeRectangle = new BridgeRectangle(rasterRenderer, 10, 20);

        bridgeCircle.draw();   // Векторный рендеринг круга
        bridgeRectangle.draw(); // Растровый рендеринг прямоугольника

        MediaFacade player = new MediaFacade();
        player.play("movie.mp4");

        GUIFactory factory;
        
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.createUI();

        //Абстрактная фабрика возвращает интерфейс
        //Фабрика возвращает объект
        //Итерируемый светофор
    }
}
