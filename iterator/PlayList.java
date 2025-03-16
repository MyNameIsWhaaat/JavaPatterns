package iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<String> songs = new ArrayList<>();

    public void addSong(String songName){
        songs.add(songName);
    }

    public Iterator<String> getIterator(){
        return new SongIterator(songs);
    }
    
}
