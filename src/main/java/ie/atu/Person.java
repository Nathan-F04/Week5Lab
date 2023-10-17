package ie.atu;

public class Person {

    public Person() {
        this.firstName= "";
        this.lastName = "";
        this.age=0;

    }
    public Person(String lastName,String firstName,int age) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.age=age;

    }

    String firstName;
    String lastName;
    int age;
}
