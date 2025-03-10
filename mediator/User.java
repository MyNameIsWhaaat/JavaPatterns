package mediator;

public class User{
    public String name;
    public Mediator chat;
    
    public User(String name, Mediator chat){
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }

    public void sendMessage(String message){
        System.out.println(this.name + " отправляет сообщение: " + message);
        chat.sendMessage(message, this);
    }

    public void receiveMessage(String message){
        System.out.println(this.name + " получил сообщение: " + message);
    }
}
