package DopPlaylist;


import java.util.Iterator;

public class ChillMusc implements Playlist{
    static final int MAX_Musc = 4;
    int numberOfItems = 0;
    MuscItem[] items;

    public ChillMusc() {
        items = new MuscItem[MAX_Musc];

        addItem("GONE, GONE / THANK YOU",
                "Tyler, The Creator",  6.15);
        addItem("Fragile",
                "Tatsuro Y",  5.28);
        addItem("In A Manner Of Speaking",
                "Nouvelle Vague, Camille",  3.58);
        addItem("Поэма о родине",
                "Хаски",  2.42);
    }

    public void addItem(String musicTitle, String artist, double duration)
    {
        MuscItem itemsPlaylist = new MuscItem(musicTitle, artist, duration);
        if (numberOfItems >= MAX_Musc) {
            System.err.println("Playlist is full!");
        } else {
            items[numberOfItems] = itemsPlaylist;
            numberOfItems = numberOfItems + 1;
        }
    }


    public Iterator<MuscItem> createIterator() {
        return new ChillMucsIterator(items);
    }
}
