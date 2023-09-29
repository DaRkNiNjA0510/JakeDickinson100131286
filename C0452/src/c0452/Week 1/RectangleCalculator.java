/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c0452;

/**
 *
 * @author 100131286
 */

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        // Ask user for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask user for input
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();
            // Calculate perimeter and area
            double perimeter = 2 * (length + height);
            double area = length * height;
            // Output results
            System.out.println("The perimeter of the rectangle is: " + perimeter);
            System.out.println("The area of the rectangle is: " + area);
            // Close the scanner
        }
    }
}

   
