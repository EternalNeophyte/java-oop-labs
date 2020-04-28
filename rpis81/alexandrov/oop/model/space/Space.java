package rpis81.alexandrov.oop.model.space;

import rpis81.alexandrov.oop.model.Person;
import rpis81.alexandrov.oop.model.vehicle.Vehicle;

import java.time.LocalDate;
import java.time.Period;

public interface Space {

    Vehicle getVehicle();
    void setVehicle(Vehicle vehicle);
    Person getPerson();
    void setPerson(Person person);
    boolean isEmpty();
    LocalDate getSinceDate();
    void setSinceDate(LocalDate sinceDate);
    Period getPeriod();
    String toString();
    int hashCode();
    boolean equals(Object obj);
    Object clone() throws CloneNotSupportedException;
}