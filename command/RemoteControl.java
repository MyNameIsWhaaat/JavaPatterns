package command;

import java.util.Stack;

public class RemoteControl{
    private Command command;
    private final Stack<Command> history = new Stack<>();

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        if(command == null){
            System.out.println("Command cannot be null");
        }
        command.execute();
        history.push(command);
    }

    public void pressUndo(){
        if(!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();
        }else{
            System.out.println("No commands");
        }
    }
}