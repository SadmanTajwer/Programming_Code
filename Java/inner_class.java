
public class Person {
 
    class Address {
        
        String city;
        String state;

        
        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        
        void displayAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }

    
    public static void main(String[] args) {
        
        Person person = new Person();

        
        Person.Address address = person.new Address("New Delhi", "ND");

        
        address.displayAddress();
    }
}
