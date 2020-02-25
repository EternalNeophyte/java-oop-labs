package rpis81.alexandrov.oop.model.floor;

import rpis81.alexandrov.oop.model.space.Space;
import rpis81.alexandrov.oop.model.Vehicle;

public interface Floor {

    boolean addSpace(Space space);
    boolean addSpace(int index, Space space);
    Space getSpace(int index);
    Space getSpace(String registrationNumber);
    boolean hasSpace(String registrationNumber);
    Space replaceWith(int index, Space space);
    Space remove(int index);
    Space remove(String registrationNumber);
    int size();
    Space[] getSpaces();
    Vehicle[] getVehicles();
    boolean checkRegistrationNumber(Space space, String registrationNumber);
}
