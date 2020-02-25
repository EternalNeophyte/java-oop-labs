package rpis81.alexandrov.oop.model.space;

import rpis81.alexandrov.oop.model.Person;
import rpis81.alexandrov.oop.model.Vehicle;

public interface Space {

    Vehicle getVehicle();
    void setVehicle(Vehicle vehicle);
    Person getPerson();
    void setPerson(Person person);
    boolean isEmpty();
}
