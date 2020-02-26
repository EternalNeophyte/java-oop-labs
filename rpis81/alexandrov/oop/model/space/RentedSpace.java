package rpis81.alexandrov.oop.model.space;

import rpis81.alexandrov.oop.model.Person;
import rpis81.alexandrov.oop.model.vehicle.Vehicle;

public class RentedSpace extends AbstractSpace {

    public RentedSpace() {
        super();
    }

    public RentedSpace(Person person) {
        super(person);
    }

    public RentedSpace(Vehicle vehicle, Person person) {
        super(vehicle, person);
    }
}
