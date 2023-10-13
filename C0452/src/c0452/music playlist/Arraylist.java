import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Playlist> playlist = new ArrayList<>();
    }
}
//adding into the array
public Playcount findbyplaycount(int playcount)
  {
  for(Playcount playcount: playcounts)
  {
    if(playcount.getPlaycount()==playcount)
      return playcount;
  }
  return null;
//removing from the array
public Playcount remove (int playcount)
  {
  Playcount playcount=findbyplaycount(playcount);
if(playcount!=null)
  playcount.remove(playcount);
else
  System.oout.println("Playcount not found");
  }