
    

class Fraction {

    private int number;
    private int denominator;

    Fraction(int number, int denominator) {
        this.number = number;
        this.denominator = denominator;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setdenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getdenominator() {
        return denominator;
    }

    public String toString() {
        return number + "/" + denominator;
    }

    public void add(Fraction fraction) {
        int sum1 = (number * fraction.getdenominator() + denominator * fraction.getNumber());
        int sum2 = denominator * fraction.getdenominator();
        System.out.println(sum1 + "/" + sum2);
    }

    public void subject(Fraction fraction) {
        int subject1 = (number * fraction.getdenominator() - denominator * fraction.getNumber());
        int subject2 = denominator * fraction.getdenominator();
        System.out.println(subject1 + "/" + subject2);
    }

    public void multiplication(Fraction fraction) {
        int multiplication1 = number * fraction.getNumber();
        int multiplication2 = denominator * fraction.getdenominator();
        System.out.println(multiplication1 + "/" + multiplication2);
    }

    public void division(Fraction fraction) {
        int division1 = number * fraction.getdenominator();
        int division2 = denominator * fraction.getNumber();
        System.out.println(division1 + "/" + division2);
    }

}

public class Problem03 {

    public static void main(String[] args) {
        Fraction obj1 = new Fraction(1, 4);
        Fraction obj2 = new Fraction(3, 5);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        obj1.add(obj2);
        obj1.subject(obj2);
        obj1.multiplication(obj2);
        obj1.division(obj2);
    }
}

