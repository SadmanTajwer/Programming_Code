package first1;

public class f1 
{
	public static void main (String args[])
	{ int x , y , z;
	 x=10;
	 y=20;
	 z=3;
	 float avg;
	 avg=(float)(x+y+z)/4;
		System.out.println("average is ="+avg);
	}

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ewufinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mahamudul Hasan
 */
public class EWUFINDER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        int[] arr = new int[10];
        
        arr[0] = 1;
        arr[1] = 2;
        
        hourFinder();
    }
    
    public static void hourFinder() throws FileNotFoundException{
        File fp = new File("F:\\Dropbox\\_01 Teaching\\_______________2021\\00 Fall 2021\\DEPT\\dat.txt");
        File fp2 = new File("F:\\Dropbox\\_01 Teaching\\_______________2021\\00 Fall 2021\\DEPT\\output.csv");
        
        
        Scanner input = new Scanner(fp);
        PrintWriter output = new PrintWriter(fp2);
        
        String[] cutter;
        
        double sum = 0;
        System.out.println("Course Code Number of Student Section Needed Hour Needed");
        output.println("Course Code (with Lab), Number of Student, Section Needed, Hour Needed");
        while(input.hasNext()){
            String str = input.nextLine();
            
            cutter = str.split(",");
            
            //System.out.println(cutter[0]);
            
            //System.out.println(cutter[1]);
            
            double numOfStudent = Double.parseDouble(cutter[1]);
            
            double numOfSection = Math.ceil(numOfStudent / 30);
            
            
           // System.out.println("SECTION NEEDED: "+numOfSection);
            
            double hourNeeded = 0;
            if(cutter[0].equals("CSE103") || cutter[0].equals("CSE110") || cutter[0].equals("CSE246") ||cutter[0].equals("CSE302")){
                hourNeeded = numOfSection * 3;
            }else{
                hourNeeded = numOfSection * 2;
            }
            
            //System.out.println("TIME NEEDED: "+hourNeeded);
            
            sum += hourNeeded;
            //System.out.println(str);
            System.out.print(cutter[0]);
            System.out.print("       ");
            System.out.print(cutter[1]);
            System.out.print("              ");
            System.out.print(numOfSection);
            System.out.print("              ");
            System.out.println(hourNeeded);
            
            
            output.print(cutter[0]);
            output.print(",");
            output.print(cutter[1]);
            output.print(",");
            output.print(numOfSection);
            output.print(",");
            output.println(hourNeeded);
            
        }
        
        System.out.println("Total Hour Needed: "+sum);
        output.println("Total Hour Needed,"+sum);
        output.flush();
        output.close();
        
    }
    
}

