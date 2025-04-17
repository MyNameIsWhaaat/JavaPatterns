package Tasks.T616;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    String name;
    private final List<Integer> data = new ArrayList<>();
    private final List<Connection> connections = new ArrayList<>();
    private final int maxConections;

    public DataBase(int maxConections){
        this.maxConections = maxConections;
        for(int i=0; i<10; i++){
            data.add(i);
        }
    }

    public Connection connect(){
        if (connections.size() >= maxConections){
            System.out.println("неудача постигла вас");
            return null;
        }
        Connection conn = new Connection(this);
        connections.add(conn);
        return conn;
    }

    void release(Connection conn){
        connections.remove(conn);
    }

    Integer get(int index){
        return (index >= 0 && index < data.size()) ? data.get(index): null;
    }

    void add(int value){
        data.add(value);
    }
}
