public class MusicPlayer {
    private boolean isPlaying;
    private int volume;
    public MusicPlayer() {
        isPlaying = false;
        volume = 0;
    }
    public void play() {
        isPlaying = true;
    }
    public void pause() {
        isPlaying = false;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isPlaying() {
        return isPlaying;
    }
    public int getVolume() {
        return volume;
    }
}