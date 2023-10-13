import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MusicMenu menu = new MusicMenu();
        menu.loadPlaylist();
        menu.runMenu();
    }
}