package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Person.java
 * This class contains methods for constructing a Person object, getting and setting name, phone number, and city
 * as well as a 'factory method' for creating a 'child' instance
 *
 */

public class Person {

    public String name;
    public String phoneNumber;
    public String city;

    public Person(String name, String phoneNumber, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public static boolean checkSameCity(Person first, Person second) {
        if (first.city.equalsIgnoreCase(second.city)) {
            return true;
        } else {
            return false;
        }
    }

    public static Person registerChild(String name, Person parent) {
        return new Person(name, parent.phoneNumber, parent.city);
    }

    public static void main(String[] args) {
        Person parent = new Person("Hello", "123-456-7890", "World");
        Person someone = new Person("Hi", "000-000-0000", "New York");
        Person child = registerChild("Abc", parent);
        System.out.println(checkSameCity(parent, child));
        System.out.println(checkSameCity(child, someone));
    }

}
