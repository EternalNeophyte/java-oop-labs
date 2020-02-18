package rpis81.alexandrov.oop;

import rpis81.alexandrov.oop.model.Person;

public class Test {

    public static void main(String... args) {
        lab1tests();
    }

    public static void lab1tests() {
        Person firstPerson = new Person("Alex", "Lebowski");
        Person secondPerson = new Person("Ivan", "Doolin");
        System.out.println("There are some persons:\n" + firstPerson.getFirstName() + " " +
                firstPerson.getSecondName() + "\n" + secondPerson.getFirstName() + " " + secondPerson.getSecondName());
    }
}
