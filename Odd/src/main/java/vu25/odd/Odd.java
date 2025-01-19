/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu25.odd;

/**
 *
 * @author drggf
 */
import java.util.Scanner;

public class Odd {
    // Data member
    int x;

    // Method to read an integer from the keyboard and determine if it is odd or even
    public void read() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        x = scanner.nextInt();
        
        // Determine if the integer is odd or even
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
        
        scanner.close();
    }

    // Main method to demonstrate the usage of the Odd class
    public static void main(String[] args) {
        Odd oddChecker = new Odd();
        oddChecker.read();
    }
}
