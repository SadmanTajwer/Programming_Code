package lab2;

import java.util.Scanner;


public class main {
    public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a==b && b==c && c==a)
			{
			System.out.println("The triangle is Equilaterral");	
			}
			else if (a==b || b==c || c==a)
			{
				System.out.println("The triangle is Isosceles");
			}
			else 
			{
				System.out.println("The triangle is Scalene");
			}
		}

}
