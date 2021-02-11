package fallmerayer.patterns.composite;

public class Inhalt {
    private String titel, artist, album;
    private int jahr;

    public Inhalt(String titel, String artist, String album, int jahr){
        this.titel = titel;
        this.artist = artist;
        this.album = album;
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "Inhalt{" +
                "titel='" + titel + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + album + '\'' +
                ", jahr='" + jahr + '\'' +
                '}';
    }
}
