package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person paulLen = new Person("Paul","Lennon",21);
        System.out.println("You entered " + paulLen.firstName + " " + paulLen.lastName + " " + paulLen.age + " ");
        Person johnJoe = new Person();
        System.out.println("You entered " + johnJoe.firstName + " " + johnJoe.lastName + " " + johnJoe.age + " ");
        }
    }