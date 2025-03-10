package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{
    List<User> users = new ArrayList<>();
    
    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void deleteUser(User user){
        this.users.remove(user);
    }

    @Override
    public void sendMessage(String message, User sender){
        for (User user : users) {
            if(user != sender){
                user.receiveMessage(message);
            }
        }
    }
}
