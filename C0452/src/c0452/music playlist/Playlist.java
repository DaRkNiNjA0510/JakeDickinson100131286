import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Playcount> playcounts;

    public Playlist() {
        playcounts = new ArrayList<>();
        addSongs();
    }

    public Playcount findbyplaycount(int playcount) {
        for(Playcount pc : playcounts) {
            if(pc.getPlaycount() == playcount) {
                return pc;
            }
        }
        return null;
    }

    public Playcount remove(int playcount) {
        Playcount pc = findbyplaycount(playcount);
        if(pc != null) {
            playcounts.remove(pc);
        } else {
            System.out.println("Playcount not found");
        }
        return pc;
    }

    public void addSong(Song song) {
        playcounts.add(song);
    }

    private void addSongs() {
        Song song1 = new Song("Sheperd of Fire", "Avenged Sevenfold", 77263614);
        playcounts.add(song1);

        Song song2 = new Song("115", "Elena Siegman", 4,774,120);
        playcounts.add(song2);

        Song song3 = new Song("Blood Code", "La Castle Vania", 3,908,126);
        playcounts.add(song3);

        Song song4 = new Song("Through the Fire and Flames", "DragonForce", 5,046,088);
        playcounts.add(song4);

        Song song5 = new Song("Number of the Beast", "Iron Maiden", 69,361,983);
        playcounts.add(song5);

        Song song6 = new Song("Stricken", "Disturbed", 84,408,636);
        playcounts.add(song6);

        Song song7 = new Song("Cult of Personality", "Living Colour", 69,176,725);
        playcounts.add(song7);

        Song song8 = new Song("Knights of Cydonia", "Muse", 50,076,154);
        playcounts.add(song8);

        Song song9 = new Song("Infinite Ammo", "La Castle Vania", 2,644,536);
        playcounts.add(song9);

        Song song10 = new Song("Carry On", "Avenged Sevenfold", 28,414,528);
        playcounts.add(song10);

      for (int loop=0;loop<=9;loop++)
        {
          Playlist.addsong(songs[loop]);
    }
      return Playlist;
}