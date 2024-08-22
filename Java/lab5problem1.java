import java.util.Scanner;
    class lab5problem1{
    protected String Icecream_Type;
    protected String icecream_company;
    protected double price;
     void Icm(String IT, String Ic, double p){
        Icecream_Type = IT;
        icecream_company = Ic;
        price = p;
        }
 public double price(){
     return price;
 } 
 public String toString(){
     return "Icecream Type: "+Icecream_Type+" "+icecream_company+"\n price"+price;
 }
}
 class problem1{
     public static String searchBycompany(){
         
         
     }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String arr[];
        arr = new String[5];
        for(int i=0; i<5; i++){
            icecream.Icm()= in.nextString();
        }
        
    }
    
}

