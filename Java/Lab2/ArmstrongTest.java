
package lab2;

import java.util.Scanner;


public class ArmstrongTest {
    public static void main( String args[ ] )
		{
			int r, x, sum;
			System.out.println("Input A number");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			x = n;
			
			sum = 0;
			while( n != 0 )
			{
				r = n % 10;
				sum = sum + ( r * r * r );
				n = n / 10;
			}
			
			if( sum == x )
				System.out.println( " Number " + x + " is a Amstrong Number." );
			else
				System.out.println( " Number " + x + " is NOT a Amstrong Number." );
		}

}
