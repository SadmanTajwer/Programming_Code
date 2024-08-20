
package lab2;

import java.util.Scanner;
public class Lab2 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a>=0 && a<=25)
		{ 
			System.out.println("Students result is grade F");
		}
		else if (a>25 && a<45)
		{
			System.out.println("student Result is grade E");
        }
		else if (a>45 && a<50)
		{
			System.out.println("student Result is grade D");
        }
		else if (a>50 && a<60)
		{
			System.out.println("student Result is grade C");
        }
		else if (a>60 && a<80)
		{
			System.out.println("student Result is grade B");
        }
		else if (a>=80 && a<=100)
		{
			System.out.println("student Result is grade A");
        }
}
    }