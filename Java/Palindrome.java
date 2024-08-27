/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n, reverse = 0, remainder;

         Scanner reader = new Scanner(System.in);


        System.out.print("Enter a number: ");

        n = reader.nextInt();

    int original = n;

    while (n != 0) {

      remainder = n % 10;

      reverse = reverse * 10 + remainder;

      n /= 10;

    }

    if (original == reverse) {

      System.out.println(original + " is Palindrome.");

    }

    else {

      System.out.println(original + " is not Palindrome.");

    }

    }
    
}