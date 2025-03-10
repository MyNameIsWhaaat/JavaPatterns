package mediator;

public interface Mediator{

    void addUser(User user);

    void deleteUser(User user);

    void sendMessage(String message, User sender);

}