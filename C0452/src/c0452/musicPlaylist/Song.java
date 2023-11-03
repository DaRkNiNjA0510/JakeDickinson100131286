public class Song {
    private String name;
    private String artist;
    private int playcount;
    public Song(String name, String artist, int playcount) {
        this.name = name;
        this.artist = artist;
        this.playcount = playcount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }
    public int getPlaycount() {
        return playcount;
    }
    public String toString() {
        return "Title: " + getName() + ", Artist: " + getArtist() + ", Play Count: " + getPlaycount();
    }
}