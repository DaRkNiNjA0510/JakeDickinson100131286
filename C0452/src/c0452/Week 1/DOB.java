


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100131286
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DOB {
  public static void main(String[] args) {
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    try {
      Date date = format.parse("05/10/1998");
      System.out.println(date);
    } catch (ParseException e) {
    }
    // formatting
    System.out.println(format.format(new Date()));
  }
}
    


    
    
    
