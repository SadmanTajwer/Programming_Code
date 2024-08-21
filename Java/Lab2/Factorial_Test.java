
package lab2;

import java.util.Scanner;


public class Factorial_Test {
    public static void main( String args[ ] )
	{
		int i;
		System.out.println("Input a number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int f = 1;
		for( i=n ; i>=1 ; i-- )
		{
			f = f * i ;
		}
		System.out.println( "\n The Factorial of " + n + " is = " + f );
	}

}
