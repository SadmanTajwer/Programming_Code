package javaapplication30;
class calculator {
    int a,b;
    calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    void Add() throws ArithmeticException{
        if(a==0 || b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a+b);
        }
    }
    void Substract() throws ArithmeticException{
        if(a==0 || b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a-b);
        }
    }
     void Multiply() throws ArithmeticException{
        if(a==0 || b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a*b);
        }
    }
      void division() throws ArithmeticException{
        if(a==0 || b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
}

public class JavaApplication30 {

    
    public static void main(String[] args) {
        calculator obj1;
         calculator obj2;
         calculator obj3;
         calculator obj4;
         
         
         try{
             int a =0,b=0;
              a=Integer.parseInt("jhgfk");
              b=Integer.parseInt("5");
              try{
               obj1=new calculator(a,b);
               obj1.Add();
              }catch(ArithmeticException e){
             System.out.println("The Value can't be ZERO");
         }}catch(NumberFormatException e){
                System.out.println("Value is not an INTEGER");
         }
    
      
        try{
              int c=0,d=0;
              c=Integer.parseInt("7");
              d=Integer.parseInt("8"); 
              try{
                  obj2= new calculator(c,d);
                  obj2.Substract();
              }catch(ArithmeticException e){
                   System.out.println("Any Value can't be ZERO");
              }
            }catch(NumberFormatException e){
               System.out.println("Value is not an INTEGER");
                }
       
        try{
             int e=0,f=0;
              e=Integer.parseInt("7");
              f=Integer.parseInt("8"); 
              try{
                  obj3= new calculator(e,f);
                  obj3.Multiply();
              }catch(ArithmeticException eee){
                 System.out.println("Any Value can't be ZERO");
              }
            }catch(NumberFormatException eee){
                System.out.println("Value is not an INTEGER");
                }
        
        
       
        try{
             int g=0,h=0;
              g=Integer.parseInt("0");
              h=Integer.parseInt("7"); 
              try{
                  obj4= new calculator(g,h);
                  obj4.division();
              }catch(ArithmeticException ew){
                   System.out.println("Any Value can't be ZERO");
              }
            }catch(NumberFormatException ew){
              System.out.println("Value is not an INTEGER");
                }
    }
    
}