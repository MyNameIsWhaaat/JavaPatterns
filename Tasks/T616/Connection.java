package Tasks.T616;


public class Connection {
    private final DataBase DB;

    Connection(DataBase DB){
        this.DB = DB;
    }

    public int getDataByIndex(int idx){
        return DB.get(idx);
    }

    public void addData(int data){
        DB.add(data);
    }

    public void close(){
        DB.release(this);
    }
}
