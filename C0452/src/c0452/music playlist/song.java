public class Song {

   public String name;
   public String artist;
   public int playcount;

   public Song(String songName, String artistName, int playcount) {
      this.name = songName;
      this.artist = artistName;
      this.playcount = playcount;
   }
   public void setName(String songName) {
      name = songName;
   }
   public String getName() {
      return name;
   }
   public void setArtist(String artistName) {
      artist = artistName;
   }
   public String getArtist() {
      return artist;
   
   }
   public void setLength(int playcount) {
      playcount = playcount;  
   }
   public int playcount() {
      return playcont;
   }

   public String toString() {
      return "Title: " + getName() + ", Artist: " + getArtist() + ", Play Count: " + getplaycount();
   }         

}               