package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person first = new Person("Paul","Lennon",21);
        System.out.println("You entered " + first.firstName + " " + first.lastName + " " + first.age + " ");
        Person second = new Person();
        System.out.println("You entered " + second.firstName + " " + second.lastName + " " + second.age + " ");
        }
    }