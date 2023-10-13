//importing scanner class
import java.util.Scanner:

//creating class
public class MusicMenu{

  //creating main method
  public static void main (String[] args){

    //declaring all variables
    int a,b,c;
    int choice
      Scanner scanner= new Scanner (System.in);
    //creating infinite loop
    while(true){

      //creating menu
      System.out.println("press 1 to add song"");
      System.out.println("press 2 to remove song");
  System.out.println("press 3 to print playlist");
      System.out.println("press 4 to print a list of songs within given number of plays");
      System.out.println("press 5 to exit");

      //Asking user to make choice
      System.out.println("Enter your choice");
      choice= scanner.nextInt();

      //Creating switch case branch
      switch (choice){
          //case 1 (adding a song into the playlist)
        case 1:
          System.out.println("Enter song name")
a=scanner.nextInt();
System.out.println("Enter song artist")
  b=scanner.nextInt();
System.out.println("Enter play count")
  c=scanner.nextInt();
  System.out.println("song added");
         break;

          //case 2 (removing a song from playlist)
        case 2:

          System.out.println("Enter song name within the playlist")
 a=scanner.nextInt();          System.out.println("Enter song artist within the playlist")
b=scanner.nextInt();    
System.out.println("song Removed");
break;

//case 3 (printing the playlist)
        case 3:
          
