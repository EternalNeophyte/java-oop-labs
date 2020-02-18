package rpis81.alexandrov.oop.model;

public class Person {

    private String firstName;
    private String secondName;
    private final static Person UNKNOWN_PERSON = new Person("", "");

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
