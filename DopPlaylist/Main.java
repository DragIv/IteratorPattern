package DopPlaylist;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ChillMusc chillMusc = new ChillMusc();
        IndieMusc indieMusc = new IndieMusc();

        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
        playlists.add(chillMusc);
        playlists.add(indieMusc);
        Listener listener = new Listener(playlists);
        listener.print();

    }
}
