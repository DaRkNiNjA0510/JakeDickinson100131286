import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private List<Song> songs;
    public Playlist() {
        songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public void printPlaylist() {
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }
    public List<Song> getSongsWithinPlayCount(int playCount) {
        List<Song> filteredSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getPlaycount() <= playCount) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }
}