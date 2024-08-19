package lab07;

import java.util.Scanner;

public class Lab07 {

abstract class Shape{
    double Area;
    abstract double Rectanglearea();
    abstract double Squarearea();
    abstract double Circlearea();
    void setArea(double Area){
        this.Area= Area;
    }
    double getArea(){
        return Area;
    }
}

class Area extends Shape{
    double length;
    double breath;
    double side;
    double radius;
    double Rectanglearea(){
        return length*breath;
    }

    double Squarearea(){
        return side*side;
    }
    double Circlearea(){
       return 23.1416*radius; 
    }

}


    class Area {
    public static void main(String[] args) {
        System.out.println("Press (1) for calculating calculating Rectangle Area");
        System.out.println("Press (2) for calculating calculating Square Area");
        System.out.println("Press (3) for calculating calculating Circle Area");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n==1){
            Area rec = new Area();
            rec.length=7;
            rec.breath=9;
            System.out.println("Area og Rectangle: "+rec.Rectanglearea());
            }
        else if(n==2){
            Area sq = new Area();
            sq.side = 3;
            System.out.println("Area of Square: "+sq.Squarearea());
        }
        else if(n==3){
            Area rad = new Area();
            rad.radius = 5;
            System.out.println("Area of Circle: "+rad.Circlearea());
        }

        System.out.println();

    }

}
    }