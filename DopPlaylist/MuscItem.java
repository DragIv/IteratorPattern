package DopPlaylist;

public class MuscItem {
    String musicTitle;
    String artist;
    double duration;

    public MuscItem(String musicTitle, String artist, double duration) {
        this.musicTitle = musicTitle;
        this.artist = artist;
        this.duration = duration;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

}
