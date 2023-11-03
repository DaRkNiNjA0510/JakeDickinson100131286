import java.util.Scanner;
public class Main {
    

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Press 1 to add a song");
            System.out.println("Press 2 to remove a song");
            System.out.println("Press 3 to print the playlist");
            System.out.println("Press 4 to print a list of songs within a given number of plays");
            System.out.println("Press 5 to exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter song name: ");
                    String songName = scanner.next();
                    System.out.println("Enter song artist: ");
                    String artistName = scanner.next();
                    System.out.println("Enter play count: ");
                    int playCount = scanner.nextInt();
                    System.out.println("Song added");
                    // Code to add the song to the playlist
                    break;
                case 2:
                    System.out.println("Enter song name to remove: ");
                    String songToRemove = scanner.next();
                    System.out.println("Enter artist name of the song to remove: ");
                    String artistToRemove = scanner.next();
                    System.out.println("Song removed");
                    // Code to remove the song from the playlist
                    break;
                case 3:
                    System.out.println("Printing the playlist");
                    // Code to print the playlist
                    break;
                case 4:
                    System.out.println("Enter the number of plays: ");
                    int plays = scanner.nextInt();
                    System.out.println("Printing songs within " + plays + " plays");
                    // Code to print a list of songs within a given number of plays
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                break;
            }
        }
    }
}