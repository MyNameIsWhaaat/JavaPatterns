package iterator;

import java.util.List;

public class SongIterator implements Iterator<String>{
    private List<String> songs;
    private int position = 0;

    public SongIterator(List<String> songs){
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();   
    }

    @Override
    public String next(){
        if(!hasNext()){
            throw new IllegalStateException("Больше нет песен.");        
        }
        return songs.get(position++);
    }
    
}
