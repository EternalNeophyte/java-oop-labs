package rpis81.alexandrov.oop.model.space;

import rpis81.alexandrov.oop.model.Person;
import rpis81.alexandrov.oop.model.vehicle.Vehicle;

public class OwnedSpace extends AbstractSpace {

    public OwnedSpace() {
        super();
    }

    public OwnedSpace(Person person) {
        super(person);
    }

    public OwnedSpace(Vehicle vehicle, Person person) {
        super(vehicle, person);
    }
}
