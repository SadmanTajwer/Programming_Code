
package lab2;


public class swap {
    public static void main( String args[ ] )
		{
			int   a, b;

			a = 10;
			b = 20;	

			System.out.print("\nBefore Swapping : " );
			System.out.print( a + "   " + b );

			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.print( "\nAfter Swapping  : " );
			System.out.print( a + "   " + b );
		}

}
