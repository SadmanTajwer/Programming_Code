
public class Teacher {
    String name , gender;
    int mobile ,age ;
    double national_ID;
    void setInformation(String n,String g, int m, int a, double i)
    {
        name = n;
        gender = g;
        mobile = m;
        age = a;
        national_ID = i;
        
    }
    void displayInformation()
    {
        System.out.println("name = "  +name);
        System.out.println("gender =" +gender);
        System.out.println("age = " +age);
        System.out.println("Mobile = " +mobile);
        System.out.println("National ID = " +national_ID);
    }
}
class property{
    public static void main(String[] args) {
        Teacher teacher2 = new Teacher();
        teacher2.setInformation("shirin Akhter jahan", "female", 45, 1722004427, 345678);
        teacher2.displayInformation();
        System.out.println("");
        Teacher teacher3 = new Teacher();
        teacher3.setInformation("Nafida Mubashshira", "female", 19, 13456784, 99877485);
        teacher3.displayInformation();
        
    }
}
