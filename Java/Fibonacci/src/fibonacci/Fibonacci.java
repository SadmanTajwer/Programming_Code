/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {

        int n ,sum=0, firstTerm = 0, secondTerm = 1,fibonacci=0;

        Scanner sc = new Scanner(System.in);

 

    System.out.print("Enter the fibonacci number: ");

    n = sc.nextInt();


    System.out.println("Fibonacci Series till " + n + " terms:");


    for (int i = 1; i <= n; ++i) {

      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;

      firstTerm = secondTerm;

      secondTerm = nextTerm;

    }

   

    for (int i = 1; i <= 2 && i <= n; i++) {

    System.out.print("1 ");

    sum += 1;

  }

  for (int i = 3; i <= n; i++) {

   

    sum += fibonacci;

  }

  System.out.println("  average = " + (float)sum/n);

    }
 }