package DopPlaylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Listener {
    ArrayList<Playlist> playlists;


    public Listener(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void print() {
        for (Playlist pl : playlists) {
            printMenu(pl.createIterator());
        }
    }

    void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MuscItem muscItem = (MuscItem)iterator.next();
            System.out.print(muscItem.getMusicTitle() + ", ");
            System.out.print(muscItem.getArtist() + ", ");
            System.out.println(muscItem.getDuration());
        }
    }
}
