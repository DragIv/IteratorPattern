package DopPlaylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IndieMusc implements Playlist{
    ArrayList<MuscItem> item;

    public IndieMusc() {
        item = new ArrayList<MuscItem>();
        addItem("Sea, Swallow Me","Cocteau Twins",3.09);
        addItem("Where Do U Go","JMSN",3.44);
        addItem("HU Man","Greentea Peng",3.23);
    }

    public void addItem(String musicTitle, String artist, double duration)
    {
        MuscItem menuItem = new MuscItem(musicTitle, artist, duration);
        item.add(menuItem);
    }


    public Iterator<MuscItem> createIterator() {
        return item.iterator();
    }
}
